import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) throws IOException {
        String lorenIpsum = "C:\\Users\\eric\\IdeaProjects\\practicaRecupperacionProcesos\\src\\lorem_Ipsum.txt";
       String[] vocales ={"a", "e", "i", "o", "u"};
       String[] arrayRutas= {"C:\\Users\\eric\\IdeaProjects\\practicaRecupperacionProcesos\\src\\output\\Salida0.txt","C:\\Users\\eric\\IdeaProjects\\practicaRecupperacionProcesos\\src\\output\\Salida1.txt","C:\\Users\\eric\\IdeaProjects\\practicaRecupperacionProcesos\\src\\output\\Salida2.txt","C:\\Users\\eric\\IdeaProjects\\practicaRecupperacionProcesos\\src\\output\\Salida3.txt","C:\\Users\\eric\\IdeaProjects\\practicaRecupperacionProcesos\\src\\output\\Salida4.txt"};
        for (int i = 0; i < vocales.length ; i++) {
            ProcessLauncher.initMessagePrinter(lorenIpsum, vocales[i], "Salida" + i + ".txt");
            String salida0 = null;
            try {
                BufferedReader br = new BufferedReader(new FileReader(arrayRutas[i]));
                        salida0 = br.readLine();

            } catch (FileNotFoundException e) {

            }
            System.out.println("Proces Complete:" + salida0);

        }



    }
}