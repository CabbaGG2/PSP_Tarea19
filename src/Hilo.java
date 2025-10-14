public class Hilo extends Thread{
    private String vocal;
    private String texto;
    private int contadorVocales;
    private final Object lock = new Object();
    private ContadorVocales cv;

    public Hilo(String vocal, String texto, ContadorVocales cv) {
        this.vocal = vocal;
        this.texto = texto;
        this.cv = cv;
    }
    
    @Override
    public void run() {
       switch(vocal) {
           case "A":
               if (texto.contains("a") || texto.contains("A")) {
                   for (int i = 0; i < texto.length(); i++) {
                       if (texto.charAt(i) == 'a' || texto.charAt(i) == 'A') {
                           contadorVocales++;
                            cv.incrementar();
                       }
                   }
               }
               break;
           case "E":
                if (texto.contains("e") || texto.contains("E")) {
                     for (int i = 0; i < texto.length(); i++) {
                          if (texto.charAt(i) == 'e' || texto.charAt(i) == 'E') {
                            contadorVocales++;
                            cv.incrementar();
                          }
                     }
                }
               break;
           case "I":
                if (texto.contains("i") || texto.contains("I")) {
                     for (int i = 0; i < texto.length(); i++) {
                          if (texto.charAt(i) == 'i' || texto.charAt(i) == 'I') {
                            contadorVocales++;
                            cv.incrementar();
                          }
                     }
                }
                break;
           case "O":
                if (texto.contains("o") || texto.contains("O")) {
                     for (int i = 0; i < texto.length(); i++) {
                          if (texto.charAt(i) == 'o' || texto.charAt(i) == 'O') {
                            contadorVocales++;
                            cv.incrementar();
                          }
                     }
                }
                break;
           case "U":
                if (texto.contains("u") || texto.contains("U")) {
                    for (int i = 0; i < texto.length(); i++) {
                        if (texto.charAt(i) == 'u' || texto.charAt(i) == 'U') {
                            contadorVocales++;
                            cv.incrementar();
                        }
                    }
                }

       }
        System.out.println("El total de " + vocal + " es: " + contadorVocales);
    }

}
