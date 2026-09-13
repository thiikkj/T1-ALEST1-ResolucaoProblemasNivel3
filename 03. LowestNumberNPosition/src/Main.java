import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Cria o Scanner para receber os dados e lê a quantidade de casos que vão ser informados
        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt();

        //Lê o primeiro número para usar como menor valor inicialmente
        int menor = entrada.nextInt();

        //A primeira posição é 0
        int posicao = 0;

        //Repete a leitura dos números restantes
        for (int i = 1; i < N; i++) {

            //Lê o próximo numero
            int numero = entrada.nextInt();

            //Verifica se o número atual é menor que o menor encontrado
            if (numero < menor) {

                //Atualiza o menor valor
                menor = numero;

                //Guarda a posição onde o novo menor foi encontrado
                posicao = i;
            }
        }

        //Exibe o menor valor e sua posição
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao);
    }
}