package sebastianvasquezvillaplana_casopractico2;

public class Estructura_ListaSimple {

    private NodoListaSimple primerLugar;

    public void AgregarElementos(Inventario inventario2) {
        if (primerLugar == null) {
            NodoListaSimple nodo = new NodoListaSimple(new Dato(inventario2));
            this.primerLugar = nodo;
        } else {
            NodoListaSimple nodo = new NodoListaSimple(new Dato(inventario2));
            NodoListaSimple aux = this.primerLugar;
            while (aux.getSiguienteNodo() != null && aux.getSiguienteNodo().getDato().getInventario1().getIdProducto() < inventario2.getIdProducto()) {
                aux = aux.getSiguienteNodo();
            }
            nodo.setSiguienteNodo(aux.getSiguienteNodo());
            aux.setSiguienteNodo(nodo);
        }
    }

public Inventario BuscaInventario(String ObjetoBuscar) {
    NodoListaSimple auxl = primerLugar;

    while (auxl != null) {
        Dato dato = auxl.getDato();
        Inventario inventarioPrueba = dato.getInventario1();
        if (inventarioPrueba.getNombreProducto().compareTo(ObjetoBuscar) == 0) {
            return inventarioPrueba; 
        }
        auxl = auxl.getSiguienteNodo();
    }
    return null;
}


}
