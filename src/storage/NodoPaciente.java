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
public class NodoPaciente {
        
    private Paciente paciente;
    private NodoPaciente next;

    public NodoPaciente(Paciente character, NodoPaciente next) {
        this.paciente = character;
        this.next = next;
    }

    public NodoPaciente() {
        this.paciente = null;
        this.next = null;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public NodoPaciente getNext() {
        return next;
    }

    public void setNext(NodoPaciente next) {
        this.next = next;
    }
}
