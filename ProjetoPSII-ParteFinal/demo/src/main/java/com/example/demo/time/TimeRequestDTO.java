package com.example.demo.time;

public record TimeRequestDTO(String nome, Integer anofundacao, String cidade, String estado) {
    public TimeRequestDTO(Time time){
        this(time.getNome(), time.getAnofundacao(), time.getCidade(), time.getEstado());
    }
}