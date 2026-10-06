package POO.Sem8Paquetes.biblioteca.modelo;

public class Usuario {
    private String nombre;
    private String numeroIdentificacion;
    /**
     * @param nombre Recibe el nombre del usuario
     * @param numeroIdentifcacion Recibe el numero de identificacion del usuario
     */
    public Usuario(String nombre, String numeroIdentificacion){
        this.nombre=nombre;
        this.numeroIdentificacion=numeroIdentificacion;
    }
    /**
     * @return Nombre del usuario
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * @return Numero de identificacion
     */
    public String getNumeroIdentificacion(){
        return numeroIdentificacion;
    }
}
