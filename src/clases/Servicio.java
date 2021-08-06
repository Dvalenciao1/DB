package clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Servicio {

    private String descripcion;
    private float precio;

    public Servicio(String descripcion, float precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int validacionDescripcion() {
        Pattern codigo = Pattern.compile("^([A-Z]{1}[a-z]+([ ][a-z]+)*)$");
        Matcher result = codigo.matcher(descripcion);
        boolean response = result.matches();
        if (!response) {
            return 1;
        } else {
            return 0;
        }
    }

    public int validacionPrecio() {
        String precio = String.valueOf(this.precio);
        Pattern codigo = Pattern.compile("^([0-9]|[1-9][0-9]*)(\\.)(0?[0-9]{1,2}|[1-9][0-9]{0,1})$");
        Matcher result = codigo.matcher(precio);
        boolean response = result.matches();
        if (!response) {
            return 2;
        } else {
            return 0;
        }
    }

}
