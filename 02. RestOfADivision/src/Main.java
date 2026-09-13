import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Cria o Scanner para ler os dois números informados
        Scanner entrada = new Scanner(System.in);

        //Lê os valores de X e Y
        int X = entrada.nextInt();
        int Y = entrada.nextInt();

        //Descobre qual dos dois números é o menor o maior
        int menor = Math.min(X, Y);
        int maior = Math.max(X, Y);

        //Percorre todos os números que estão entre o menor e o maior
        for (int i = menor + 1; i < maior; i++) {

            //Verifica se o resto da divisão por 5 é 2 ou 3
            if (i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);
            }
        }
    }
}