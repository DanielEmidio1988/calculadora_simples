import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double valorA = 0;
        double valorB = 0;
        double total = 0;
        int menu = 0;

        while (menu != 5){
            System.out.println("""
                Informe a operação que deseja realizar
                1- Soma
                2- Subtração
                3- Multiplicação
                4- Divisão
                5- Sair                
                """);
            menu = leitura.nextInt();
            switch (menu){
                case 1:
                    System.out.println("Informe o primeiro valor:");
                    valorA = leitura.nextDouble();
                    System.out.println("Informe o segundo valor:");
                    valorB = leitura.nextDouble();
                    total = valorA + valorB;
                    System.out.println("Resultado: " + total);
                    break;
                case 2:
                    System.out.println("Informe o primeiro valor:");
                    valorA = leitura.nextDouble();
                    System.out.println("Informe o segundo valor:");
                    valorB = leitura.nextDouble();
                    total = valorA - valorB;
                    System.out.println("Resultado: " + total);
                    break;
                case 3:
                    System.out.println("Informe o primeiro valor:");
                    valorA = leitura.nextDouble();
                    System.out.println("Informe o segundo valor:");
                    valorB = leitura.nextDouble();
                    total = valorA * valorB;
                    System.out.println("Resultado: " + total);
                    break;
                case 4:
                    System.out.println("Informe o primeiro valor:");
                    valorA = leitura.nextDouble();
                    System.out.println("Informe o segundo valor:");
                    valorB = leitura.nextDouble();
                    total = valorA / valorB;
                    System.out.println("Resultado: " + total);
                    break;
                case 5:
                    System.out.println("Obrigado! Aplicação finalizada.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

    }
}