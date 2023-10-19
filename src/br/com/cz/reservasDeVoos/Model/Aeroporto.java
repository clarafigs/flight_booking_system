package br.com.cz.reservasDeVoos.Model;

import java.util.ArrayList;
import java.util.List;

public class Aeroporto {

    public String nome;
    public String localizacao;

    public List<Voo> ListaVoos;

    public Aeroporto(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.ListaVoos = new ArrayList<>();
    }

    public void adicionarVoo(IVoo voo){
        ListaVoos.add((Voo) voo);
    }

    public Voo buscarVoo(String numeroVoo) {
        for (IVoo voo : ListaVoos) {
            if (voo.getNumeroVoo().equals(numeroVoo)) {
                return (Voo) voo;
            }
        }

        return null;
    }

    public void exibirInfo(){
        System.out.println("Nome do aeroporto: " + nome);
        System.out.println("Localização: " + localizacao);
        System.out.println("\nVoos disponiveis: ");
        for (IVoo voo : ListaVoos) {
            voo.exibirInfo();
        }
    }



}