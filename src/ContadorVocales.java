public class ContadorVocales {
    static int contadorVocales = 0;
    private final Object candado = new Object();

    public synchronized static void incrementar(){
            contadorVocales++;
    }
    public int getContadorVocales() {
        return contadorVocales;
    }
}
