public class BubbleSort {
    public static void main(String[] args) {
        //Dichiaro e inizializzo l' array da ordinare
        int[] a = {41, 37, 10, 74, 98, 22, 83, 66};
        // n = lunghezza dell' array
        int n = a.length;
        //Dichiaro una variabiel booleana
        boolean scambio = true;
        //Macro ciclo che verrà eseguito fin quando l' array non sarà completamente ordinato
        while (scambio) {
            scambio = false;
            //In questo secondo ciclo confronto elementi adiacenti dell' array, scambiandoli se
            //il primo e maggiore del secondo
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    //Imposto scambio a true se viene effettuato effettivamente uno scambio,
                    //in modo da far continuare l' esecuzione del ciclo while
                    scambio = true;
                }
            }
        }

        for (int x : a) {
            System.out.println("BUBBLE SORT ORDINATO IN ORDINE CRESCENTE: " + x);
        }
    }
}
