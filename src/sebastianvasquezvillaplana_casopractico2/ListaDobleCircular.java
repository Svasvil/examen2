package sebastianvasquezvillaplana_casopractico2;

import javax.swing.JOptionPane;

public class ListaDobleCircular {

    private Nodo primerElemento;
    private Nodo ultimoElemento;


    public ListaDobleCircular() {
        this.primerElemento = null;
        this.ultimoElemento = null;
    }

    public Nodo getPrimerElemento() {
        return primerElemento;
    }

    public Nodo getUltimoElemento() {
        return ultimoElemento;
    }
    public void agregarElementoLDC(Inventario inventario) {
        Nodo nuevoNodo = new Nodo(inventario);

        if (primerElemento == null) {
            primerElemento = nuevoNodo;
            ultimoElemento = nuevoNodo;
            nuevoNodo.setSiguiente(primerElemento);
            nuevoNodo.setAnterior(ultimoElemento);
        } else {
            ultimoElemento.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(ultimoElemento);
            nuevoNodo.setSiguiente(primerElemento);
            primerElemento.setAnterior(nuevoNodo);
            ultimoElemento = nuevoNodo;
        }
    }

    public void imprimeDescendente() {
        if (primerElemento != null) {
            Nodo aux = ultimoElemento;
            do {
              JOptionPane.showMessageDialog(null, "ID Producto: " + aux.getInventario().getIdProducto() + " Nombre: " + aux.getInventario().getNombreProducto());
                aux = aux.getAnterior();
            } while (aux != ultimoElemento);
        } else {
            JOptionPane.showMessageDialog(null, "lista vacia ");
        }
    }
}
