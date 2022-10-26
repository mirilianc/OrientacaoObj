package br.com.letscode.principal;

import br.com.letscode.produto.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
        Produto produtoResul = new Produto();
        listaProdutos = produtoResul.lerProdutos();
        String produtoCaro = produtoResul.obterMaisCaro(listaProdutos);
        String produtoBarato = produtoResul.obterMaisBarato(listaProdutos);

        System.out.println("O produto mais barato é: "+ produtoBarato);
        System.out.println("O produto mais caro é: "+produtoCaro);




    }
}
