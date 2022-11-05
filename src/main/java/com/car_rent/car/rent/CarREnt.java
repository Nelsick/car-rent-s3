/*
 * Authors Catalina Vidal - Yiris Majluf
 */

package com.car_rent.car.rent;

import java.time.LocalDate;


public class CarREnt {

    public static void main(String[] args) {
        //Validación de la creación del cliente y sus metodos
        Cliente cliente = new Cliente("18170778-K","Yiris Majluf");
        //Validación del metodo setCedula
        cliente.setCedula("181707733");
        cliente.setCedula("18123862-T");
        cliente.setCedula("181707780K");
        cliente.setCedula("18123862-3");
        //Validación del metodo para deshabilitar
        cliente.deshabilitar_cliente();
        //Presentación del cliente
        System.out.println(cliente.toString());

        //Valicación de la clase vehiculo
        Vehiculo vehiculo = new Vehiculo("LYDX-79","CHANGAN","NEW CS15",2022);
        //Validación del metodo setPatente
        vehiculo.setPatente("ASDF");
        vehiculo.setPatente("TRFGDS-9");
        //Validación del metodo setAnio
        vehiculo.setAnio_fabricacion(1999);
        vehiculo.setAnio_fabricacion(2021);
        //Validación del metodo asignar mantenimiento
        vehiculo.assign_maintenance();
        System.out.println(vehiculo.toString());

        //Creación de un nuevo arriendo
        Arriendo changan = new Arriendo(1,vehiculo,cliente, LocalDate.now(),3);
        //Validación del metodo reservar vehiculo
        System.out.println(changan.taken_rent());
        System.out.println(vehiculo.toString());
        //Validación del metodo para obtener valor de renta
        int valor_arriendo = changan.rent_amount();
        System.out.println(valor_arriendo);
        //Generación de ticket de arriendo
        System.out.println(changan.rent_ticket());

        //Crear una devolución
        Devolucion devolucion = new Devolucion(changan, "2022-11-03");
        System.out.println(devolucion.toString());

        //Validación del metodo para validar fecha
        devolucion.setFec_dev("2022-11-02");
        System.out.println(devolucion.toString());

        //Devolución del vehiculo
        System.out.println(devolucion.car_return());

    }
}
