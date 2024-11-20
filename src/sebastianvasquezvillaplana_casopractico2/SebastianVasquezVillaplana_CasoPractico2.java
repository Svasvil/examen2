package sebastianvasquezvillaplana_casopractico2;

import javax.swing.JOptionPane;

public class SebastianVasquezVillaplana_CasoPractico2 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Primera Parte ");
        Estructura_ListaSimple lista = new Estructura_ListaSimple();
        lista.AgregarElementos(new Inventario("Arroz", 1));
        lista.AgregarElementos(new Inventario("Pescado", 2));
        lista.AgregarElementos(new Inventario("Pollo", 3));
        lista.AgregarElementos(new Inventario("Frijoles", 4));
        lista.AgregarElementos(new Inventario("Agua", 5));
        String ObjetoBuscar = JOptionPane.showInputDialog("Digite la palabra a buscar");
        Inventario productoEncontrado = lista.BuscaInventario(ObjetoBuscar);
        if (productoEncontrado != null) {
            JOptionPane.showMessageDialog(null, "Producto encontrado: " + productoEncontrado.getNombreProducto());
        } else {
            JOptionPane.showMessageDialog(null, "Producto no econtrado , intente otra vez ");
        }
       JOptionPane.showMessageDialog(null, "Segunda Parte");
        JOptionPane.showMessageDialog(null, "orden de arriba hacia abajo ");
       
        ListaDobleCircular lista2 = new ListaDobleCircular();
        lista2.agregarElementoLDC(new Inventario("Arroz", 1));
        lista2.agregarElementoLDC(new Inventario("Pescado", 2));
        lista2.agregarElementoLDC(new Inventario("Pollo", 3));
        lista2.agregarElementoLDC(new Inventario("Frijoles", 4));
        lista2.agregarElementoLDC(new Inventario("Agua", 5));
lista2.imprimeDescendente();
    }
}
