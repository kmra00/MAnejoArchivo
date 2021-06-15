package test;

import static utileria.Archivo.*;

public class PruebaArchivo {

    public static void main(String[] args) {
        String nombreArchivo = "X:\\JAVA\\CURSO_JAVA\\ArchivoManejo\\ArchivoCreado.txt";

//        crearArchivo(nombreArchivo);
//        escribirArchivo(nombreArchivo);
        anexarArchivo(nombreArchivo);
        leerArchivo(nombreArchivo);
    }

}
