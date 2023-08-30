package com.meuprojeto.model;
public class carros {
    private String modelo;
    private String placa;
    private double preco;

    public carros(String modelo, String placa, double preco) {
        this.modelo = modelo;
        this.placa = placa;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
