import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("me diga um numero qualquer : ");

        int numero = sc.nextInt();

        double impaPar = numero % 2;

        if (impaPar != 0) {
            System.out.println("impar");

        } else {
            System.out.println("par");
        }

        sc.close();

    }

}
