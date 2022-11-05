package com.car_rent.car.rent;

import java.time.LocalDate;
import java.util.Scanner;

public class Arriendo {
    private Integer num_arr;
    private Vehiculo vehiculo;
    private  Cliente cliente;
    private LocalDate fec_arr;
    private Integer dias_arr;
    private Integer precio_arriendo;

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

    public boolean taken_rent(){
        if(check_rent()){
            this.vehiculo.setCondicion("A");
            return true;
        }else{
            return false;
        }
    }

    public int rent_amount(){
        Scanner myObj = new Scanner(System.in);
        try{
            System.out.println("Ingrese el valor de arriendo: ");
            int precio = myObj.nextInt();
            if(precio < 5000){
                System.out.println("Valor de arriendo no válido - Favor ingresar nuevamente");
                rent_amount();
            }
            int monto = this.dias_arr * precio;
            this.precio_arriendo = precio;
            return monto;
        }
        catch (Exception e){
            System.out.println("Solo se admiten números");
            return -1;
        }
    }

    private Integer mount(){
        return this.precio_arriendo*dias_arr;
    }

    public String rent_ticket(){
        String ticket = "           TICKET ARRIENDO DE VEHÍCULO \n" +
                        "               NÚMERO ARRIENDO:"+ num_arr+"\n"+
                        "               VEHÍCULO       : "+ vehiculo.getPatente()+" "+vehiculo.getMarca()+" "+vehiculo.getModelo()+"\n"+
                        "               PRECIO DIARIO  :"+ this.precio_arriendo+"\n"+
                        "\n"+
                        "FECHA                CLIENTE                DÍAS            A PAGAR \n"+
                        "------------------------------------------------------------------------ \n"+
                        getFec_arr()+"  | "+ getCliente().getCedula() +" / "+ getCliente().getNombre()+" |      "+getDias_arr()+"        |    "+mount()+"\n"+
                        "------------------------------------------------------------------------ \n" +
                        "                                                      __________________ \n" +
                        "                                                         FIRMA CLIENTE";

        return  ticket;
    }

    @Override
    public String toString(){
        return "El vehiculo: " + vehiculo.getPatente() + " se ha reservado correctamente por "+ getDias_arr() + " días a fecha: " + getFec_arr();
    }
}
