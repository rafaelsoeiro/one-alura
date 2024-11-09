import desafiosAula01.Calculadora;
import desafiosAula01.Carro;
import desafiosAula01.Musica;
import desafiosAula01.Pessoa;

public class Run {
    public static void main(String[] args) {
        // desafio 1.1
        Pessoa p = new Pessoa("antonio");
        p.falaNome();

        // desafio 1.2
        Calculadora calc = new Calculadora();
        System.out.println(calc.multiplica(10,2));
        // desafio 1.3
        Musica musica = new Musica("Lonely Day", "SOAD", 2001);
        musica.exibirFichaTecnica();
        musica.avaliar(5);
        musica.avaliar(10);
        musica.exibirFichaTecnica();

        // desafio 1.4
        Carro c = new Carro("Fiat Siena",2014, "Branco");
        c.fichaTecnica();
        c.calculaIdadeCarro(2016);

    }
}
