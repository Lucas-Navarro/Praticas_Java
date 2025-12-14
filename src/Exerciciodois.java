import java.util.Scanner;

public class Exerciciodois {
    public static void main(String []args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe sua altura: ");
        var altura = scanner.nextFloat();
        System.out.println("Informe seu peso: ");
        var peso = scanner.nextFloat();
        var imc = peso/(altura * altura);
        if (imc < 18.5){
            System.out.printf("IMC: %s\n = Abaixo do Peso", imc);
        }
        else if (imc >= 18.5 && imc < 24.9){
            System.out.printf("IMC: %s\n = Peso Ideal", imc);
        }
        else if (imc >= 25 && imc < 29.9){
            System.out.printf("IMC: %s\n = Levemente acima do peso", imc);
        }
        else if (imc >= 30 && imc < 34.9){
            System.out.printf("IMC: %s\n = Obesidade Grau I", imc);
        }
        else if (imc >= 35 && imc < 39.9){
            System.out.printf("IMC: %s\n = Obesidade Grau II (Severa)", imc);
        }
        else{
            System.out.printf("IMC: %s\n = Obesidade Grau III (Mórbida)", imc);
        }
    }
}
