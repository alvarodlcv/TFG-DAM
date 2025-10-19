/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tfg;

/**
 *
 * @author Álvaro
 */
public class Cliente {

    private String id;
    private String nombreC;
    private String apellido1C;
    private String apellido2C;
    private int telefonoC;
    private String dniC;
    private String direccionC;
    private String correoC;
    private int cochesPropC;
    private String conocisteC;

    // Constructor
    public Cliente(String id, String nombreC, String apellido1C, String apellido2C, int telefonoC, String dniC, String direccionC, String correoC, int cochesPropC, String conocisteC) {
        this.id = id;
        this.nombreC = nombreC;
        this.apellido1C = apellido1C;
        this.apellido2C = apellido2C;
        this.telefonoC = telefonoC;
        this.dniC = dniC;
        this.direccionC = direccionC;
        this.correoC = correoC;
        this.cochesPropC = cochesPropC;
        this.conocisteC = conocisteC;
    }

      public Cliente(String nombreC, String apellido1C, String apellido2C, int telefonoC, String dniC, String direccionC, String correoC, int cochesPropC, String conocisteC) {
        this.nombreC = nombreC;
        this.apellido1C = apellido1C;
        this.apellido2C = apellido2C;
        this.telefonoC = telefonoC;
        this.dniC = dniC;
        this.direccionC = direccionC;
        this.correoC = correoC;
        this.cochesPropC = cochesPropC;
        this.conocisteC = conocisteC;
    }
      
       public Cliente(){
        this.nombreC = "";
        this.apellido1C = "";
        this.apellido2C = "";
        this.telefonoC = 0;
        this.dniC = "";
        this.direccionC = "";
        this.correoC = "";
        this.cochesPropC = 0;
        this.conocisteC = "";
    }
    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getApellido1C() {
        return apellido1C;
    }

    public void setApellido1C(String apellido1C) {
        this.apellido1C = apellido1C;
    }

    public String getApellido2C() {
        return apellido2C;
    }

    public void setApellido2C(String apellido2C) {
        this.apellido2C = apellido2C;
    }

    public int getTelefonoC() {
        return telefonoC;
    }

    public void setTelefonoC(int telefonoC) {
        this.telefonoC = telefonoC;
    }

    public String getDniC() {
        return dniC;
    }

    public void setDniC(String dniC) {
        this.dniC = dniC;
    }

    public String getDireccionC() {
        return direccionC;
    }

    public void setDireccionC(String direccionC) {
        this.direccionC = direccionC;
    }

    public String getCorreoC() {
        return correoC;
    }

    public void setCorreoC(String correoC) {
        this.correoC = correoC;
    }

    public int getCochesPropC() {
        return cochesPropC;
    }

    public void setCochesPropC(int cochesPropC) {
        this.cochesPropC = cochesPropC;
    }

    public String getConocisteC() {
        return conocisteC;
    }

    public void setConocisteC(String conocisteC) {
        this.conocisteC = conocisteC;
    }

    // toString
    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", nombreC='" + nombreC + '\'' +
                ", apellido1C='" + apellido1C + '\'' +
                ", apellido2C='" + apellido2C + '\'' +
                ", telefonoC=" + telefonoC +
                ", dniC='" + dniC + '\'' +
                ", direccionC='" + direccionC + '\'' +
                ", correoC='" + correoC + '\'' +
                ", cochesPropC='" + cochesPropC + '\'' +
                ", conocisteC='" + conocisteC + '\'' +
                '}';
    }
}

