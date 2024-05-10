import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salario : ");

        double salario = sc.nextDouble();
        double aumento;
        double novoSalario;
        int porcetagem ;

        if (salario <= 280) {
            aumento = (20 * salario) / 100;
            porcetagem = 20;
      

        } else if (salario > 280 && salario < 700) {
            aumento = (15 * salario) / 100;
            porcetagem = 15;
          

        } else if (salario > 700 && salario < 1500) {
            aumento = (10 * salario) / 100;
            porcetagem = 10;

        } else {
            aumento = (5 * salario) / 100;
            porcetagem = 5;
         

        }

        System.out.println("salario antes do reajuste : " + salario);

        System.out.println("porcetagem de aumento  " + porcetagem);

        System.out.println("valor do aumento " + aumento);

        novoSalario = salario + aumento;

        System.out.println("seu novo salario é " + novoSalario);

        sc.close();

    }

}
