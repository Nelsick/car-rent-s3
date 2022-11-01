/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 * Authors Catalina Vidal - Yiris Majluf
 */

package com.car_rent.car.rent;

public class CarREnt {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("18170778-K","Yiris Majluf","D");
        System.out.println(cliente.toString());

        Vehiculo vehiculo = new Vehiculo( "LYDX-79", "Changan", "New CS15", 2022, "D");
        System.out.println(vehiculo.toString());

    }



}
