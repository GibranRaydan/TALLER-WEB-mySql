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
public class ContextoNavegacion {
    private int id_contexto;
    private String link;
    private int id_modelo;

    public ContextoNavegacion( String link, int id_modelo) {
       
        this.link = link;
        this.id_modelo = id_modelo;
    }

    public int getId_contexto() {
        return id_contexto;
    }

    public void setId_contexto(int id_contexto) {
        this.id_contexto = id_contexto;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }

    @Override
    public String toString() {
        return "ContextoNavegacion{" + "id_contexto=" + id_contexto + ", link=" + link + ", id_modelo=" + id_modelo + '}';
    }
    
    
}
