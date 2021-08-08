package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Base_De_Datos {

    private final String userName = "root";
    private final String password = "piter0980";
    private final String url = "jdbc:mysql://localhost:3306/practica5";
    private Connection con;

    //Metodo de conexion a la base de datos
    public Connection conectarBaseDeDatos() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(this.url, this.userName, this.password);
            return con;
        } catch (Exception e) {
            return null;
        }
    }

    //Metodo de desconexion de la base de datos con parametros para cada conexion
    public void desconectarBaseDeDatos(Connection con) {
        try {
            con.close();
        } catch (Exception e) {
        }
    }

    //Metodos de insercion de datos a la base de datos en la tabla Servicio
    public boolean insertarDatosEnLaDBServicio(String query, Servicio service) {
        try {
            Connection cn = conectarBaseDeDatos();
            String sentencia = query;
            PreparedStatement statment = cn.prepareStatement(sentencia);
            statment.setString(1, service.getDescripcion());
            statment.setFloat(2, service.getPrecio());
            statment.executeUpdate();
            desconectarBaseDeDatos(cn);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    //Metodos de insercion de datos a la base de datos en la tabla TipoCobro
    public boolean insertarDatosEnLaDBTipo(String query, TipoCobro tipos) {
        try {
            Connection cn = conectarBaseDeDatos();
            String sentencia = query;
            PreparedStatement statment = cn.prepareStatement(sentencia);
            statment.setString(1, tipos.getDescripcion());
            statment.setFloat(2, tipos.getPorDscto());
            statment.executeUpdate();
            desconectarBaseDeDatos(cn);
        } catch (Exception e) {

            return false;
        }
        return true;
    }

    //Metodos de insercion de datos a la base de datos en la tabla Cobro
    public boolean insertarDatosEnLaDBCobro(Cobro cobro) {
        try {
            Connection cn = conectarBaseDeDatos();
            String sentencia1 = "insert INTO cobro(idServicio,idTipoCobro,subtotal,descuento,total)\n"
                    + "SELECT se.idServicio, ti.idTipoCobro,se.precio,\n"
                    + "round(se.precio *ti.porDscto,2) AS Descuento, round(se.precio - (se.precio *ti.porDscto),2)  AS total\n"
                    + "FROM servicio AS se\n"
                    + "INNER JOIN tipocobro AS ti ON se.idServicio = " + cobro.getIdServicio() + " AND ti.idTipoCobro = " + cobro.getIdTipoCobro() + ";";
            PreparedStatement statment = cn.prepareStatement(sentencia1);
//            String[] listaDatos = new String[5];
//            String sentencia1 = "SELECT se.idServicio, ti.idTipoCobro, se.precio\n"
//                    + ",(se.precio *ti.porDscto) AS Descuento, se.precio - (se.precio *ti.porDscto)  AS total\n"
//                    + "FROM servicio AS se\n"
//                    + "INNER JOIN tipocobro AS ti ON se.idServicio = " + cobro.getIdServicio() + "\n"
//                    + "AND ti.idTipoCobro = " + cobro.getIdTipoCobro() + "; ";
//            ResultSet rs = statment.executeQuery();
//            while (rs.next()) {
//                listaDatos[0] = String.valueOf(rs.getInt("idServicio"));
//                listaDatos[1] = String.valueOf(rs.getInt("idTipoCobro"));
//                listaDatos[2] = String.valueOf(rs.getFloat("precio"));
//                listaDatos[3] = String.valueOf(rs.getFloat("Descuento"));
//                listaDatos[4] = String.valueOf(rs.getFloat("total"));
//            }
//
//            int idServ = Integer.parseInt(listaDatos[0]);
//            int idTipo = Integer.parseInt(listaDatos[1]);
//            float subt = Float.parseFloat(listaDatos[2]);
//            float descuento = Float.parseFloat(listaDatos[3]);
//            float total = Float.parseFloat(listaDatos[4]);
//            if (total < 0) {
//                total = 0;
//            }
            statment.executeUpdate();
            desconectarBaseDeDatos(cn); // Terminamos la conexion con la base de Servicio debido a que consume recursos
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    //Metodo de listar datos de la base de datos en un jtable de la tabla Servicio
    public DefaultTableModel listarDatosServicio() {
        try {

            Connection cn = conectarBaseDeDatos(); // Primero establece una conexion con la base de datos 
            String[] reg = new String[3];
            String[] colm = {"idServicio", "descripcion", "precio"};
            String sentencia = "SELECT * FROM servicio"; // Definimos el comando que se ejecutara mediante la conexion a la DB
            PreparedStatement ps;
            ps = cn.prepareStatement(sentencia);
            ResultSet res = ps.executeQuery();
            DefaultTableModel model = new DefaultTableModel(null, colm);
            while (res.next()) {
                reg[0] = res.getString("idServicio");
                reg[1] = res.getString("descripcion");
                reg[2] = res.getString("precio");
                model.addRow(reg);
            }
            desconectarBaseDeDatos(cn); // Terminamos la conexion con la base de datos debido a que consume recursos
            return model;
        } catch (Exception e) {
            return null;
        }
    }

    //Metodo de listar datos de la base de datos en un jtable de la tabla TipoCobro
    public DefaultTableModel listarDatosTipoCobro() {
        try {

            Connection cn = conectarBaseDeDatos(); // Primero establece una conexion con la base de datos 
            String[] reg = new String[3];
            String[] colm = {"idTipoCobro", "descripcion", "porDscto"};
            String sentencia = "SELECT * FROM tipocobro"; // Definimos el comando que se ejecutara mediante la conexion a la DB
            PreparedStatement ps;
            ps = cn.prepareStatement(sentencia);
            ResultSet res = ps.executeQuery();
            DefaultTableModel model = new DefaultTableModel(null, colm);
            while (res.next()) {
                reg[0] = res.getString("idTipoCobro");
                reg[1] = res.getString("descripcion");
                reg[2] = res.getString("porDscto");
                model.addRow(reg);
            }
            desconectarBaseDeDatos(cn); // Terminamos la conexion con la base de datos debido a que consume recursos
            return model;
        } catch (Exception e) {
            return null;
        }
    }

    //Metodo de listar datos de la base de datos en un jtable de la tabla Cobro
    public DefaultTableModel listarDatosCobro() {
        try {

            Connection cn = conectarBaseDeDatos(); // Primero establece una conexion con la base de datos 
            String[] reg = new String[6];
            String[] colm = {"idCobro", "Servicio", "TipoCobro", "subtotal", "descuento", "total"};
            String sentencia = "SELECT c.idCobro, s.descripcion AS Servicio, t.descripcion AS TipoDescuento, \n"
                    + "c.subtotal,c.descuento,c.total FROM cobro AS c\n"
                    + "INNER JOIN servicio AS s ON c.idServicio = s.idServicio\n"
                    + "INNER JOIN tipocobro AS t ON c.idTipoCobro = t.idTipocobro;";
            PreparedStatement ps;
            ps = cn.prepareStatement(sentencia);
            ResultSet res = ps.executeQuery();
            DefaultTableModel model = new DefaultTableModel(null, colm);
            while (res.next()) {
                reg[0] = res.getString("idCobro");
                reg[1] = res.getString("Servicio");
                reg[2] = res.getString("TipoDescuento");
                reg[3] = res.getString("subtotal");
                reg[4] = res.getString("descuento");
                reg[5] = res.getString("total");
                model.addRow(reg);
            }
            desconectarBaseDeDatos(cn); // Terminamos la conexion con la base de datos debido a que consume recursos
            return model;
        } catch (Exception e) {
            return null;
        }
    }

    //Metodo de modificar/actualizar datos de la base de datos
    public boolean ActualizarDatos(String query, int tabla, JTable table) {
        try {
            Connection cn = conectarBaseDeDatos();
            PreparedStatement ps = cn.prepareStatement(query);
            ps.executeUpdate();
            if (tabla == 1) {
                table.setModel(listarDatosServicio());
            }
            if (tabla == 2) {
                table.setModel(listarDatosTipoCobro());
            }
            if (tabla == 3) {
                table.setModel(listarDatosCobro());
            }
            desconectarBaseDeDatos(cn);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    //Metodo que regresa las operaciones de los valores obtenidos de las otras tablas
    public float[] ActualizarDatosCobro(int idSeervi, int idTipo) {
        try {
            String[] listaDatos = new String[2];
            Connection cn = conectarBaseDeDatos();
            String sentencia1 = "SELECT precio,porDscto FROM servicio,tipocobro WHERE idServicio='" + idSeervi + "' AND idTipoCobro='" + idTipo + "'";
            PreparedStatement statment = cn.prepareStatement(sentencia1);
            ResultSet rs = statment.executeQuery();
            while (rs.next()) {

                listaDatos[0] = String.valueOf(rs.getFloat("precio"));
                listaDatos[1] = String.valueOf(rs.getFloat("porDscto"));
            }
            float precio = Float.parseFloat(listaDatos[0]);
            float porDesc = Float.parseFloat(listaDatos[1]);
            float subt = precio;
            float descuento = subt * porDesc;
            float total = subt - descuento;
            float[] resultados = {subt, descuento, total};
            desconectarBaseDeDatos(cn);
            return resultados;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    //Metodo de eliminacion de datos en una tabla
    public void eliminarServicio(String query, int id) {
        try {
            Connection cn = conectarBaseDeDatos();
            PreparedStatement ps = cn.prepareStatement(query + "\n"
                    + "ALTER TABLE servicio AUTO_INCREMENT = 1\n"
                    + "ALTER TABLE tipocobro AUTO_INCREMENT = 1\n"
                    + "ALTER TABLE cobro AUTO_INCREMENT = 1;");

            ps.executeUpdate();
            desconectarBaseDeDatos(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Primero debe de borrar las filas que contengan el id " + id + " en la tabla de cobros\n"
                    + "En la columna de idServicio o idTipoCobro");
        }
    }
}
