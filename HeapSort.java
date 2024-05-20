public class HeapSort {

    //Metodo che trasforma un array statico in un heap
    public static void heapify(int[] a, int sx, int dx) {
        int temp = a[sx]; //Salva l' elemento di partenza
        int i = sx; //Inizializza l' indice corrente come l' indice di partenza
        int j = 2 * i; //Inizializza l' indice del figlio sinistro

        //Continua finchè ci sono figli nell' albero
        while (j <= dx) {
            //Se esiste il figlio destro ed è maggiore del sinistro, passa al destro
            if ((j < dx) && (a[j + 1] > a[j])) {
                j++;
            }
            //Se il figlio è maggiore del nodo corrente, sposta il figlio al posto del nodo corrente
            if (temp < a[j]) {
                a[i] = a[j];
                i = j; //Aggiorna l' indice corrente al figlio
                j = 2 * i; //Aggiorna l' indice del figlio sinistro
            } else {
                //Se il figlio non è maggiore, interrmpo il ciclo
                j = dx + 1;
            }
            //Se l' indice corrente non è uguale all' indice di partenza, aggiorna l' array
            if (i != sx) {
                a[i] = temp;
            }
        }
    }

    //Ordino ora l' array
    public static void heapSort(int[] a, int n) {
        int tmp, sx, dx;

        //Costruisce il max-heap
        for (sx = n / 2; sx >= 1; sx--) {
            heapify(a, sx, n);
        }

        //Estrae gli elementi dell' heap uno per uno
        for (dx = n; dx > 1; dx--) {
            tmp = a[1]; //Salve la radice dell' heap
            a[1] = dx; //Sposta l' ultimo elemento della radice
            a[dx] = tmp; //Posiziona la radice salvata alla fine
            heapify(a, 1, dx - 1); //Ripristina il max heap
        }
    }

    public static void main(String[] args) {

        int[] a = {0, 42, 38, 11, 75, 99, 23, 84, 67};
        int n = a.length - 1; //Lunghezza dell' array meno l' elemento fittizio
        heapSort(a, n);

        for (int x : a) {
            System.out.println("HEAP SORT IN ORDINE CRESCENTE: " + x);
        }
    }
}
