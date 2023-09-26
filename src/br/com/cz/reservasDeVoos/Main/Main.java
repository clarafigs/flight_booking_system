package br.com.cz.reservasDeVoos.Main;

import br.com.cz.reservasDeVoos.Model.Aeroporto;
import br.com.cz.reservasDeVoos.Model.Passageiro;
import br.com.cz.reservasDeVoos.Model.Voo;

public class Main {
    public static void main(String[] args) {
        Aeroporto aeroporto = new Aeroporto("Aeroporto nacional de Congonhas", "Cidade de São Paulo");

        Voo voo1 = new Voo("V123", "São Paulo", "Londres", "2023-12-20  06:00", "2023-12-21  23:00", 200, 0);
        Voo voo2 = new Voo("V542", "São Paulo", "Rio de Janeiro", "2023-11-25  13:00", "2023-11-25  17:00", 170, 0);

        aeroporto.adicionarVoo(voo1);
        aeroporto.adicionarVoo(voo2);

        Passageiro passageiro1 = new Passageiro("Maria Clara Figueiredo", 1, "clara@gmail.com");
        Passageiro passageiro2 = new Passageiro("Maria Eduarda de Andrade", 2, "duda@gmail.com");

        passageiro1.fazerReserva(voo2, 1, "2023-11-25");
        passageiro2.fazerReserva(voo1, 3, "2023-12-20");

        aeroporto.exibirInfo();
        passageiro1.exibirInfo();
        passageiro2.exibirInfo();
    }
}