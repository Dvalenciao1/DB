package clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cobro {

    private int idServicio;
    private int idTipoCobro;

    public Cobro(int idServicio, int idTipoCobro) {
        this.idServicio = idServicio;
        this.idTipoCobro = idTipoCobro;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public int getIdTipoCobro() {
        return idTipoCobro;
    }

    public void setIdTipoCobro(int idTipoCobro) {
        this.idTipoCobro = idTipoCobro;
    }

    public int validacioniDService() {
        String idServicio = String.valueOf(this.idServicio);
        Pattern codigo = Pattern.compile("^([1-9][0-9]*)$");
        Matcher result = codigo.matcher(idServicio);
        boolean response = result.matches();
        if (!response) {
            return 1;
        } else {
            return 0;
        }
    }

    public int validacioniDType() {
        String idTipoCobro = String.valueOf(this.idTipoCobro);
        Pattern codigo = Pattern.compile("^([1-9][0-9]*)$");
        Matcher result = codigo.matcher(idTipoCobro);
        boolean response = result.matches();
        if (!response) {
            return 2;
        } else {
            return 0;
        }
    }
}
