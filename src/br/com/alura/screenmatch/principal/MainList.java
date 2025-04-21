package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;


public class MainList {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefao", 1970);
        Filme outroFilme = new Filme("Avatar", 2003);
        var filmeDoPaulo = new Filme("dogville", 2003);

        Serie lost = new Serie("Lost", 2003);

        ArrayList<Titulo> lista = new ArrayList<>();
        ArrayList<Integer> listaDeInt = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista){
            System.out.println(item);
        }



    }
}
