
package screens;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class posts {
    String file = "..//docs//publicaciones.daniel";
    File f = new File(file);
    FileWriter fw = new FileWriter(f, true);
    Scanner sc = new Scanner(f);
    String Nombre;// que esto se llene con la info del usuario
    String Hora;
    String Titulo;
    String Contenido;

    public posts(/* aqui van los argumentos para revizar si es usuario o invitado */) throws IOException {
        if (!f.exists()) {
            f.createNewFile();
        } else {
            while (sc.hasNextLine()) {
                Nombre = sc.nextLine();
                Hora = sc.nextLine();
                Titulo = sc.nextLine();
                Contenido = sc.nextLine();
            }
        }
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getHora() {
        return Hora;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getContenido() {
        return Contenido;
    }

    public String getNombre() {
        return Nombre;
    }

}
