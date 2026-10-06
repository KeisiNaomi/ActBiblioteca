package POO.Sem8Paquetes.biblioteca.modelo;

import java.util.List;

/**
 * Esta clase representa un libro de una biblioteca X
 * @autor.Ed
 * @version 1.0
 * @since 2026
 * 
 */

public class Libro {
    private String titulo;
    private String autor;

    /**
     * @param titulo Titulo del libro
     * @param autor Autor del libro
     */

    public Libro(String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
    }

    /**
     * @return Titulo del libro
     */
    public String getTitulo(){
        return titulo;
    }
    /**
     * @return Autor del libro
     */
    public String getAutor(){
        return autor;
    }
}
