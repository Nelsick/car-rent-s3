package com.car_rent.car.rent;

public class Vehiculo {
    private String patente;
    private String marca;
    private String modelo;
    private Integer anio_fabricacion;
    private String condicion;

    public Vehiculo(String patente, String marca, String modelo, Integer anio_fabricacion, String condicion) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.anio_fabricacion = anio_fabricacion;
        this.condicion = condicion;
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
        this.patente = patente;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio_fabricacion(Integer anio_fabricacion) {
        this.anio_fabricacion = anio_fabricacion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }
}
