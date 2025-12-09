package ed.u2.sorting;

public class InsertionSort {

    private long comparisons;
    private long swaps;

    public void reset() {
        comparisons = 0;
        swaps = 0;
    }

    public void sort(Object[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            Object key = arr[i];
            int j = i - 1;

            while (j >= 0) {
                comparisons++;

                Comparable objJ = (Comparable) arr[j];
                Comparable objKey = (Comparable) key;

                if (objJ.compareTo(objKey) > 0) {
                    arr[j + 1] = arr[j];
                    swaps++;
                    j--;
                } else {
                    break;
                }
            }

            arr[j + 1] = key;
        }
    }

    public long getComparisons() {
        return comparisons;
    }

    public long getSwaps() {
        return swaps;
    }

    public String name() {
        return "InsertionSort";
    }
}