package calculos;

public class FiltroRecomendao {
    public void filtra(Classificavel classificavel){
        if( classificavel.getClassificacao() >= 4){
            System.out.println("Entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado");
        }else {
            System.out.println("Adicione na lista para assistir mais tarde");
        }
    }
}
