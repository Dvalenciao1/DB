/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author daniel
 */
public class TipoCobro {

    private String descripcion;
    private float porDscto;

    public TipoCobro(String descripcion, float porDscto) {
        this.descripcion = descripcion;
        this.porDscto = porDscto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPorDscto() {
        return porDscto;
    }

    public void setPorDscto(float porDscto) {
        this.porDscto = porDscto;
    }

    public int validacionDescripcion() {
        Pattern codigo = Pattern.compile("^([A-Z]{1}[a-z]+([ ][a-z]+)*)$");
        Matcher result = codigo.matcher(this.descripcion);
        boolean response = result.matches();
        if (!response) {
            return 1;
        } else {
            return 0;
        }
    }

    public int validacionporDesct() {
        String porDesc = String.valueOf(this.porDscto);
        Pattern codigo = Pattern.compile("^([0-9]|[1-9][0-9]*)(\\.)(0?[0-9]{1,2}|[1-9][0-9]{0,1})$");
        Matcher result = codigo.matcher(porDesc);
        boolean response = result.matches();
        if (!response) {
            return 1;
        } else {
            return 0;
        }
    }
}
