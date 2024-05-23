package com.example.demo.empregado;

public record EmpregadoResponseDTO(Long id, String cargo, Float salario, String nome) {
    public EmpregadoResponseDTO(Empregado empregado){
        this(empregado.getId(), empregado.getCargo(),empregado.getSalario(),empregado.getNome());
    }
}