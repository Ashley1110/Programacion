
package apretonv1.Clases;

/**
 *
 * @author a_d_a_h
 */
public class CategoriaV1 {
    
    private Integer idCategoria;
    private String nombre;

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
}
