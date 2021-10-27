/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.p2;

/**
 *
 * @author cardonapablo
 */
public class Paciente {
    
    private String name;
    private byte   edad;
    private char   genero;
    private String nss;

    public Paciente(String name, byte edad, char genero, String nss) {
        this.name = name;
        this.edad = edad;
        this.genero = genero;
        this.nss = nss;
    }

    public Paciente() {
        this.name = "";
        this.edad = 0;
        this.genero = 'M';
        this.nss = "N/A";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }


    
}
