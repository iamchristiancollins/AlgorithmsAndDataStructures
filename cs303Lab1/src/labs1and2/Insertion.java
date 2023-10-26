package labs1and2;

public class Insertion {

    public static Integer[] insertionSort(Integer[] list){
        int l = list.length;
        for (int j = 1; j < l; j++){
            Integer key = list[j];
            int i = j - 1;
            while (i >= 0 && list[i].compareTo(key) > 0){
                list[i+1] = list[i];
                i--;
                list[i+1] = key;
            }

        }
        return list;
    }

    public static Integer[] insertionForMerge(Integer[] list, int p, int r){
        int l = list.length;
        for (int j = p+1; j < r+1; j++){
            Integer key = list[j];
            int i = j - 1;
            while (i >= p && list[i].compareTo(key) > 0){
                list[i+1] = list[i];
                i--;
                list[i+1] = key;
            }

        }
        return list;
    }
}
