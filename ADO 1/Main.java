/*
Entrega a Atividade 1 - Algoritmos e Programação II

Eu,
Jefferson Eidy Tokura

declaro que

todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos ao grupo e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou prejudicar outros.
*/

import java.util.Random;
import java.util.Scanner;
import operacoes.VetorExercicios;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int [] vetor = null;

        while(true){
            System.out.println("Menu de Opções:");
            System.out.println("1. Inicializar o vetor com números aleatórios");
            System.out.println("2. Imprimir o vetor");
            System.out.println("3. Verificar se um número está no vetor");
            System.out.println("4. Buscar o maior número no vetor");
            System.out.println("5. Calcular a média dos números pares");
            System.out.println("6. Calcular o percentual de números ímpares");
            System.out.println("7. Calcular a média centralizada");
            System.out.println("8. Verificar se dois números somam o valor informado");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 0){
            System.out.println("Encerrando aplicativo...");
            break;
            }
            
            if (opcao != 1 && vetor == null) {
                System.out.println("Você não pode executar esta operação pois o vetor não foi inicializado");
                continue;   
            }

            switch (opcao) {
                // inicia o vetor
                case 1:

                System.out.print("Informe o tamanho do vetor (N): ");
                int n = scanner.nextInt();
                System.out.print("Informe o valor máximo (M): ");
                int m = scanner.nextInt();
                vetor = new int[n];
                for (int i = 0; i < n; i++) {
                    vetor[i] = random.nextInt(m + 1);
                }
                System.out.println("Vetor inicializado com números aleatórios.");
                break;
                
                // chama a função pra imprimir o vetor
                case 2:
                
                VetorExercicios.imprimirVetor(vetor);
                break;

                // verifica se um número  está maior no vetor
                case 3:
                 
                 System.out.print("Informe o número a ser procurado: ");
                 int valor = scanner.nextInt();
                int indice = VetorExercicios.verificarNumeroNoVetor(vetor, valor);
                 if (indice != -1) {
                    System.out.println("Número encontrado no índice: " + indice);
                    } else {
                        System.out.println("Número não encontrado no vetor.");
                    }
                    break;

                // chama a função  para buscar o maior número
                case 4:
                
                System.out.println("Maior número no vetor: " + VetorExercicios.buscarMaiorNumero(vetor));
                break;

                // chama a função para calcular a média dos pare
                case 5:
                
                System.out.println("Média dos números pares: " + VetorExercicios.mediaPares(vetor));                    
                break;

                // chama a função para calcular percentual dos ímpars
                case 6:
           
                System.out.println("Percentual de números ímpares: " + VetorExercicios.percentualImpares(vetor) + "%");
                break;

                // chama a função para calcular a média central
                case 7:
                
                System.out.println("Média centralizada: " + VetorExercicios.mediaCentralizada(vetor));
                break;
                
                // verifca se no vetor há dois números que somam o valor escrito
                case 8:
                
                System.out.print("Informe o valor da soma a ser procurada: ");
                int somaValor = scanner.nextInt();
                boolean existeSoma = VetorExercicios.existeSoma(vetor, somaValor);
                System.out.println("Existem dois números que somam " + somaValor + "? " + existeSoma);
                break;

                default:
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}