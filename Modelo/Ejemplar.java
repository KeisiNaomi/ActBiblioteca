package POO.Sem8Paquetes.biblioteca.modelo;

public class Ejemplar {
    private String codigo;
    private EstadoEjemplar estado;

    public Ejemplar(String codigo, EstadoEjemplar estado){
        this.codigo=codigo;
        this.estado=estado;
    }
    /**
     * @return Codigo del ejemplar
     */
    public String getCodigo(){
        return codigo;
    }
    /**
     * @return Estado del ejemplar
     */
    public EstadoEjemplar getEstado(){
        return estado;
    }
    /**
     * @param estado Cambia el estado del ejemplar
     */
    public void setEstado(EstadoEjemplar estado){
        this.estado=estado;
    }
}
