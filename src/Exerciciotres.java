import java.util.Scanner;

public class Exerciciotres {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        var num1 = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        var num2 = scanner.nextInt();

        if (num1 > num2){
            for (var i = num2;i <= num1; i++){
                if (i % 2 == 0){
                    System.out.printf("%s é Par\n", i);
                }
                else{
                    System.out.printf("%s é Impar\n", i);
                }
            }
        }
        else{
            for (var i = num1; i <= num2; i++){
                if (i % 2 == 1){
                    System.out.printf("%s é Impar\n", i);
                }
                else{
                    System.out.printf("%s é Par\n", i);
                }
            }
        }

    }
}
