/*
 * Authors Catalina Vidal - Yiris Majluf
 */

package com.car_rent.car.rent;

import java.time.LocalDate;


public class CarREnt {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("18170778-K","Yiris Majluf");
        Vehiculo vehiculo = new Vehiculo("LYDX-79","CHANGAN","NEW CS15",2022);
        Arriendo changan = new Arriendo(1,vehiculo,cliente, LocalDate.now(),3);

        /*
        System.out.println(vehiculo.toString());
        System.out.println(changan.taken_rent());
        System.out.println(vehiculo.toString());
        int valor_arriendo = changan.rent_amount();
        System.out.println(valor_arriendo);
        System.out.println(changan.rent_ticket());
         */

        Devolucion devolucion = new Devolucion(changan, "2022-11-03");
        System.out.println(devolucion.toString());

        devolucion.setFec_dev("2022-11-02");
        System.out.println(devolucion.toString());

        System.out.println(devolucion.car_return());



    }
}
