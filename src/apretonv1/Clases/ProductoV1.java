
package apretonv1.Clases;

/**
 *
 * @author a_d_a_h
 */
public class ProductoV1 implements Comparable<ProductoV1> {
    
    private Integer idProducto;
    private String nombre;
    private String descripcion;
    private String foto;
    private Integer stockActual;
    private Integer stockMin;
    private double precioVenta;
    private double precioCompra;
    private CategoriaV1 categoria;
    private MarcaV1 marca;
    
    public ProductoV1(int idProducto, String nombre, String foto,
                    int stockActual, int stockMin, String descripcion,
                    double precioVenta, double precioCompra,
                    CategoriaV1 categoria, MarcaV1 marca) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.foto = foto;
        this.stockActual = stockActual;
        this.stockMin = stockMin;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.categoria = categoria;
        this.marca = marca;
        
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Integer getStockActual() {
        return stockActual;
    }

    public void setStockActual(Integer stockActual) {
        this.stockActual = stockActual;
    }

    public Integer getStockMin() {
        return stockMin;
    }

    public void setStockMin(Integer stockMin) {
        this.stockMin = stockMin;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public CategoriaV1 getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaV1 categoria) {
        this.categoria = categoria;
    }

    public MarcaV1 getMarca() {
        return marca;
    }

    public void setMarca(MarcaV1 marca) {
        this.marca = marca;
    }
    
    /**
     * 
     * @param p
     * @return 
     */
    @Override
    public int compareTo(ProductoV1 p) {
        return Integer.compare(this.idProducto, p.getIdProducto());
    }
    
    @Override
    public String toString() {
        return idProducto + " - " + nombre;
    }
    
    
}
