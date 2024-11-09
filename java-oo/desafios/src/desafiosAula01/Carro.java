package desafiosAula01;

public class Carro {
    private String modelo;
    private int anoLancamento;
    private String cor;

    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.anoLancamento = ano;
        this.cor = cor;
    }

    public void fichaTecnica(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.anoLancamento);
        System.out.println("Cor: " + this.cor);
    }

    public void calculaIdadeCarro(int anoAtual){
        int idadeCarro = anoAtual - this.anoLancamento;
        String aux = idadeCarro > 1 ? " anos." : " ano.";
        System.out.println("O carro possui: " +idadeCarro+aux);
    }
}
