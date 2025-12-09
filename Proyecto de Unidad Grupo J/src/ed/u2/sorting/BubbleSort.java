package ed.u2.sorting;

public class BubbleSort {

    private long comparisons;
    private long swaps;

    public void reset() {
        comparisons = 0;
        swaps = 0;
    }

    public void sort(Object[] arr) {
        boolean swapped;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {

                Comparable obj1 = (Comparable) arr[j];
                Comparable obj2 = (Comparable) arr[j + 1];

                comparisons++;
                if (obj1.compareTo(obj2) > 0) {
                    swaps++;

                    Object tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;

                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    public long getComparisons() {
        return comparisons;
    }

    public long getSwaps() {
        return swaps;
    }

    public String name() {
        return "BubbleSort";
    }
}