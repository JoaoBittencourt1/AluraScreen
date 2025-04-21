import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Lost", 2000);
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        Serie lost = new Serie();

       
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("duracao em minutos da serie: " + lost.getDuracaoEmMinutos());



        Scanner input = new Scanner(System.in);
        meuFilme.setNome("O poderoso chefao");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("duracao do filme: " + meuFilme.getDuracaoEmMinutos());



        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("total de avaliacoes: " +meuFilme.getTotalDeAvaliacoes());
        // System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println("media: "+ meuFilme.pegaMedia());

        Filme outroFilme = new Filme("Avatar", 2003);
        outroFilme.setDuracaoEmMinutos(203);

        calculadora.inclui(outroFilme);
        calculadora.inclui(meuFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        ArrayList<Integer> listaDeInt = new ArrayList<>();

        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        listaDeInt.add(10);
        listaDeInt.add(20);

        System.out.println("tamanho da lista de int: " + listaDeInt.size());
        System.out.println("primeiro indice da lista de int: " + listaDeInt.get(0));

        System.out.println("tamanho da lista: " + listaDeFilmes.size());
        System.out.println("primeiro filme da lista: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes.get(0));
        System.out.println(listaDeFilmes);
    }
}
