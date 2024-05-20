public class SelectionSort {

    //COMPLESSITA' QUADRATICA IN TUTTI E 3 I CASI
    //NON STABILE
    //IN PLACE
    public static void main(String[] args) {
        // Array da ordinare
        int[] a = {41, 37, 10, 74, 98, 22, 83, 66};
        int n = a.length;

        // Ciclo esterno che itera attraverso tutti gli elementi dell' array, da n - 1 a 0
        for (int i = n - 1; i >= 0; i--) {
            int max = i;
            // Trova l ' indice del massimo elemento nell' array non ordinato
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] > a[max]) {
                    max = j;
                }
            }
            //Se l' indice del massimo elemento è diverso da i, scambia i valori
            if (max != i) {
                System.out.println(max + "max");
                System.out.println(i + "i");
                int temp = a[i];
                a[i] = a[max];
                a[max] = temp;
            }
        }
        for (int x : a) {
            System.out.println("Array ordinato in ordine crescente: " + x);
        }
    }
}
