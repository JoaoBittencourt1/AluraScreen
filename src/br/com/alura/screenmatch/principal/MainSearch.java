package br.com.alura.screenmatch.principal;


import br.com.alura.screenmatch.modelos.ErroDeConversaoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();
        Scanner input = new Scanner(System.in);

        String busca = " ";
        List<Titulo> titulos = new ArrayList<>();

        while(!busca.equals("sair")) {
            System.out.println("digite um filme para busca: ");
            busca = input.nextLine();

            if(busca.equals("sair")){
                break;
            }
            String endereco = "http://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=cf6b4f27";

            try {
                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);



                // Titulo meuTitulo = gson.fromJson(json, Titulo.class);
                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);
                System.out.println("nome do filme: " + meuTituloOmdb);
                // try{
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println(meuTitulo);
                // FileWriter escrita = new FileWriter("filmes.txt");
                // escrita.write(meuTitulo.toString());
                // escrita.close();

                titulos.add(meuTitulo);

            } catch (NumberFormatException e) {
                System.out.println("aconteceu um erro!");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("algum erro de argumento na busca, verifique se digitou sem espaco");
                System.out.println(e.getMessage());
            } catch (ErroDeConversaoException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titulos);

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println("o programa finalizou corretamente!");
    }
}
