import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Post {
    String nombre;
    String hora;
    String titulo;
    String contenido;

    Scanner scn;

    FileWriter fw;
    public String datos = "";
    File file = new File(datos);
}