import java.util.Scanner;


public class MinhaClasse {

    public static void main(String[] args){
        
        double nota1 = 5, nota2 = 6, media;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite sua nota 1: ");
        nota1 = scanner.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        nota2 = scanner.nextDouble();

        media = (nota1 + nota2)/2;

        if(media<7)
            System.out.println("Reprovado");
        else
            System.out.println("Aprovado!!");


        scanner.close();
    }

}
