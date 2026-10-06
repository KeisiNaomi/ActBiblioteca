package Biblioteca.App;
import Biblioteca.Modelo.Libro; //import: sirve para llamar a la clase Libro del paquete Biblioteca.Modelo
import Biblioteca.Servicio.Prestamo; //import: Importa la clase Prestamo del paquete Biblioteca.Servicio

/**
 * Aplicacion principal de la biblioteca
 * 
 * @author Kitty
 * @version 1.0
 * @since 05-10-2026
 */
public class Main {

    /**
     * Punto de entrada de la aplicacion
     * @param args Argumentos de linea de comandos
     */
    public static void main(String[] args) {
        Libro libro = new Libro("Clean Code", "Robert C. Martin");
        Libro libro2 = new Libro("Dracula", "Bram Stoker");

        Prestamo prestamo = new Prestamo();
        String mensajePrestamo = prestamo.realizaPrestamo(libro);
        String mensajePrestamo2 = prestamo.realizaPrestamo(libro2);

        System.out.println("=============== Biblioteca ===============");
        System.out.println("---------- Prestamos de Libros ----------");
        System.out.println(mensajePrestamo);
        System.out.println(mensajePrestamo2);
        System.out.println("==========================================");
    }
}