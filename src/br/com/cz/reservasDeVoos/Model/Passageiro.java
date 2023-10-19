package br.com.cz.reservasDeVoos.Model;
import java.util.ArrayList;
import java.util.List;

public class Passageiro extends Pessoa{
    public int id;
    public List<Reserva>reservas;

    public Passageiro(String nome, int id, String email) {
        super(nome, email);
        this.id = id;
        this.reservas = new ArrayList<>();
    }

    public void exibirInfo(){
        System.out.println("\n-------Passageiro:-------");
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
        System.out.println("\nReservas: ");
        for (Reserva reserva : reservas) {
            reserva.exibirInfo();
        }
    }
    public String getNome() {
        return nome;
    }

    public boolean fazerReserva(Voo voo, int numAssentos, String dataReserva){
        if (numAssentos > 0) {
            Reserva reserva = new Reserva(this, voo, dataReserva, numAssentos);
            reservas.add(reserva);
            return true;
        } else {
            System.out.println("Numero invalido de assentos para reservar!");
            return false;
        }
    }

    public void cancelarReserva(Reserva reserva){
        reservas.remove(reserva);
    }
}
