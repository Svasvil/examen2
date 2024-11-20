
package sebastianvasquezvillaplana_casopractico2;
public class Inventario {
    private String NombreProducto;
    private int idProducto;

    public Inventario(String NombreProducto, int idProducto) {
        this.NombreProducto = NombreProducto;
        this.idProducto = idProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    @Override
    public String toString() {
        return "Inventario{" + "NombreProducto=" + NombreProducto + ", idProducto=" + idProducto + '}';
    }
    
    
    
}
