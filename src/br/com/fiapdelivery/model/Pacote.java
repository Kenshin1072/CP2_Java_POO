package br.com.fiapdelivery.model;

public class Pacote {
    private String codigo;
    private double peso;
    private String situacao;

    public Pacote(String codigo, double peso, String situacao) {
        this.setCodigo(codigo);
        this.setPeso(peso);
        this.setSituacao(situacao);
    }

    public void muda(String novaSituacao) {
        this.situacao = novaSituacao;
    }

    public String getCodigo() { return this.codigo; }

    private void setCodigo(String codigo) {
        if (codigo != null) {
            this.codigo = codigo;
        } else {
            System.out.println("Erro ao anexar a código!");
        }
    }

    public double getPeso() { return this.peso; }

    private void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSituacao() { return this.situacao; }

    private void setSituacao(String situacao) {
        if (situacao != null && !situacao.trim().isEmpty()) {
            this.situacao = situacao;
        } else {
            this.situacao = "Indefinido";
            System.out.println("Situação anexada como indefinida!");
        }
    }
}