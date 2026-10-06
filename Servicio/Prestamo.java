package POO.Sem8Paquetes.biblioteca.servicio;
import POO.Sem8Paquetes.biblioteca.modelo.Ejemplar;
import POO.Sem8Paquetes.biblioteca.modelo.EstadoEjemplar;
import POO.Sem8Paquetes.biblioteca.modelo.Usuario;
import java.time.LocalDate;
/**
 * Administra los prestamos de libros
 * @autor Ed
 * @version 1.0
 * @since 2026
 */

public class Prestamo {
   private LocalDate fechaPrestamo;
   private LocalDate fechaDevolucion;
   private Ejemplar ejemplar;

   public Prestamo(LocalDate fechaPrestamo, LocalDate fechaDevolucion){
    this.fechaPrestamo=fechaPrestamo;
    this.fechaDevolucion=fechaDevolucion;
   }

   public String realizarPrestamo(Usuario usuario, Ejemplar ejemplar){ 
    if (ejemplar.getEstado() == EstadoEjemplar.DISPONIBLE){ 
        ejemplar.setEstado(EstadoEjemplar.PRESTADO); 
        return "Préstamo realizado correctamente a " + usuario.getNombre(); 
    } 
    return "El ejemplar no está disponible"; 
    }

   public void devolver(){
    if(ejemplar.getEstado() != null){
        this.ejemplar.setEstado(EstadoEjemplar.DISPONIBLE);
    }
   }

   public boolean estaVencido(){
    LocalDate hoy = LocalDate.now();
    return hoy.isAfter(fechaDevolucion);
   }
}
