import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Buenas noches, programadores de pacotilla");
        System.out.println("Estamos aquí reunidos para seguir en este arduo camino de aprendizaje sobre Java");
        String frase;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Escribe una frase para contar sus vocales o 'salir' para terminar el programa.");
            frase = sc.nextLine();
            if (frase.equals("salir")) {
                System.out.printf("Finalizando programa.");
                break;
            }
            ContadorVocales cv = new ContadorVocales();
            Hilo hiloA = new Hilo("A", frase, cv);
            Hilo hiloE = new Hilo("E", frase, cv);
            Hilo hiloI = new Hilo("I", frase, cv);
            Hilo hiloO = new Hilo("O", frase, cv);
            Hilo hiloU = new Hilo("U", frase, cv);
            hiloA.start();
            hiloE.start();
            hiloI.start();
            hiloO.start();
            hiloU.start();
            try {
                hiloA.join();
                hiloE.join();
                hiloI.join();
                hiloO.join();
                hiloU.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("El total de vocales es: " + cv.getContadorVocales());
        } while (true);
    }
}

