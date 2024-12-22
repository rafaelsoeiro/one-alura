package calculos;
import modelos.Filme;
import modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public CalculadoraDeTempo() {
        this.tempoTotal = 0;
    }

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void adicionar(Titulo t) {
        tempoTotal+= t.getDuracaoEmMinutos();
    }
}
