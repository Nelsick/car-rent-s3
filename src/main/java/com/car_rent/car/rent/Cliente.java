/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.car_rent.car.rent;

public class Cliente {
    private String cedula;
    private String nombre;
    private Boolean vigencia;

    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.vigencia = Boolean.TRUE;
    }
    
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean getVigencia() {
        return vigencia;
    }

    public void setCedula(String cedula) {
        cedula = cedula.toUpperCase();
        String dv = String.valueOf(cedula.charAt(9));
        String valid_dv = "0123456789K";

        if(cedula.length() != 10){
            System.out.println("El largo de la cedula no es válido");
        }
        else if(cedula.charAt(8) != '-'){
            System.out.println("El RUT debe ingresarse con guión");
        }
        else if(!valid_dv.contains(dv)){
            System.out.println("El digito verificador no es correcto");
        }
        else{
            this.cedula = cedula;
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVigencia(Boolean vigencia) {
        this.vigencia = vigencia;
    }

    public void deshabilitar_cliente(){
        this.vigencia = Boolean.FALSE;
    }
    
    @Override
    public String toString() {
        return "Se creo el cliente de rut: " + this.cedula + " de nombre: " + this.nombre + " su estado inicial es: " + this.vigencia;
    }

}
