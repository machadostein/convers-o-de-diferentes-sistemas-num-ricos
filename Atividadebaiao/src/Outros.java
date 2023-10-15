/*"Projeto da faculdade sobre operações de conversão de diferentes sistemas numéricos, incluindo:

- Binário para decimal
- Octal para decimal
- Hexadecimal para decimal
- Decimal para binário
- Decimal para octal
- Decimal para hexadecimal
- Octal para binário
- Hexadecimal para binário
- Octal para hexadecimal
- Hexadecimal para octal." */

import java.util.Scanner;

public class Outros {

    public static void main(String[] args) {
        while (true) { // Laço de repetição para repetir o codigo
            // Cria Scanner para ler a entrada do usuário.
            Scanner input = new Scanner(System.in);
            // Exibe as alternativas de operações para o usuario
            System.out.println("Escolha a conversão: ");
            System.out.println("1. Binário para Decimal");
            System.out.println("2. Octal para Decimal");
            System.out.println("3. Hexadecimal para Decimal");
            System.out.println("4. Decimal para Binário");
            System.out.println("5. Decimal para Octal");
            System.out.println("6. Decimal para Hexadecimal");
            System.out.println("7. Octal para Binário");
            System.out.println("8. Hexadecimal para Binário");
            System.out.println("9. Octal para Hexadecimal");
            System.out.println("10. Hexadecimal para Octal");

            // Lê a escolha do usuário só com numeros inteiros
            int choice = input.nextInt();
            // Executa diferentes operações dependendo da escolha do usuário.
            switch (choice) {
                // Converte um número binário para decimal.
                case 1:
                    System.out.print("Digite um número binário: ");
                    String binary = input.next();
                    System.out.println("O número em decimal é: " + Integer.parseInt(binary, 2));
                    break;
                // Converte um número octal para decimal.
                case 2:
                    System.out.print("Digite um número octal: ");
                    String octal = input.next();
                    System.out.println("O número em decimal é: " + Integer.parseInt(octal, 8));
                    break;
                // Converte um número hexadecimal para decimal.
                case 3:
                    System.out.print("Digite um número hexadecimal: ");
                    String hex = input.next();
                    System.out.println("O número em decimal é: " + Integer.parseInt(hex, 16));
                    break;
                // Converte um número decimal para binário.
                case 4:
                    System.out.print("Digite um número decimal: ");
                    int decimal = input.nextInt();
                    System.out.println("O número em binário é: " + Integer.toBinaryString(decimal));
                    break;
                // Converte um número decimal para octal.
                case 5:
                    System.out.print("Digite um número decimal: ");
                    int dec = input.nextInt();
                    System.out.println("O número em octal é: " + Integer.toOctalString(dec));
                    break;
                // Converte um número decimal para hexadecimal.
                case 6:
                    System.out.print("Digite um número decimal: ");
                    int deci = input.nextInt();
                    System.out.println("O número em hexadecimal é: " + Integer.toHexString(deci));
                    break;
                // Converte um número octal para binário.
                case 7:
                    System.out.print("Digite um número octal: ");
                    String oct = input.next();
                    int decValue = Integer.parseInt(oct, 8);
                    System.out.println("O número em binário é: " + Integer.toBinaryString(decValue));
                    break;
                // Converte um número hexadecimal para binário.
                case 8:
                    System.out.print("Digite um número hexadecimal: ");
                    String hexValue = input.next();
                    int decimalValue = Integer.parseInt(hexValue, 16);
                    System.out.println("O número em binário é: " + Integer.toBinaryString(decimalValue));
                    break;
                // Converte um número octal para hexadecimal.
                case 9:
                    System.out.print("Digite um número octal: ");
                    String octValue = input.next();
                    int decimalVal = Integer.parseInt(octValue, 8);
                    System.out.println("O número em hexadecimal é: " + Integer.toHexString(decimalVal));
                    break;
                // Converte um número hexadecimal para octal.
                case 10:
                    System.out.print("Digite um número hexadecimal: ");
                    String hexVal = input.next();
                    int decVal = Integer.parseInt(hexVal, 16);
                    System.out.println("O número em octal é: " + Integer.toOctalString(decVal));
                    break;
                // Caso a escolha do usuário não corresponda a nenhuma opção válida, exibe uma mensagem de erro.
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
            }
        }
    }
}