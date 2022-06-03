public class Post {

<<<<<<< HEAD
}
=======
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
>>>>>>> dc0adbe7464954281f50c5144a325c4756fd8736
