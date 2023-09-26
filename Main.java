// Renan Antonio Hammerschmidt Krefta
// O Codigo pode ser rodado no replit
// O Codigo resolve os exercicios propostos e entao permite executar suas funcoes

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        System.out.println("1 - Inserindo os Elementos [14, 4, 3, 9, 7, 5, 15, 18, 16, 17, 20] -");
        arvore.insere(14);
        arvore.insere(4);
        arvore.insere(3);
        arvore.insere(9);
        arvore.insere(7);
        arvore.insere(5);
        arvore.insere(15);
        arvore.insere(18);
        arvore.insere(16);
        arvore.insere(17);
        arvore.insere(20);
        System.out.println("--------------------");

        System.out.println("- 2 Percorrendo a arvore em preordem, inordem e posordem e imprimindo os nós");
        System.out.println("----- PreOrdem -----");
        arvore.ImprimePreOrdem();
        System.out.println("----- InOrdem -----");
        arvore.ImprimeInOrdem();
        System.out.println("----- PosOrdem -----");
        arvore.ImprimePosOrdem();
        System.out.println("--------------------");

        System.out.println("- 3 Removendo o Maior elemento: 20");
        arvore.RemoveMaior();
        System.out.println("----- Imprimindo InOrdem -----");
        arvore.ImprimeInOrdem();
        System.out.println("--------------------");

        System.out.println("- 4 Removendo o Menor elemento: 3");
        arvore.RemoveMenor();
        System.out.println("----- Imprimindo InOrdem -----");
        arvore.ImprimeInOrdem();
        System.out.println("--------------------");

        System.out.println("5 - Removendo um elemento específico: 7");
        arvore.RemoveElemento(7);
        System.out.println("----- Imprimindo InOrdem -----");
        arvore.ImprimeInOrdem();
        System.out.println("--------------------");

        Scanner teclado = new Scanner(System.in);

        int decisao = 1;
        while (decisao != 0) {
            System.out.println("--------------------");
            System.out.println("Escolha uma operação: ");
            System.out.println("- (1) Inserir Elemento");
            System.out.println("- (2) Imprimir PreOrdem");
            System.out.println("- (3) Imprimir InOrdem");
            System.out.println("- (4) Imprimir PosOrdem");
            System.out.println("- (5) Remover Maior Elemento");
            System.out.println("- (6) Remover Menor Elemento");
            System.out.println("- (7) Remover Elemento");
            System.out.println("- (0) Encerrar");
            decisao = teclado.nextInt();
            if (decisao == 1) {
                int inteiro = 1;
                System.out.println("- Insira um número inteiro (0 para sair):");
                inteiro = teclado.nextInt();
                if (inteiro != 0) {
                    arvore.insere(inteiro);
                }

            }
            if (decisao == 2) {
                System.out.println("----- PreOrdem -----");
                arvore.ImprimePreOrdem();
            }
            if (decisao == 3) {
                System.out.println("----- InOrdem -----");
                arvore.ImprimeInOrdem();
            }
            if (decisao == 4) {
                System.out.println("----- PosOrdem -----");
                arvore.ImprimePosOrdem();
            }
            if (decisao == 5) {
                System.out.println("----- Removendo Maior Elemento -----");
                arvore.RemoveMaior();
            }
            if (decisao == 6) {
                System.out.println("----- Removendo Menor Elemento -----");
                arvore.RemoveMenor();
            }
            if (decisao == 7) {
                System.out.println("----- Imprimindo InOrdem para referencia dos elementos existentes -----");
                arvore.ImprimeInOrdem();

                int inteiro = 1;
                System.out.println("- Insira um número inteiro (0 para sair):");
                inteiro = teclado.nextInt();
                if (inteiro != 0) {
                    arvore.RemoveElemento(inteiro);
                }

            }
        }
    }

}
