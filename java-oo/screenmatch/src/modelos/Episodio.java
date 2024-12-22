package modelos;

import calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String Nome;
    private Serie serie;
    private int totalvisualizacoes;
    public Episodio(int numero, String nome, Serie serie) {
        this.numero = numero;
        Nome = nome;
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if(totalvisualizacoes>100){
            return 4;
        }else {
            return 2;
        }
    }
}
