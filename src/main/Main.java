package main;

import implementation.Supermarket;
import implementation.SupermarketArray;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final int SIZE = 3;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Supermarket supermarket = new SupermarketArray(SIZE);
        int opcao;


        do{
            System.out.println("\n Lista de compra");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Exibir lista");
            System.out.println("3 - Remover item");
            System.out.println("4 - Sair");
            System.out.println("Digite a opção desejada: ");

            opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Digite o item a ser adicionado: ");
                    String item = scanner.next();
                    supermarket.add(item);
                    break;
                case 2:
                    System.out.println("Exibindo lista");
                    supermarket.print();
                    break;
                case 3:
                    System.out.println("Digite o indice do item a ser removido: ");
                    int index = scanner.nextInt();
                    supermarket.delete(index);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while (opcao != 4);

        scanner.close();
    }
}