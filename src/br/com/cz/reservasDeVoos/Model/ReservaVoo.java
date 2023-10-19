package br.com.cz.reservasDeVoos.Model;

public class ReservaVoo extends Reserva {
    public ReservaVoo(Passageiro passageiro, IVoo voo, String dataReserva, int assentosReservados) {
        super(passageiro, voo, dataReserva, assentosReservados);
    }

    public void exibirInfo() {
        System.out.println("Reserva de Voo:");
        System.out.println("Passageiro: " + passageiro.nome);
        System.out.println("Voo: " + voo.getNumeroVoo());
        System.out.println("Data em que foi feita a reserva: " + dataReserva);
        System.out.println("Assentos reservados pelo passageiro: " + assentosReservados);
    }
}
