package labs3and4;

public class Algorithms {

    public static void heapSort(Integer[] arr){
        buildMaxHeap(arr);
        int l = arr.length - 1;
        int heapSize = arr.length;
        for (int i = l; i >= 0 ; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapSize--;
            maxHeapify(arr, 0, heapSize);

        }
    }

    public static void buildMaxHeap(Integer[] arr){
        int heapSize = arr.length -1;
        for (int i = heapSize/2; i >= 0; i--){
            maxHeapify(arr, i, heapSize);
        }
    }

    public static void maxHeapify(Integer[] arr, int i, int heapSize){
        int l = 2*i + 1;
        int r = 2*i + 2;
        int largest = i;

        if (l < heapSize && arr[l] > arr[i]){
            largest = l;
        }
        if (r < heapSize && arr[r] > arr[largest]){
            largest = r;
        }
        if (largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            maxHeapify(arr, largest, heapSize);
        }

    }


    public static void quickSort(Integer[] arr, int p, int r){
        if (p < r) {
            int q = partition(arr, p, r);
            quickSort(arr, p, q - 1);
            quickSort(arr, q + 1, r);

        }
    }

    public static int partition(Integer[] arr, int p, int r){
        int x = arr[r];
        int i = p - 1;
        for (int j = p; j < r; j++){
            if (arr[j] <= x){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;
        return i + 1;
    }
}
