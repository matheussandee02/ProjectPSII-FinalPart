package com.example.demo.empregado;

public record EmpregadoRequestDTO(String cargo, Float salario, String nome) {
    public EmpregadoRequestDTO(Empregado empregado){
        this(empregado.getCargo(),empregado.getSalario(),empregado.getNome());
    }
}