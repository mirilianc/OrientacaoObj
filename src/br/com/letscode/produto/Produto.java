package br.com.letscode.produto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Produto {
     public String nomeProduto;
     public float precoProduto;


    public ArrayList<Produto> lerProdutos(){

        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja inserir um nome produto? 1- SIM / 2 - NAO ");
        int resposta = sc.nextInt();
        int i = 0;
        while (resposta == 1)
        {
            Produto produto = new Produto();
            System.out.println("Insira o nome do Produto:");
            produto.nomeProduto =  sc.next();
            System.out.println("Insira o valor do Produto:");
            produto.precoProduto = Float.parseFloat(sc.next());
            listaProdutos.add(produto);
            System.out.println("Deseja inserir um nome produto? 1- SIM /2- NAO ");
            resposta = sc.nextInt();
        }

        return listaProdutos;
    }

    public String obterMaisCaro(ArrayList<Produto> prod)
    {
        String NomeMaisCaro = "";
        float produtoMaisCaro = 0;
        int ponteiro = 0;


        for(int i= 0; i <prod.size(); i++)
        {
            if(prod.get(i).precoProduto > produtoMaisCaro) {
                produtoMaisCaro = prod.get(i).precoProduto;
                ponteiro = i;
            }
        }

        NomeMaisCaro = prod.get(ponteiro).nomeProduto;
        return NomeMaisCaro;

    }

    public String obterMaisBarato(ArrayList<Produto> prod)
    {
        String NomeMaisBarato = "";
        float produtoMaisBarato = prod.get(0).precoProduto ;
        int ponteiro = 0;


        for(int i= 0; i <prod.size(); i++)
        {
            if(prod.get(i).precoProduto < produtoMaisBarato) {
                produtoMaisBarato = prod.get(i).precoProduto;
                ponteiro = i;
            }
        }

        NomeMaisBarato = prod.get(ponteiro).nomeProduto;
        return NomeMaisBarato;

    }



}
