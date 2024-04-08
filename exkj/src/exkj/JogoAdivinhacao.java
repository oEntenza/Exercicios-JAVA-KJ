package exkj;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

	private int numeroSorteado;
    private Random random;
    
    public JogoAdivinhacao() {
        random = new Random();
    }
    
    public void sortear() {
        numeroSorteado = random.nextInt(100);
    }
    
    public void adivinhar() {
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;
        int palpite;
        
        do {
            System.out.print("Digite seu palpite (entre 0 e 99): ");
            palpite = scanner.nextInt();
            tentativas++;
            
            if (palpite < numeroSorteado) {
                System.out.println("Palpite muito baixo! Tente novamente.");
            } else if (palpite > numeroSorteado) {
                System.out.println("Palpite muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            }
        } while (palpite != numeroSorteado);
       
        scanner.close();
    }	
}
