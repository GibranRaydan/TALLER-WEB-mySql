/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author LabingXEON
 */
public class ModeloNavegacion {
    private int id_modelo;
    private String nombre;

    public ModeloNavegacion( String nombre) {
        
        this.nombre = nombre;
    }

    public int getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "ModeloNavegacion{" + "id_modelo=" + id_modelo + ", nombre=" + nombre + '}';
    }
    
    
}
