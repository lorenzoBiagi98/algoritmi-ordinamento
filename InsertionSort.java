public class InsertionSort {

    public static void main(String[] args) {
        // Array da ordinare
        int[] a = {41, 37, 10, 74, 98, 22, 83, 66};
        int n = a.length;
        // Ciclo che scorre tutti gli elementi dell' array, inizia dal secondo
        for (int i = 1; i < n; i++) {
            // Memorizza il valore dell' elemento corrente
            int value = a[i];
            // Inizializzo l' indice per confrontare value con gli elementi precedenti
            int j = i - 1;
            // Ciclo per spostare gli elementi più grandi dell' elemento corrente verso destra
            // e fare spazio per l' elemento corrente: in linguaggio "umano", metto l'elemento in posizione
            // corretta e "sposto" tutto il blocco di altri elementi verso dx
            while (j >= 0 && a[j] > value) {
                a[j + 1] = a[j]; // Sposto verso destra
                j = j - 1; // Controllo elemento precedente
            }
            // Inserisco valore corrente in posizione corretta
            a[j + 1] = value;
        }

        for (int x : a) {
            System.out.println("INSERTION SORT ORDINATO, IN ORDINE CRESCENTE: " + x);
        }
    }
}
