import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Post {
    String nombre;
    String hora;
    String titulo;
    String contenido;

    public Post(String nombre) throws IOException {
        fw = new FileWriter(file, true);
        fw.write(nombre + "¬" + hora + "¬" + titulo + "¬" + contenido + "\n");
        fw.close();
    }

    Scanner scn;

    FileWriter fw;
    public String datos = ".//docs//publicaciones.daniel";
    File file = new File(datos);

}
