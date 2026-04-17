package br.com.fiapdelivery.model;

public class Rota {
    private Pacote pacote;
    private Veiculo veiculoUtilizado;

    public Rota(Pacote pacote, Veiculo veiculoUtilizado) {
        this.pacote = pacote;
        this.veiculoUtilizado = veiculoUtilizado;
    }

    public void envio(Pacote pacote, Veiculo veiculoUtilizado) {
        System.out.println("Levando pacote" + pacote.codigo + "no veiculo" + veiculoUtilizado.placa);
    }
}