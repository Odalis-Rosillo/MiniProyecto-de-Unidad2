package ed.u2.search;

public class BusquedaBinaria {

    public static int buscar(int[] arreglo, int clave) {
        int inicio = 0, fin = arreglo.length - 1;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            if (arreglo[medio] == clave) return medio;
            if (arreglo[medio] < clave) inicio = medio + 1;
            else fin = medio - 1;
        }
        return -1;
    }

    public static int lowerBound(int[] arreglo, int clave) {
        int inicio = 0, fin = arreglo.length;
        while (inicio < fin) {
            int medio = inicio + (fin - inicio) / 2;
            if (arreglo[medio] < clave) inicio = medio + 1;
            else fin = medio;
        }
        return inicio;
    }

    public static int upperBound(int[] arreglo, int clave) {
        int inicio = 0, fin = arreglo.length;
        while (inicio < fin) {
            int medio = inicio + (fin - inicio) / 2;
            if (arreglo[medio] <= clave) inicio = medio + 1;
            else fin = medio;
        }
        return inicio - 1;
    }
}