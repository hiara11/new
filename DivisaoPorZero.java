import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoPorZero {
    public static int quociente(int numerador, int denominador){

        return numerador/denominador;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueLoop = true;

        do{
            try{
                System.out.println("Informe o numerador");
                int numerador = sc.nextInt();
                System.out.println("Informe um denominador");
                int denominador = sc.nextInt();
                int result = quociente(numerador, denominador);
                System.out.printf("Resultado: %d / %d = %d%n", numerador,denominador,result);

            }catch (InputMismatchException inputMismatchException){
                System.err.println("Erro, exceção:" + inputMismatchException);
                sc.nextLine();
                System.out.println("Zero é um denominador invalido! Tente novamente!");
            }catch (ArithmeticException arithmeticException ) {
                System.err.println("Erro, exceção" + arithmeticException);
                System.out.println("Zero é um denominador invalido! tente novamente");
            }
        }while (continueLoop);

    }
}
