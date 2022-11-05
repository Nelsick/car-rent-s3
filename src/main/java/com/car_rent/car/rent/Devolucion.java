package com.car_rent.car.rent;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Devolucion {
    private Arriendo arriendo;
    private String fec_dev;

    public Devolucion(Arriendo arriendo, String fec_dev){
        this.arriendo = arriendo;
        this.fec_dev = fec_dev;
    }

    public Arriendo getArriendo() {
        return arriendo;
    }

    public String getFec_dev() {
        return fec_dev;
    }

    public void setArriendo(Arriendo arriendo) {
        this.arriendo = arriendo;
    }

    public void setFec_dev(String fec_dev) {
        DateTimeFormatter formatted = DateTimeFormatter.ofPattern("yyy-MM-dd");
        LocalDate devuelta = LocalDate.parse(fec_dev, formatted);

        if (getArriendo().getFec_arr().isAfter(devuelta)){
            System.out.println("La fecha de devolución no es válida");
        }else{
            this.fec_dev = fec_dev;
        }
    }

    public boolean car_return(){
        if (this.arriendo.getVehiculo() == getArriendo().getVehiculo()){
            this.arriendo.getVehiculo().setCondicion("D");
            return true;
        } else {
            return false;
        }
    }


    @Override
    public String toString(){
        return "Se ha devuelto el vehículo: " + getArriendo().getVehiculo().getPatente() + " con fecha de devolución: " + fec_dev;
    }


}



