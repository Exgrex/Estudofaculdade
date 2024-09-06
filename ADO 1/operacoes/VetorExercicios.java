package operacoes;

public class VetorExercicios {

    public static void imprimirVetor(int[] vetor) {
        System.out.print("Vetor: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int verificarNumeroNoVetor(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return i; 
            }
        }
        return -1; 
    }

    
    public static int buscarMaiorNumero(int[] vetor) {
        int maior = vetor[0];
        for (int num : vetor) {
            if (num > maior) {
                maior = num;
            }
        }
        return maior;
    }

    
    public static double mediaPares(int[] vetor) {
        int soma = 0, count = 0;
        for (int num : vetor) {
            if (num % 2 == 0) {
                soma += num;
                count++;
            }
        }
        return count > 0 ? (double) soma / count : 0;
    }

    
    public static double percentualImpares(int[] vetor) {
        int impares = 0;
        for (int num : vetor) {
            if (num % 2 != 0) {
                impares++;
            }
        }
        return (double) impares / vetor.length * 100;
    }

    
    public static double mediaCentralizada(int[] vetor) {
        int menor = vetor[0], maior = vetor[0], soma = 0;
        for (int num : vetor) {
            if (num < menor) menor = num;
            if (num > maior) maior = num;
            soma += num;
        }
        soma -= (menor + maior); 
        return (double) soma / (vetor.length - 2); 
    }

    
    public static boolean existeSoma(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] + vetor[j] == valor) {
                    return true;
                }
            }
        }
        return false;
    }
}