import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, qntNum = 0, somaNum = 0, mediaNum;

        do {
            System.out.print("Digite um número: ");
            num = scanner.nextInt();
            somaNum = somaNum + num;
            qntNum++;
        } while (num > 0);

        mediaNum = somaNum / qntNum;
        System.out.println("\nSoma dos números: " + somaNum);
        System.out.println("Quantidade de números: " + qntNum);
        System.out.println("\nMédia dos números:: " + mediaNum);
    }
}
