package ed.u2.search;

public class BusquedaSecuencialCentinela {

    public static int buscarConCentinela(int[] arreglo, int clave) {
        if (arreglo.length == 0) return -1;

        int ultimo = arreglo[arreglo.length - 1];
        arreglo[arreglo.length - 1] = clave;

        int i = 0;
        while (arreglo[i] != clave) i++;

        arreglo[arreglo.length - 1] = ultimo;

        if (i < arreglo.length - 1 || ultimo == clave) return i;
        return -1;
    }
}