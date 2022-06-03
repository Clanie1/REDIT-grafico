<<<<<<< HEAD:posts.java
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
=======
package screens;

import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
>>>>>>> f63886e657dc5c95591bc8058870ec0b9800a14a:screens/posts.java

public class posts {
    String file = "..//docs//publicaciones.daniel";
    File f = new File(file);
    FileWriter fw = new FileWriter(f, true);
    Scanner sc = new Scanner(f);
    String Nombre;
    String Hora;
    String Titulo;
    String Contenido;

    public posts(/* aqui van los argumentos para revizar si es usuario o invitado */) throws IOException {
        if (!f.exists()) {
            f.createNewFile();
        } else {
            while (sc.hasNextLine()) {

            }
        }
    }

}
