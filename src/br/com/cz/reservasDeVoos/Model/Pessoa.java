package br.com.cz.reservasDeVoos.Model;

public abstract class Pessoa {
    public String nome;
    public String email;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public abstract void exibirInfo();
}
