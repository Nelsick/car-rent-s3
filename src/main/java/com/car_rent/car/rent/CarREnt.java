/*
 * Authors Catalina Vidal - Yiris Majluf
 */

package com.car_rent.car.rent;

import java.time.LocalDate;

public class CarREnt {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("18170778-K","Yiris Majluf");
        Vehiculo vehiculo = new Vehiculo("LYDX-79","CHANGAN","NEW CS15",2022,"D");
        Arriendo arriendo = new Arriendo(1,vehiculo,cliente, LocalDate.now(),3);
        System.out.println(arriendo.check_rent());
        System.out.println(arriendo.toString());
    }
}
