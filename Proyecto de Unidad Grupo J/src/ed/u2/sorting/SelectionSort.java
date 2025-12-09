package ed.u2.sorting;

public class SelectionSort {

    private long comparisons;
    private long swaps;

    public void reset() {
        comparisons = 0;
        swaps = 0;
    }

    public void sort(Comparable[] arr) {  //Comparable para objectos
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int min = i;

            for (int j = i + 1; j < n; j++) {
                comparisons++;

                // comparación usando compareTo()
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }

            if (min != i) {
                swaps++;

                // swap de objetos Comparable
                Comparable tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }
    }

    public long getComparisons() {
        return comparisons;
    }

    public long getSwaps() {
        return swaps;
    }

    public String name() {
        return "SelectionSort";
    }
}

