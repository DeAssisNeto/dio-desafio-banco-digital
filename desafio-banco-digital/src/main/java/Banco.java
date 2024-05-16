package main.java;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private static List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
    }

    public static void iniciarBanco(){
        contas = new ArrayList<>();
    }

    public static void adicionarConta (Conta conta){
        contas.add(conta);
    }

    public static void listarContas(){
        for(Conta conta: contas){
            System.out.println(conta);
        }
    }

}
