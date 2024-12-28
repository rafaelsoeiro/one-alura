import calculos.CalculadoraDeTempo;
import calculos.FiltroDeRecomendacao;
import modelos.Episodio;
import modelos.Filme;
import modelos.Serie;

import java.util.ArrayList;

//public class Main {
//    public static void main(String[] args) {
//        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
//
//        Filme HarryPotter = new Filme("Harry Potter",2006,true,0,0,90,"J. K. Rowling");
//        Filme PercyJackson = new Filme("Percy Jackson",2009,true,0,0,85,"Rick Riordan");
//        Filme Hobbit = new Filme("Hobbit",2015,true,0,0,180,"Token");
//        HarryPotter.avalia(10);
//        HarryPotter.avalia(9);
////        System.out.println(HarryPotter.getDuracaoEmMinutos());
//
//        calculadora.adicionar(HarryPotter);
//
//        //Serie Supernatural = new Serie("Supernatural",2007,true,0,0,50,15,12,false,50);
////        System.out.println(Supernatural.getDuracaoEmMinutos());
//
//       // calculadora.adicionar(Supernatural);
//
////        System.out.println("Tempo para maratonar: "+ HarryPotter.getNome()+ " e "+Supernatural.getNome()+": "+calculadora.getTempoTotal());
//
//        //Episodio ep = new Episodio(1,"Ep 001", Supernatural);
//
//        FiltroDeRecomendacao meuFiltro = new FiltroDeRecomendacao();
//
////        meuFiltro.filtra(ep);
//
//        // java listas e coleções
//
//        ArrayList<Filme> filmes = new ArrayList<>();
//        filmes.add(HarryPotter);
//        filmes.add(PercyJackson);
//        filmes.add(Hobbit);
////        System.out.println("Quantidade de filmes: "+filmes.size());
////        System.out.println("Primeiro da lista: "+filmes.get(0).getNome());
//
////        System.out.println(HarryPotter.toString());
//
//        for (Filme filme : filmes) {
//            System.out.println(filme.toString());
//        }
//
//    }
//}