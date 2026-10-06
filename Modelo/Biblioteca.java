package POO.Sem8Paquetes.biblioteca.modelo;
import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private List<Usuario>usuarios;
    /**
     * @param nombre Recibe el nombre del usuario
     */
    public Biblioteca(String nombre){
        this.nombre=nombre;
        this.usuarios= new ArrayList<>();
    }
    /**
     * @param usuario Usuario que se desea registrar
     */
    public void agregarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
}
