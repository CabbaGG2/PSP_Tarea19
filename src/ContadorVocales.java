public class ContadorVocales {
    int contadorVocales = 0;
    public synchronized void incrementar(){
        contadorVocales++;
    }
    public int getContadorVocales() {
        return contadorVocales;
    }
}
