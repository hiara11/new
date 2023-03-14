import java.util.InputMismatchException;
import java.util.Scanner;

public class VerificaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite seu nome");
            String nome = sc.nextLine();
            System.out.println("Informe sua idade");
            int idade =sc.nextInt();

            System.out.println("Seu nome é: " +nome+"/n"
            + "Sua idade é:"+idade);
        }catch (InputMismatchException e){
            System.out.println("Você não digitou uma idade válida");
        }
    }
}
