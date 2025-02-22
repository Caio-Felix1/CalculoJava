import java.util.Scanner;

public class Main {

    public static void titulo(String titulo) {
        int espaco_antes;
        String linha = "----------------------------------------";

        espaco_antes = (linha.length() - titulo.length()) / 2;

        System.out.println(linha);
        System.out.println(" ".repeat(espaco_antes) + titulo);
        System.out.println(linha);
    }

    public static void pausa(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            ;
        }
    }

    public static void tela() {
        Scanner teclado = new Scanner(System.in);
        String num;

        do {
            titulo("Cálculos em Java");

            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Divisão");
            System.out.println("4 - Multiplicação");
            System.out.println("5 - Média Aritmética");
            System.out.println("6 - Fatorial");
            System.out.println("7 - Bháskara");
            System.out.println("8 - Sair do Programa");
            System.out.print("Digite o número da opção: ");
            num = teclado.nextLine().trim();

            switch (num) {
                case "1":
                    titulo("Soma");
                    CalculoBasico.soma(teclado);
                    pausa(2500);
                    break;
                case "2":
                    titulo("Subtração");
                    CalculoBasico.subtracao(teclado);
                    pausa(2500);
                    break;
                case "3":
                    titulo("Divisão");
                    CalculoBasico.divisao(teclado);
                    pausa(2500);
                    break;
                case "4":
                    titulo("Multiplicação");
                    CalculoBasico.multiplicacao(teclado);
                    pausa(2500);
                    break;
                case "5":
                    titulo("Média Aritmética");
                    CalculoComplexo.media(teclado);
                    pausa(2500);
                    break;
                case "6":
                    titulo("Fatorial");
                    CalculoComplexo.fatorial(teclado);
                    pausa(2500);
                    break;
                case "7":
                    titulo("Bháskara");
                    CalculoComplexo.bhaskara(teclado);
                    pausa(10000);
                    break;
                case "8":
                    System.out.println("Encerrando o programa...");
                    pausa(1500);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
                    pausa(1500);
                    break;
            }
        } while (!num.equals("8"));
        teclado.close();
    }

    public static void main(String[] args) {
        tela();
    }
}