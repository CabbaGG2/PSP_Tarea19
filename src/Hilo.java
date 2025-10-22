import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class Hilo extends Thread{
    private final char vocal;
    private final String texto;
    private int contadorVocales = 0;
    private final Object lock = new Object();
    private final ContadorVocales cv;

    public Hilo(char vocal, String texto, ContadorVocales cv) {
        this.vocal = vocal;
        this.texto = texto;
        this.cv = cv;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == toLowerCase(vocal) || texto.charAt(i) == toUpperCase(vocal)) {
                cv.incrementar();
                contadorVocales++;
            }
        }
        System.out.println("El total de " + vocal + " es: " + contadorVocales);
    }

}
