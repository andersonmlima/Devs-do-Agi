package Algorithm;

import java.util.Scanner;

// Verificar se um cliente tem idade suficiente para abrir uma conta bancária (idade mínima: 18 anos).
public class Exercise1 {
    public static void main(String[] args) {
        Scanner idAge = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int age = idAge.nextInt();

        if (age >= 18) {
            System.out.println("Idade ok, aprovado!");
        }else {
            System.out.println("Idade não permitida, negado!");
        }
    }
}


