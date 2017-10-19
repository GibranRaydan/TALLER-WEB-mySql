/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author LabingXEON
 */
public class UnidadAbstractaInformacion {
    private int id_unidad;
    private int tabla;
    private int id_contexto;

    public UnidadAbstractaInformacion( int tabla, int id_contexto) {
       
        this.tabla = tabla;
        this.id_contexto = id_contexto;
    }

    public int getId_unidad() {
        return id_unidad;
    }

    public void setId_unidad(int id_unidad) {
        this.id_unidad = id_unidad;
    }

    public int getTabla() {
        return tabla;
    }

    public void setTabla(int tabla) {
        this.tabla = tabla;
    }

    public int getId_contexto() {
        return id_contexto;
    }

    public void setId_contexto(int id_contexto) {
        this.id_contexto = id_contexto;
    }

    @Override
    public String toString() {
        return "UnidadAbstractaInformacion{" + "id_unidad=" + id_unidad + ", tabla=" + tabla + ", id_contexto=" + id_contexto + '}';
    }
    
    

    
    
    
}
