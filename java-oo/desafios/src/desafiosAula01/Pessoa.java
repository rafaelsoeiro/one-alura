package desafiosAula01;

public class Pessoa {
    private String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public void falaNome(){
        System.out.println("Meu nome é " + nome);
    }
}
