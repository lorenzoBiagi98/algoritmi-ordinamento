public class MergeSort {

    //Unisce due sottoarray ordinati in un unico array ordinato
    public static void merge(int[] a, int left, int center, int right) {
        int i = left; //Indice iniziale del primo sottoarray
        int j = center + 1; //Indice iniziale del secondo sottoarray
        int k = 0; //Indice iniziale per l' array temporaneo
        int[] b = new int[right - left + 1]; //Array temporaneo per unire gli elementi

        //Ciclo per unire gli elementi dei due sottoarray fino a quando uno dei due è esaurito
        while ((i <= center) && (j <= right)) {
            if (a[i] <= a[j]) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }
            k++;
        }
        //Copia degli elementi rimanenti del primo sottoarray
        while (i <= center) {
            b[k] = a[i];
            i++;
            k++;
        }
        //Copia degli elementi rimanenti del secondo sottoarray
        while (j <= right) {
            b[k] = a[j];
            j++;
            k++;
        }
        //Copia degli elementi uniti dall' array temporaneo b all' array originale a
        for (k = left; k <= right; k++) {
            a[k] = b[k - left];
        }
    }


    //Metodo ricorsivo per l' ordinamento tramite merge sort
    public static void mergesort(int[] a, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;//Trova il punto centrale per dividere l' array
            mergesort(a, left, center); //Applica mergesort alla metà a sinistra
            mergesort(a, center + 1, right);//Applica mergesort alla metà a destra
            merge(a, left, center, right);//Unisce le due metà ordinate
        }
    }

    public static void main(String[] args) {
        int[] a = {41, 37, 10, 74, 98, 22, 83, 66};
        int n = a.length;
        mergesort(a, 0, n - 1);//Avvia il mergesort sull'interno array

        for (int x : a) {
            System.out.println("MERGE SORT IN ORDINE CRESCENTE: " + x);
        }
    }
}
