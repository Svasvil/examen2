
package sebastianvasquezvillaplana_casopractico2;
public class NodoListaSimple {
    
  
    private NodoListaSimple siguienteNodo;

    public NodoListaSimple(Dato dato) {
        this.dato = dato;
    }
    
 
    private Dato dato;

    public NodoListaSimple getSiguienteNodo() {
        return siguienteNodo;
    }

    public void setSiguienteNodo(NodoListaSimple siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }

    public Dato getDato() {
        return dato;
    }

    public void setDato(Dato dato) {
        this.dato = dato;
    }
}
