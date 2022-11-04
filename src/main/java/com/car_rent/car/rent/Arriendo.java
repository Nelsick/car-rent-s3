package com.car_rent.car.rent;

import java.time.LocalDate;

public class Arriendo {
    private Integer num_arr;
    private Vehiculo vehiculo;
    private  Cliente cliente;
    private LocalDate fec_arr;
    private Integer dias_arr;

    public Arriendo(Integer num_arr, Vehiculo vehiculo, Cliente cliente, LocalDate fec_arr, Integer dias_arr) {
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

    public LocalDate getFec_arr() {
        return fec_arr;
    }

    public void setFec_arr(LocalDate fec_arr) {
        this.fec_arr = fec_arr;
    }

    public Integer getDias_arr() {
        return dias_arr;
    }

    public void setDias_arr(Integer dias_arr) {
        this.dias_arr = dias_arr;
    }

    public boolean check_rent(){
        if(this.cliente.getVigencia() && (this.vehiculo.getCondicion() == "D")){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "El vehiculo: " + vehiculo.getPatente() + " se ha reservado correctamente por "+ getDias_arr() + " días a fecha: " + getFec_arr();
    }
}
