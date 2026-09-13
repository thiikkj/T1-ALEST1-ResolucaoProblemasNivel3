import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Cria o Scanner para ler as três palavras
        Scanner entrada = new Scanner(System.in);

        //Lê a primeira palavra (vertebrado ou invertebrado)
        String classe = entrada.next();

        //Lê a segunda palavra (ave, mamifero, inseto ou anelideo)
        String tipo = entrada.next();

        //Le a terceira palavra (o tipo de alimentação do animal)
        String alimentacao = entrada.next();

        //Verifica o ramo "vertebrado"
        if (classe.equals("vertebrado")) {

            //Dentro de vertebrado, verifica se é ave
            if (tipo.equals("ave")) {

                //Ave carnivora é aguia, ave onivora é pomba
                if (alimentacao.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }

            } else {

                //Se não for ave, dentro de vertebrado só resta mamifero
                //Mamifero onivoro é homem, mamifero herbivoro é vaca
                if (alimentacao.equals("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }

        } else {

            //Verifica o ramo "invertebrado"
            if (tipo.equals("inseto")) {

                //Inseto hematofago é pulga, inseto herbivoro é lagarta
                if (alimentacao.equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }

            } else {

                //Se não for inseto, dentro de invertebrado só resta anelideo
                //Anelideo hematofago é sanguessuga, anelideo onivoro é minhoca
                if (alimentacao.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }
    }
}