
package sebastianvasquezvillaplana_casopractico2;
public class Nodo {
    private Inventario inventario;
    private Nodo siguiente;
    private Nodo anterior;


    public Nodo(Inventario inventario) {
        this.inventario = inventario;
        this.siguiente = null;
        this.anterior = null;
    }


    public Nodo() {
        this.siguiente = null;
        this.anterior = null;
    }


    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}

