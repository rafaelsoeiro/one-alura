package modelos;

public class Filme {
    private String nome;
    private int anoLancamento;
    private boolean inclusoNoPlano;
    private int totalAvaliacoes;
    private double somaDasAvaliacoes;
    private int duracaoEmMinutos;

    public Filme(String nome, int anoLancamento, boolean inclusoNoPlano, int duracaoEmMinutos ) {
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.totalAvaliacoes = 0;
        this.inclusoNoPlano = inclusoNoPlano;
        this.anoLancamento = anoLancamento;
        this.nome = nome;
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

    // getters e setters

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