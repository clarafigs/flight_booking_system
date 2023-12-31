package br.com.cz.reservasDeVoos.Main;
import br.com.cz.reservasDeVoos.Model.Aeroporto;
import br.com.cz.reservasDeVoos.Model.Passageiro;
import br.com.cz.reservasDeVoos.Model.Voo;
import br.com.cz.reservasDeVoos.Model.Reserva;

public class Main {
    public static void main(String[] args) {
        Aeroporto aeroporto = new Aeroporto("Aeroporto internacional de Congonhas", "Cidade de São Paulo");


        Voo voo1 = new Voo("V123", "São Paulo", "Londres", "2023-12-20 06:00", "2023-12-21 23:00", 200, 10);
        Voo voo2 = new Voo("V542", "São Paulo", "Rio de Janeiro", "2023-11-25  13:00", "2023-11-25  17:00", 10, 20);

        aeroporto.adicionarVoo(voo1);
        aeroporto.adicionarVoo(voo2);
        aeroporto.exibirInfo();

        String numeroVooBuscado = "V123";
        Voo vooEncontrado = aeroporto.buscarVoo(numeroVooBuscado);

        if (vooEncontrado != null) {
            System.out.println("\n-----------Buscando voo:------------");
            System.out.println("Voo encontrado:");
            vooEncontrado.exibirInfo();
        } else {
            System.out.println("Voo não encontrado.");
        }

        Passageiro passageiro1 = new Passageiro("Maria Clara Figueiredo", 1, "clara@gmail.com");
        Passageiro passageiro2 = new Passageiro("Maria Eduarda de Andrade", 2, "duda@gmail.com");

        passageiro1.fazerReserva(voo2, 25, "2023-11-25");
        passageiro2.fazerReserva(voo1, 3, "2023-12-20");
         System.out.println(voo1.assentosReservados);


        voo1.cancelarReserva(4);
        System.out.println(voo1.assentosReservados);

        voo2.cancelarReserva(1);
        System.out.println("Reserva cancelada");

        voo2.realizarReserva(6);
        voo2.cancelarReserva(22);


        passageiro1.exibirInfo();
        passageiro2.exibirInfo();

    }
}