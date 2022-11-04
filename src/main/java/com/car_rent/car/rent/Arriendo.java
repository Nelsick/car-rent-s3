package com.car_rent.car.rent;

import java.util.Date;

public class Arriendo {
    private Integer num_arr;
    private Vehiculo vehiculo;
    private  Cliente cliente;
    private Date fec_arr;
    private Integer dias_arr;

    public Arriendo(Integer num_arr, Vehiculo vehiculo, Cliente cliente, Date fec_arr, Integer dias_arr) {
        this.num_arr = num_arr;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.fec_arr = fec_arr;
        this.dias_arr = dias_arr;
    }

    public Integer getNum_arr() {
        return num_arr;
    }

    public void setNum_arr(Integer num_arr) {
        this.num_arr = num_arr;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFec_arr() {
        return fec_arr;
    }

    public void setFec_arr(Date fec_arr) {
        this.fec_arr = fec_arr;
    }

    public Integer getDias_arr() {
        return dias_arr;
    }

    public void setDias_arr(Integer dias_arr) {
        this.dias_arr = dias_arr;
    }
}
