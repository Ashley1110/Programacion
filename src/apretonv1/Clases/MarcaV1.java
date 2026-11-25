
package apretonv1.Clases;

/**
 *
 * @author a_d_a_h
 */
public class MarcaV1 {
    
    private Integer idMarca;
    private String nombre;

    public MarcaV1(Integer idMarca, String nombre) {
        this.idMarca = idMarca;
        this.nombre = nombre;
    }

    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
