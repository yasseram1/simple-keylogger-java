import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Bloc {

    String path;
    File fileTxt;

    public Bloc() {
        this.path = System.getProperty("user.home") + "/Desktop/";
        this.fileTxt = new File(this.path + "KeyLogger.txt");
    }

    private void crearArchivo() {
        try {
            if (!fileTxt.exists()) {
                fileTxt.createNewFile();
                System.out.println("Archivo creado en el escritorio.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escribirEnArchivo(String input) {
        crearArchivo();

        try {
            FileWriter fileWriter = new FileWriter(this.fileTxt, true);
            fileWriter.write(input);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
