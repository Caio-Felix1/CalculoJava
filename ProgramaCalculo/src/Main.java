import java.util.Scanner;

public class Main {

    public static void linhas() {
        System.out.println("----------------------------------------");
    }

    public static void tela() {
        Scanner teclado = new Scanner(System.in);
        String num;
        do {
            System.out.println("Cálculos em Java");
            linhas();

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
                    CalculoBasico.soma();
                    linhas();
                    break;
                case "2":
                    CalculoBasico.subtracao();
                    linhas();
                    break;
                case "3":
                    CalculoBasico.divisao();
                    linhas();
                    break;
                case "4":
                    CalculoBasico.multiplicacao();
                    linhas();
                    break;
                case "5":
                    CalculoComplexo.media();
                    linhas();
                    break;
                case "6":
                    CalculoComplexo.fatorial();
                    linhas();
                    break;
                case "7":
                    CalculoComplexo.bhaskara();
                    linhas();
                    break;
                case "8":
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
                    linhas();
            }
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                ;
            }
        } while (!num.equals("8"));
    }

    public static void main(String[] args) {
        tela();
    }
}