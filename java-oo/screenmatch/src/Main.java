import calculos.CalculadoraDeTempo;
import calculos.FiltroRecomendao;
import modelos.Episodio;
import modelos.Filme;
import modelos.Serie;

public class Main {
    public static void main(String[] args) {
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        Filme meuFilme = new Filme("Harry Potter",2006,true,0,0,180,"J. K. Rowling");
        meuFilme.avalia(10);
        meuFilme.avalia(9);
        System.out.println(meuFilme.getDuracaoEmMinutos());

        calculadora.adicionar(meuFilme);

        Serie Supernatural = new Serie("Supernatural",2007,true,0,0,50,15,12,false,50);
        System.out.println(Supernatural.getDuracaoEmMinutos());

        calculadora.adicionar(Supernatural);

        System.out.println("Tempo para maratonar: "+ meuFilme.getNome()+ " e "+Supernatural.getNome()+": "+calculadora.getTempoTotal());

        Episodio ep = new Episodio(1,"Ep 001", Supernatural);

        FiltroRecomendao meuFiltro = new FiltroRecomendao();

        meuFiltro.filtra(ep);
    }
}