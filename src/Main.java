import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Venga ingresa una frase toda chula aqui abajo:");
        ContadorVocales cv = new ContadorVocales();
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        Hilo hiloA = new Hilo('A', frase, cv);
        Hilo hiloE = new Hilo('E', frase, cv);
        Hilo hiloI = new Hilo('I', frase, cv);
        Hilo hiloO = new Hilo('O', frase, cv);
        Hilo hiloU = new Hilo('U', frase, cv);
        hiloA.start();
        hiloE.start();
        hiloI.start();
        hiloO.start();
        hiloU.start();

        try{
            hiloA.join();
            hiloE.join();
            hiloI.join();
            hiloO.join();
            hiloU.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("El total de vocales es: " + cv.getContadorVocales());

    }
}

