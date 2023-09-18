package br.com.cz.reservasDeVoos.Model;

public class Reserva {

    public Passageiro passageiro;
    public Voo voo;
    public String dataReserva;
    public int assentosReservados;

    public Reserva(Passageiro passageiro, Voo voo, String dataReserva, int assentosReservados){
        this.passageiro = passageiro;
        this.voo = voo;
        this.dataReserva = dataReserva;
        this.assentosReservados = assentosReservados;
    }

    public void exibirInfo(){
        System.out.println("Passageiro: " + passageiro.getNome());
        System.out.println("Voo: " + voo.getNumeroVoo());
        System.out.println("Data em que foi feita a reserva: " + dataReserva);
        System.out.println("Assentos reservado pelo passageiro: " + assentosReservados);
    }

}
