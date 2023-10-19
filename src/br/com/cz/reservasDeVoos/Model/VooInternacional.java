package br.com.cz.reservasDeVoos.Model;

public class VooInternacional extends Voo {
    private String paisDestino;

    public VooInternacional(String numeroVoo, String origem, String destino, String dataHoraPartida, String dataHoraChegada,
                            int capacidadePassageiros, int assentosReservados, String paisDestino) {
        super(numeroVoo, origem, destino, dataHoraPartida, dataHoraChegada, capacidadePassageiros, assentosReservados);
        this.paisDestino = paisDestino;
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("País de destino: " + paisDestino);
    }
}







