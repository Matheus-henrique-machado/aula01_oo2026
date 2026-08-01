import java.util.Scanner;
import java.util.Random;

public class Atividade01_sorteio{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        Random random = new Random ();

        int numeroSorteado = random.nextInt (100) + 1;
        int Palpite = 0;
        int tentativas = 0;
        System.out.println("Tente adivinhar o numero de 1 a 100");

        while (Palpite != numeroSorteado) {
            System.out.print("Digite seu palpite: ");
            Palpite = scanner.nextInt ();
            tentativas = tentativas + 1;
            if(Palpite < numeroSorteado) {
                System.out.println("Desculpe, mas ta errado, seu palpite é menor que o numero sorteado, tente novamente, não desista");
            } else if (Palpite > numeroSorteado) {
                System.out.println("Desculpa, mas ta errado, seu palpite é maior que o numero sorteado, tente novamente eu sei que você consegue na proxima");
            } else {
                System.out.println("Meus parabens, você acertou o numero.");
                System.out.println("O numero sorteado era: " + numeroSorteado);
                System.out.println("Você precisou de " + tentativas + " tentativas para acertar o numero sorteado.");
            }
        } 
        
        if(tentativas < 20) {
                System.out.println("Parabéns, você é muito sortudo porque acertou rapido");
            } else if(tentativas > 20) {
                System.out.println("Oloko ein, você teve que se esforçar um pouco mais, parabens pela persistencia");
            }
    }
}