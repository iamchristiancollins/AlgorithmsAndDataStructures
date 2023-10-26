package labs1and2;

public class Merge {

    public static void mergeWinsert(Integer[] list, Integer[] temp, int p, int r){
        if (p < r){
            int q = (p+r)/2;
            mergeWinsert(list, temp, p, q);
            mergeWinsert(list, temp, q+1, r);
            if (r-p < 100){
                Insertion.insertionForMerge(list, p, r);
            } else {
                merge(list, temp, p, q, r);
            }
        }
    }

    public static void mergeSort(Integer[] list, Integer[] temp, int p, int r){
        if (p < r){
            int q = (p+r)/2;
            mergeSort(list, temp, p, q);
            mergeSort(list, temp, q+1, r);
            merge(list, temp, p, q, r);
        }
    }

    public static void merge(Integer[] list, Integer[] temp, int p, int q, int r){
        int i = p;
        int j = q+1;
        for (int k = p; k <= r; k++){
            temp[k] = list[k];
        }
        for (int k = p; k <= r; k++){
            if (i>q){
                list[k] = temp[j];
                j++;
            } else if (j>r){
                list[k] = temp[i];
                i++;
            } else if (temp[j]<temp[i]){
                list[k] = temp[j];
                j++;
            } else {
                list[k] = temp[i];
                i++;
            }
        }
    }
}
