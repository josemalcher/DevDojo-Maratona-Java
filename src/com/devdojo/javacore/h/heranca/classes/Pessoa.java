package com.devdojo.javacore.h.heranca.classes;

public class Pessoa {
    protected String nome;
    private String cpf;
    private Endereco endereco;

    public void imprime(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Endereço: " + this.getEndereco().getRua());
        System.out.println("Endereço: " + this.getEndereco().getBairro());

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
