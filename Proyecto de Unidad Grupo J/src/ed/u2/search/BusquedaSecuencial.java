package ed.u2.search;

import java.util.*;
import java.util.function.IntPredicate;

public class BusquedaSecuencial {

    public static int primeraOcurrencia(int[] arreglo, int clave) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == clave) return i;
        }
        return -1;
    }

    public static int ultimaOcurrencia(int[] arreglo, int clave) {
        int ultima = -1;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == clave) ultima = i;
        }
        return ultima;
    }

    public static List<Integer> buscarTodos(int[] arreglo, IntPredicate predicado) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < arreglo.length; i++) {
            if (predicado.test(arreglo[i])) indices.add(i);
        }
        return indices;
    }
}