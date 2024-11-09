package desafiosAula01;

public class Musica {
    private String titulo;
    private String autor;
    private int anoLancamento;
    private double avaliacao;
    private int quantAvaliacoes;

    public Musica(String titulo, String autor, int anoLancamento) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.avaliacao = 0;
        this.quantAvaliacoes = 0;
    }

    public void avaliar(double nota){
        if(quantAvaliacoes == 0){
            avaliacao = nota;
            quantAvaliacoes++;
        }else{
            quantAvaliacoes++;
            avaliacao += nota;
            avaliacao = avaliacao / quantAvaliacoes;
        }
    }

    public void exibirFichaTecnica(){
        System.out.println("Artista: " + this.autor+", Titulo: " + this.titulo+", Ano Lançamento: "+ this.anoLancamento+", Avaliação: "+this.avaliacao+", Total de avaliações: "+this.quantAvaliacoes+".");
    }
}
