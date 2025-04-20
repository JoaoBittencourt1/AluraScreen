package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {
        if(classificavel.getClassificacao() >= 4){
            System.out.println(" esta entre os preferidos do momento!");
        }
        else if(classificavel.getClassificacao() >= 2){
            System.out.println("muito bem avalidado no momento!");
        }
        else{
            System.out.println("bote na sua lista para assistir depois!");
        }
    }
}
