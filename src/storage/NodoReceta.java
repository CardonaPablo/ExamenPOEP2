/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storage;

import examen.p2.RecetaMedica;

/**
 *
 * @author cardonapablo
 */
public class NodoReceta {
        
    private RecetaMedica receta;
    private NodoReceta next;

    public NodoReceta(RecetaMedica character, NodoReceta next) {
        this.receta = character;
        this.next = next;
    }

    public NodoReceta() {
        this.receta = null;
        this.next = null;
    }

    public RecetaMedica getReceta() {
        return receta;
    }

    public void setReceta(RecetaMedica receta) {
        this.receta = receta;
    }

    public NodoReceta getNext() {
        return next;
    }

    public void setNext(NodoReceta next) {
        this.next = next;
    }
}
