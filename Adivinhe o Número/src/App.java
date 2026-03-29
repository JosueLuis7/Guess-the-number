// Josué Luís Pimenta Alecrim
// 1261948087
// 29/03/2026   
    import java.util.Scanner;
public class App {
    public static void main(String[]args) {

        Scanner entrada = new Scanner(System.in);

        int tentativa = 1;
        int x = 42;
        int N;
    
    System.out.println("Bem vindo ao jogo da sorte!");

    System.out.println("Tente acertar o número da sorte!");
    

        while (tentativa <= 5) {
    System.out.println("Tentativa" + tentativa + ":Digite um número");
    N = entrada.nextInt();



        if (N == x) {
    System.out.println("Parabens você acertou o número secreto");
    break;
        } else  if (N < x) {
    System.out.println("Número baixo: tente um número maior.");
        } else {
     System.out.println("Número alto: tente um número menor.");
        }
        tentativa++;
    }
        if (tentativa > 5) {
    System.out.println("Você perdeu...\n o número secreto era" + x);

    entrada.close();
        }
    }
}