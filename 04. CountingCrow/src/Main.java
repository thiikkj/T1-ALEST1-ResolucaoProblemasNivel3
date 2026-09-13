import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Cria o Scanner para receber os dados
        Scanner entrada = new Scanner(System.in);

        //Guarda a soma dos valores binários lidos até o próximo grito
        int soma = 0;

        //Repete enquanto houver linhas para ler
        while (entrada.hasNextLine()) {
            String linha = entrada.nextLine();

            //Verifica se a linha é um grito do corvo
            if (linha.equals("caw caw")) {

                //O corvo gritou: exibe o resultado acumulado até aqui
                System.out.println(soma);

                //Zera a soma para começar a contar o próximo resultado
                soma = 0;

            } else {

                //A linha é um piscar: 3 caracteres, "*" (aberto = 1) ou "-" (fechado = 0)
                //Guarda o valor binário formado por esse piscar
                int valor = 0;

                //Percorre os 3 caracteres da esquerda para a direita
                for (int i = 0; i < linha.length(); i++) {

                    //Desloca o valor para a esquerda
                    valor = valor * 2;

                    //Se o olho estiver aberto, soma 1 na posição atual
                    if (linha.charAt(i) == '*') {
                        valor = valor + 1;
                    }
                }

                //Acumula o valor desse piscar na soma total
                soma = soma + valor;
            }
        }
    }
}