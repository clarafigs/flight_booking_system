package br.com.cz.reservasDeVoos.Model;

public abstract class Reserva {

    public Passageiro passageiro;
    public IVoo voo;
    public String dataReserva;
    public int assentosReservados;

    public Reserva(Passageiro passageiro, IVoo voo, String dataReserva, int assentosReservados){
        this.passageiro = passageiro;
        this.voo = voo;
        this.dataReserva = dataReserva;
        this.assentosReservados = assentosReservados;
    }
    public abstract void exibirInfo();



}
