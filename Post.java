import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Post {

    public String user = ".//docs//usuarios.daniel";
    Scanner scn;

    FileWriter fw;
    public String datos = ".//docs//publicaciones.daniel";
    File file = new File(datos);

    public void WritePost() throws IOException {
        fw = new FileWriter(file, true);
        fw.write(nombre + "¬" + hora + "¬" + titulo + "¬" + contenido + "\n");
        fw.close();
    }
}
