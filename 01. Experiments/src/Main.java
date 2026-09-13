import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Cria o Scanner para receber os dados e lê a quantidade de casos que vão ser informados
        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt();

        //Atributos (todos começando em 0)
        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;

        //Repete a leitura N vezes, uma vez para cada caso informado
        for (int i = 0; i < N; i++) {

            //Lê a quantidade de cobaias e o tipo (C = coelho, R = rato, S = sapo)
            int quantidade = entrada.nextInt();
            char tipo = entrada.next().charAt(0);

            //De acordo com o tipo informado, adiciona a quantidade ao contador
            if (tipo == 'C') {
                coelhos = coelhos + quantidade;
            } else if (tipo == 'R') {
                ratos = ratos + quantidade;
            } else if (tipo == 'S') {
                sapos = sapos + quantidade;
            }
        }

        //Calculo para saber o total
        int total = coelhos + ratos + sapos;

        //Calculo para saber o percentual
        double percentualCoelhos = coelhos * 100.0 / total;
        double percentualRatos = ratos * 100.0 / total;
        double percentualSapos = sapos * 100.0 / total;

        //Exibe os totais de cobaias e de cada tipo de animal
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);

        //Exibe as porcentagens (com duas casas decimais)
        System.out.printf("Percentual de coelhos: %.2f %%\n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f %%\n", percentualSapos);
    }
}