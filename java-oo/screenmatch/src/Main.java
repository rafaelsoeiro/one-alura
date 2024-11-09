import modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Harry Potter",2006,true,184);
        meuFilme.avalia(10);
        meuFilme.avalia(9);
        meuFilme.fichaTecnica();
    }
}
