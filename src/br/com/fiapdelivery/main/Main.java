package br.com.fiapdelivery.main;
import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Moto;
import br.com.fiapdelivery.model.Rota;
import br.com.fiapdelivery.model.Pacote;

public class Main {
    public static void main(String[] args) {
        Caminhao caminhaoUtilizado = new Caminhao("ABC1234", 500, 2);
        Moto motoUtilizada = new Moto("DEF5678", 180, true);

        Pacote pacote1 = new Pacote("BR999", 10.5, "pendente");

        Rota rota1 = new Rota(pacote1, caminhaoUtilizado);
        Rota rota2 = new Rota(pacote1, motoUtilizada);


    }
}