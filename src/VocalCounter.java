import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class VocalCounter {
    public static void main(String[] args) {
        String texto = args[0];
        char vocal = args[1].toLowerCase().charAt(0);

        int contadorVocal = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(texto));
            String line;
            String textoCompleto = "";
            while ((line = br.readLine()) != null) {
                textoCompleto += br.readLine();

                for (int i = 0; i < textoCompleto.length(); i++) {
                    if (textoCompleto.toLowerCase().charAt(i) == vocal) contadorVocal++;

                }
            }
            System.out.println("El número de " + vocal + " es " + contadorVocal);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}