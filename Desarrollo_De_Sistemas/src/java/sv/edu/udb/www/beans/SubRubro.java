/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.www.beans;

/**
 *
 * @author joser
 */
public class SubRubro {
    private int id_subrubro;
    private String subrubro;
    private String descripcion;
    private int id_rubro;

    public int getId_subrubro() {
        return id_subrubro;
    }

    public void setId_subrubro(int id_subrubro) {
        this.id_subrubro = id_subrubro;
    }

    public String getSubrubro() {
        return subrubro;
    }

    public void setSubrubro(String subrubro) {
        this.subrubro = subrubro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_rubro() {
        return id_rubro;
    }

    public void setId_rubro(int id_rubro) {
        this.id_rubro = id_rubro;
    }
    
}
