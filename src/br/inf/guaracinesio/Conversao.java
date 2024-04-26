package br.inf.guaracinesio;

import java.io.IOException;

import static br.inf.guaracinesio.Api.getTaxaDeCambio;

public class Conversao {

    private String moedaOrigem;
    private String moedaDestino;
    public double valor;

    public Conversao() throws IOException, InterruptedException {
    }


    public String getMoedaOrigem() {
        return moedaOrigem;
    }

    public void setMoedaOrigem(String moedaOrigem) {
        this.moedaOrigem = moedaOrigem;
    }

    public String getMoedaDestino() {
        return moedaDestino;
    }

    public void setMoedaDestino(String moedaDestino) {
        this.moedaDestino = moedaDestino;
    }
    double taxaDeCambio = getTaxaDeCambio(moedaOrigem, moedaDestino);


    public double calcular(double valor)
    {
        return this.valor * taxaDeCambio;
    }
}