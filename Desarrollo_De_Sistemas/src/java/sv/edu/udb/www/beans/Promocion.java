/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.www.beans;

import java.util.Date;

/**
 *
 * @author joser
 */
public class Promocion {
    private int id_promocion;
    private String nombre;
    private Date fecha_inico;
    private Date fecha_fin;
    private String precio_oferta;
    private String descripcion;
    private int id_articulo;
    public int getId_promocion() {
        return id_promocion;
    }

    public void setId_promocion(int id_promocion) {
        this.id_promocion = id_promocion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_inico() {
        return fecha_inico;
    }

    public void setFecha_inico(Date fecha_inico) {
        this.fecha_inico = fecha_inico;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getPrecio_oferta() {
        return precio_oferta;
    }

    public void setPrecio_oferta(String precio_oferta) {
        this.precio_oferta = precio_oferta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(int id_articulo) {
        this.id_articulo = id_articulo;
    }
 
}
