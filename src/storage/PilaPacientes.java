/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storage;

import examen.p2.Paciente;

/**
 *
 * @author cardonapablo
 */
public class PilaPacientes {
    
    private NodoPaciente top;
    public short length;

    public PilaPacientes() {
        this.top = null;
        this.length = 0;
    }
    
    public void push(Paciente paciente) {
        NodoPaciente newNode = new NodoPaciente(paciente, this.top);
        this.top = newNode;
        this.length++;
    }
    
    public Paciente pop() {
        if(this.isEmpty())
            return null;
        Paciente c = this.top.getPaciente();
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
    
    public Paciente search(String name) {
       
        if(this.isEmpty())
            return null;
        
        NodoPaciente aux = this.top;
        while(aux != null) {
            String cName = aux.getPaciente().getName();
            if(cName.equals(name))
                return aux.getPaciente();
            aux = aux.getNext();
        }
        return null;
    }
    
    public Paciente[] getAllPacientes() {
        Paciente[] pacientes = new Paciente[this.length];
        NodoPaciente aux = this.top;
        for(int i = 0; i < this.length; i++, aux = aux.getNext()) {
            pacientes[i] = aux.getPaciente();
        }
        return pacientes;
    }

    public short getLength() {
        return length;
    }
    
}
