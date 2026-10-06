package POO.Sem8Paquetes.biblioteca.app;

import java.time.LocalDate;

import POO.Sem8Paquetes.biblioteca.modelo.Biblioteca;
import POO.Sem8Paquetes.biblioteca.modelo.Ejemplar;
import POO.Sem8Paquetes.biblioteca.modelo.EstadoEjemplar;
import POO.Sem8Paquetes.biblioteca.modelo.Libro;
import POO.Sem8Paquetes.biblioteca.modelo.Usuario;
import POO.Sem8Paquetes.biblioteca.servicio.Prestamo;

public class BibliotecaApp {

    public static void main(String[] args) {

        
        Biblioteca biblioteca = new Biblioteca("Biblioteca UV");
        Usuario usuario = new Usuario("Edy", "12345");
        biblioteca.agregarUsuario(usuario);
        Libro libro = new Libro("Clean Code", "Robert C. Martin");  
        Ejemplar ejemplar = new Ejemplar("EJ001", EstadoEjemplar.DISPONIBLE);
        LocalDate fechaPrestamo = LocalDate.now();
        LocalDate fechaDevolucion = fechaPrestamo.plusDays(7);

        
        Prestamo prestamo = new Prestamo(fechaPrestamo, fechaDevolucion);

    
        String resultado = prestamo.realizarPrestamo(usuario, ejemplar);
        System.out.println(resultado);

        
        System.out.println("Estado del ejemplar: " + ejemplar.getEstado());

        
        System.out.println("¿El préstamo está vencido?: ");
            if (prestamo.estaVencido()) {
                System.out.println("El préstamo está vencido.");
            } else {
                System.out.println("El préstamo todavía está vigente.");
            }

        
        prestamo.devolver();

        System.out.println("Préstamo devuelto correctamente.");
    }
}