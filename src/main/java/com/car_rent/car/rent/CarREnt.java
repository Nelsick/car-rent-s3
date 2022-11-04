/*
 * Authors Catalina Vidal - Yiris Majluf
 */

package com.car_rent.car.rent;

public class CarREnt {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("18170778-K","Yiris Majluf");
        cliente.setCedula("18170778-K");


        Vehiculo vehiculo = new Vehiculo("lydxu-79", "changan", "new cs15", 2022);
        vehiculo.setCondicion("A");
        System.out.println(vehiculo.toString());





    }



}
