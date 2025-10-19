/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tfg;

/**
 *
 * @author Álvaro
 */
public class Vehiculo {

    private String id; 
    private String marcaV;
    private String modeloV;
    private String añoV;
    private int kilometrajeV;
    private String itvV;
    private String colorV;
    private String matriculaV;
    private String propietarioV;
    private String servicioV;

    // Constructor con todos los campos incluyendo el id
    public Vehiculo(String id, String marcaV, String modeloV, String añoV, int kilometrajeV, String itvV, String colorV, String matriculaV, String propietarioV, String servicioV) {
        this.id = id;
        this.marcaV = marcaV;
        this.modeloV = modeloV;
        this.añoV = añoV;
        this.kilometrajeV = kilometrajeV;
        this.itvV = itvV;
        this.colorV = colorV;
        this.matriculaV = matriculaV;
        this.propietarioV = propietarioV;
        this.servicioV = servicioV;
    }

    // Constructor vacío
    public Vehiculo() {
        this.id = "";
        this.marcaV = "";
        this.modeloV = "";
        this.añoV = "";
        this.kilometrajeV = 0;
        this.itvV = "";
        this.colorV = "";
        this.matriculaV = "";
        this.propietarioV = "";
        this.servicioV = "";
    

    }
    // Getters y Setters

    Vehiculo(String marca, String modelo, String año, int kilometraje, String itv, String color, String matricula, String propietario, String servicio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getMarcaV() {
        return marcaV;
    }

    public void setMarcaV(String marcaV) {
        this.marcaV = marcaV;
    }

    public String getModeloV() {
        return modeloV;
    }

    public void setModeloV(String modeloV) {
        this.modeloV = modeloV;
    }

    public String getAñoV() {
        return añoV;
    }

    public void setAñoV(String añoV) {
        this.añoV = añoV;
    }

    public int getKilometrajeV() {
        return kilometrajeV;
    }

    public void setKilometrajeV(int kilometrajeV) {
        this.kilometrajeV = kilometrajeV;
    }

    public String getItvV() {
        return itvV;
    }

    public void setItvV(String itvV) {
        this.itvV = itvV;
    }

    public String getColorV() {
        return colorV;
    }

    public void setColorV(String colorV) {
        this.colorV = colorV;
    }

    public String getMatriculaV() {
        return matriculaV;
    }

    public void setMatriculaV(String matriculaV) {
        this.matriculaV = matriculaV;
    }

    public String getPropietarioV() {
        return propietarioV;
    }

    public void setPropietarioV(String propietarioV) {
        this.propietarioV = propietarioV;
    }

    public String getServicioV() {
        return servicioV;
    }

    public void setServicioV(String servicioV) {
        this.servicioV = servicioV;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id='" + id + '\'' +
                ", marcaV='" + marcaV + '\'' +
                ", modeloV='" + modeloV + '\'' +
                ", añoV=" + añoV +
                ", kilometrajeV=" + kilometrajeV +
                ", itvV='" + itvV + '\'' +
                ", colorV='" + colorV + '\'' +
                ", matriculaV='" + matriculaV + '\'' +
                ", propietarioV='" + propietarioV + '\'' +
                ", servicioV=" + servicioV +
                '}';
}
}