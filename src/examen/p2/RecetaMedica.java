/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.p2;

/**
 *
 * @author cardonapablo
 */
public class RecetaMedica {
    
    private String  folio;
    private String  description;
    private String  cedula;
    private boolean controlada;

    public RecetaMedica(String folio, String description, String cedula, boolean controlada) {
        this.folio = folio;
        this.description = description;
        this.cedula = cedula;
        this.controlada = controlada;
    }

    public RecetaMedica() {
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public boolean isControlada() {
        return controlada;
    }

    public void setControlada(boolean controlada) {
        this.controlada = controlada;
    }
    
    
}
