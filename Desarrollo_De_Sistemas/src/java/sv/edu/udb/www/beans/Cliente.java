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
public class Cliente {
    private int id_cliente;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String direccion;
    private String dui;
    private int confirmar;
    private String id_confirmar;
    private int id_usuario;
    public int getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDui() {
        return dui;
    }
    public void setDui(String dui) {
        this.dui = dui;
    }
    public int getConfirmar() {
        return confirmar;
    }
    public void setConfirmar(int confirmar) {
        this.confirmar = confirmar;
    }
    public String getId_confirmar() {
        return id_confirmar;
    }
    public void setId_confirmar(String id_confirmar) {
        this.id_confirmar = id_confirmar;
    }
    public int getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }   
}
