import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ProcessLauncher {

    public static void initMessagePrinter(String texto, String vocal, String outFileName) {
        ProcessBuilder processBuilder = new ProcessBuilder("java", "C:\\Users\\eric\\IdeaProjects\\practicaRecupperacionProcesos\\src\\VocalCounter.java", texto, vocal);


        String rutaOutput = "C:\\Users\\eric\\IdeaProjects\\practicaRecupperacionProcesos\\src\\output";

        processBuilder.redirectOutput(new File(rutaOutput, outFileName));

        try {

            Process ps = processBuilder.start();
            ps.waitFor();


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
