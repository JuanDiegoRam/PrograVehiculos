package proyectotiendavehiculos;

import javax.swing.JOptionPane;

public class Vehiculos {

    int cantidad = 3;

    int codProds[] = new int[]{1, 2, 3};
    String nombres[] = new String[]{"Toyota Corolla 2022", "Audi A4 2022", "Chevrolet Camaro 2022"};
    int precios[] = new int[]{30000, 50000, 65000};

    int codProdCarrito[] = new int[10];
    int cantCarrito[] = new int[10];
    int subtCarrito[] = new int[10];
    
    int cantLineas = 0;

    public int[] getCodProds() {
        return codProds;
    }

    public String[] getNombres() {
        return nombres;
    }

    public int[] getPrecios() {
        return precios;
    }

    public int[] getCantCarrito() {
        return cantCarrito;
    }

    public int getCantidad() {
        return cantidad;
    }
}
