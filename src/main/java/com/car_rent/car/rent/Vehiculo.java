package com.car_rent.car.rent;

public class Vehiculo {
    private String patente;
    private String marca;
    private String modelo;
    private Integer anio_fabricacion;
    private String condicion;

    public Vehiculo(String patente, String marca, String modelo, Integer anio_fabricacion) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.anio_fabricacion = anio_fabricacion;
        this.condicion = "D";
    }

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAnio_fabricacion() {
        return anio_fabricacion;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setPatente(String patente) {
        patente = patente.toUpperCase();
        if (patente.length() != 8) {
            System.out.println("El largo de la patente no es válido");
        }
        else {
            this.patente = patente;
        }
    }

    public void setMarca(String marca) {
        marca = marca.toUpperCase();
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        modelo = modelo.toUpperCase();
        this.modelo = modelo;
    }

    public void setAnio_fabricacion(Integer anio_fabricacion) {
        if (anio_fabricacion < 2000 || anio_fabricacion > 2022) {
            System.out.println("Año de fabricación inválido");
        }
        else {
            this.anio_fabricacion = anio_fabricacion;
        }
    }

    public void setCondicion(String condicion) {
        condicion = condicion.toUpperCase();

        if (condicion != "D" && condicion != "A" && condicion != "M"){
            System.out.println("Ingrese una condición válida");
        }
        else {
            this.condicion = condicion;
        }
    }

    public void assign_maintenance(){
        if (this.condicion == "D"){
            this.condicion = "M";
        } else {
            System.out.println("El vehículo se encuentra arrendado");
        }
    }


    @Override
    public String toString(){
        return "Vehículo " + getMarca() + " de patente: " + getPatente() + " en estado: " + getCondicion();
    }
}


/*holanda*/