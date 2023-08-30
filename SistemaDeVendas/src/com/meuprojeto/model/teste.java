package com.meuprojeto.model;
public class teste {
    public static void main(String[] args) {
        Pessoa cliente = new Pessoa("João", "123.456.789-00");
        System.out.println("Nome do Cliente: " + cliente.getNome());
        System.out.println("CPF do Cliente: " + cliente.getCpf());

        carros carro = new carros("Sedan", "ABC-1234", 50000.0);
        System.out.println("Modelo do Carro: " + carro.getModelo());
        System.out.println("Placa do Carro: " + carro.getPlaca());
        System.out.println("Preço do Carro: " + carro.getPreco());
    }
}
