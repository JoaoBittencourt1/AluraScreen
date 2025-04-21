package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class MainList {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefao", 1970);
        Filme outroFilme = new Filme("Avatar", 2003);
        var filmeDoPaulo = new Filme("dogville", 2003);
        meuFilme.avalia(9);
        outroFilme.avalia(10);
        filmeDoPaulo.avalia(2);

        Serie lost = new Serie("Lost", 2003);

        ArrayList<Titulo> lista = new ArrayList<>();
        ArrayList<Integer> listaDeInt = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista){
            System.out.println("nome do filme: " +item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println(" " + filme.getClassificacao());
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();

        buscaPorArtista.add("Adan Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("depois da ordecao: " + buscaPorArtista);

        System.out.println("lista de titulos ordenados: ");
        Collections.sort(lista);
        System.out.println(lista);



    }
}
