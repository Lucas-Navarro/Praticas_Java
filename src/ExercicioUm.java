import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número: ");
        var numero = scanner.nextInt();
        for (var i = 1; i <= 10; i++){
            var tabuada = numero * i;
            System.out.printf("%s x %s = %s\n", numero, i, tabuada);
        }
    }

}
