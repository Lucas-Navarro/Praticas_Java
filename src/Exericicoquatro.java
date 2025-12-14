import java.util.Scanner;

public class Exericicoquatro {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número: ");
        var numero = scanner.nextInt();
        var rapidaVerificacao = true;
        while (rapidaVerificacao){
            System.out.println("Informe um número para verificação");
            var paraVerificar =  scanner.nextInt();
            if (paraVerificar < numero){
                System.out.printf("Informe um número maior que %s", numero);
                continue;
            }
            var resultado = paraVerificar % numero;
            rapidaVerificacao = resultado == 0;
            System.out.printf("%s % %s = %s", paraVerificar, numero, resultado);
            if (resultado != 0) break;

        }
    }
}
