package modelos;

public class Titulo {
    private String nome;
    private int anoLancamento;
    private boolean inclusoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoLancamento, boolean inclusoNoPlano, double somaDasAvaliacoes, int totalAvaliacoes, int duracaoEmMinutos) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.inclusoNoPlano = inclusoNoPlano;
        this.somaDasAvaliacoes = somaDasAvaliacoes;
        this.totalAvaliacoes = totalAvaliacoes;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void avalia(double nota){
        this.totalAvaliacoes++;
        this.somaDasAvaliacoes += nota;
    }

    public void fichaTecnica() {
        System.out.println("Titulo='" + nome + '\'' +
                ", Ano Lancamento= " + anoLancamento +
                ", Incluso no Plano= " + inclusoNoPlano +
                ", Media das Avaliacoes= " + calculaMediaAvaliacoes() +
                ", Duracao em Minutos= " + duracaoEmMinutos + ".");
    }

    public double calculaMediaAvaliacoes(){
        if ( totalAvaliacoes == 0 ) {
            return 0;
        }else {
            return (double) this.somaDasAvaliacoes / this.totalAvaliacoes;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isInclusoNoPlano() {
        return inclusoNoPlano;
    }

    public void setInclusoNoPlano(boolean inclusoNoPlano) {
        this.inclusoNoPlano = inclusoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}
