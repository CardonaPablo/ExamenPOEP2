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
public class PilaRecetas {
    
    private NodoReceta top;
    public short length;

    public PilaRecetas() {
        this.top = null;
        this.length = 0;
    }
    
    public void push(RecetaMedica receta) {
        NodoReceta newNode = new NodoReceta(receta, this.top);
        this.top = newNode;
        this.length++;
    }
    
    public RecetaMedica pop() {
        if(this.isEmpty())
            return null;
        RecetaMedica c = this.top.getReceta();
        this.top = this.top.getNext();
        this.length--;
        return c;
    }
    
    public void clear() {
        this.length = 0;
        this.top = null;
    }
    
    private boolean isEmpty() {
        return this.length == 0 && this.top == null;
    }
    
    public RecetaMedica search(String name) {
       
        if(this.isEmpty())
            return null;
        
        NodoReceta aux = this.top;
        while(aux != null) {
            String cName = aux.getReceta().getCedula();
            if(cName.equals(name))
                return aux.getReceta();
            aux = aux.getNext();
        }
        return null;
    }
    
    public RecetaMedica[] getAllRecetas() {
        RecetaMedica[] recetas = new RecetaMedica[this.length];
        NodoReceta aux = this.top;
        for(int i = 0; i < this.length; i++, aux = aux.getNext()) {
            recetas[i] = aux.getReceta();
        }
        return recetas;
    }

    public short getLength() {
        return length;
    }
}
