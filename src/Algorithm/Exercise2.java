package Algorithm;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner idBalance = new Scanner(System.in);
        System.out.println("Qual seu saldo em conta?: ");
        double balance = idBalance.nextDouble();

        double limitAccount = balance * 0.20;
        System.out.println("Seu limite em conta é: "+limitAccount);
    }
}