package aula.caua;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        Serie lost = new Serie();

        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);

        Scanner input = new Scanner(System.in);
        meuFilme.setNome("O poderoso chefao");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);



        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("total de avaliacoes: " +meuFilme.getTotalDeAvaliacoes());
        // System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println("media: "+ meuFilme.pegaMedia());


    }
}
