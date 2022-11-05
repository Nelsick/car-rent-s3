package com.car_rent.car.rent;

import java.time.LocalDate;

public class Devolucion {
    private Arriendo arriendo;
    private LocalDate fec_dev;

    public Devolucion(Arriendo arriendo, LocalDate fec_dev){
        this.arriendo = arriendo;
        this.fec_dev = fec_dev;
    }
}



