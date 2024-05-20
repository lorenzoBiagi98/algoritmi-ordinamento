public class QuickSort {
    public static void quicksort(int[] a, int sx, int dx) {
        int i = sx; //Inizializzo l' indice sinistro
        int j = dx; //Inizializzo l' indice destro
        int pivot = a[(sx + dx) / 2]; //Scelgo il pivot
        //Divido l' array a partire dal pivot
        while (i <= j) {
            //Sposta i verso dx finche non trova un elemento >= di pivot
            while (a[i] < pivot) {
                i++;
            }
            //Sposta j verso sinistra finche non trova un elemento <= di pivot
            while (a[j] > pivot) {
                j--;
            }
            //Se i e j non si sono incrociati
            if (i <= j) {
                //Se i è diverso da j, scambia gli elementi a[i] e a[j]
                if (i < j) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                //Come da descrizione, incrementa i e decrementa j
                i++;
                j--;
            }
        }
        //Ricorsione su parte sinistra se ci sono ancora elementi
        if (sx < j) {
            quicksort(a, sx, j);
        }
        //Ricorsione su parte destra se ci sono ancora elementi
        if (i < dx) {
            quicksort(a, i, dx);
        }
    }

    public static void main(String[] args) {
        //Dichiaro e inizializzo l' array
        int[] a = {41, 37, 10, 74, 98, 22, 83, 66};
        int n = a.length;
        quicksort(a, 0, n - 1);
        for (int x : a) {
            System.out.println("QUICK SORT IN ORDINE CRESCENTE: " + x);
        }
    }
}
