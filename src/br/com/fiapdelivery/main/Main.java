package br.com.fiapdelivery.main;
import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Moto;
import br.com.fiapdelivery.model.Rota;
import br.com.fiapdelivery.model.Pacote;

public class Main {
    public static void main(String[] args) {
        Caminhao caminhaoUtilizado = new Caminhao("ABC1234", 500, 2);
        System.out.println("Caminhão possui placa: " + caminhaoUtilizado.getPlaca()
        + ", quantidade de eixos: " + caminhaoUtilizado.getEixos() + ", capacidade: " +
                caminhaoUtilizado.getCapacidade());


        Moto motoUtilizada = new Moto("DEF5678", 180, true);
        System.out.println("\r\nMoto possui placa: " + motoUtilizada.getPlaca() + ", capacidade: " +
                motoUtilizada.getCapacidade() + ", possui bau: " + motoUtilizada.hasBau());

        Pacote pacote1 = new Pacote("BR999", 10.5, "pendente");
        System.out.println("\r\nPacote possui código: " + pacote1.getCodigo() +
                ", peso: " + pacote1.getPeso() + ", situação: " + pacote1.getSituacao() + "\r\n");

        Rota rota1 = new Rota(pacote1, caminhaoUtilizado);
        Rota rota2 = new Rota(pacote1, motoUtilizada);

        rota1.envio();
        rota2.envio();
    }
}