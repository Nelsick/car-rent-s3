/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.car_rent.car.rent;

public class Cliente {
            
    private String cedula;
    private String nombre;
    private String vigencia;

    public Cliente(String cedula, String nombre, String vigencia) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.vigencia = vigencia;
    }
    
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }
    
    @Override
    public String toString() {
        return "Se creo el cliente de rut: " + this.cedula + " de nombre: " + this.nombre + " su estado inicial es: " + this.vigencia;
    }
            
}
