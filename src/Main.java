import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Buenas noches, programadores de pacotilla");
        System.out.println("Estamos aquí reunidos para seguir en este arduo camino de aprendizaje sobre Java");
        System.out.println("Esta noche vamos a realizar un contador de vocales, asi que venga ingresa una frase toda chula aqui abajo:");
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

    }
}

