package me.pauloricardo.dechac;

import me.pauloricardo.dechac.domain.ChaveAcesso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Entre com uma chave de acesso. Digite 0 para sair.");
                String ss = s.nextLine();
                if(ss != null  && ss.equals("0"))
                    System.exit(0);
                System.out.println(new ChaveAcesso(ss));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}