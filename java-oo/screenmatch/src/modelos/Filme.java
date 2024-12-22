package modelos;

import calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String Diretor;

    public Filme(String nome, int anoLancamento, boolean inclusoNoPlano, double somaDasAvaliacoes, int totalAvaliacoes, int duracaoEmMinutos, String diretor) {
        super(nome, anoLancamento, inclusoNoPlano, somaDasAvaliacoes, totalAvaliacoes, duracaoEmMinutos);
        Diretor = diretor;
    }

    // getters e setters

    public int getClassificacao() {
        return (int) calculaMediaAvaliacoes() /2 ;
    }

    public String getDiretor() {
        return Diretor;
    }

    public void setDiretor(String diretor) {
        Diretor = diretor;
    }
}