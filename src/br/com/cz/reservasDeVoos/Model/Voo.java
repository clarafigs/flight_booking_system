package br.com.cz.reservasDeVoos.Model;
import java.util.ArrayList;
import java.util.List;

interface IVoo {
    String getNumeroVoo();
    boolean realizarReserva(int numAssentos);

    void cancelarReserva(int numAssentos);

    void exibirInfo();
}
public class Voo implements IVoo{
    public String numeroVoo;
    public String origem;
    public String destino;
    public String dataHoraPartida;
    public String dataHoraChegada;
    public int capacidadePassageiros;
    public int assentosReservados ;

    public Voo (String numeroVoo, String origem, String destino, String dataHoraPartida, String dataHoraChegada, int capacidadePassageiros, int assentosReservados){
        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
        this.dataHoraPartida = dataHoraPartida;
        this.dataHoraChegada = dataHoraChegada;
        if (capacidadePassageiros <= assentosReservados){
            assentosReservados = capacidadePassageiros;
        }
        this.capacidadePassageiros = capacidadePassageiros;
        this.assentosReservados = assentosReservados;
    }

    public void exibirInfo() {
        System.out.println("  Numero do Voo: " + numeroVoo);
        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println("Data e hora de partida: " + dataHoraPartida);
        System.out.println("Data e hora de chegada: " + dataHoraChegada);
        System.out.println("Capacidade de passageiros deste voo: " + capacidadePassageiros);
        System.out.println("Assentos reservados: " + assentosReservados);
    }
    public String getNumeroVoo() {
        return numeroVoo;
    }

    public boolean realizarReserva(int numAssentos){
        if (assentosReservados + numAssentos <= capacidadePassageiros){
            assentosReservados += numAssentos;
            return true;
        } else {
            System.out.println("Nao há assentos disponiveis suficientes!");
            return false;
        }
    }

    public void cancelarReserva(int numAssentos){
        if (assentosReservados >= numAssentos) {
            assentosReservados -= numAssentos;
        } else {
            System.out.println("Numero invalido de assentos para cancelar!");
        }
    }

}









