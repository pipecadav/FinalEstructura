package estructura.sort;

public class Merge {

    StringBuilder alphabet;
    static  int comp = 0;

    public Merge(StringBuilder alphabet, int n){
        this.alphabet = alphabet;
        mergeSort(this.alphabet,0, n);
    }

    public  void mergeSort(StringBuilder alphabet, int init, int n) {
        int n1; int n2;
        if (n > 1) {
            n1 = n / 2;
            n2 = n - n1;
            mergeSort(alphabet, init, n1);
            mergeSort(alphabet, init + n1, n2);
            merge(alphabet, init, n1, n2);
        }
    }

    private void merge(StringBuilder alphabet, int init, int n1, int n2) {
        char [ ] buffer = new char[n1+n2];
        int temp  = 0;
        int temp1 = 0;
        int temp2 = 0;
        int i;
        while ((temp1 < n1) && (temp2 < n2)) {
            comp ++;
            if (alphabet.charAt(init + temp1) < alphabet.charAt(init + n1 + temp2))
                buffer[temp++] = alphabet.charAt(init + (temp1++));
            else
                buffer[temp++] = alphabet.charAt(init + n1 + (temp2++));
        }
        while (temp1 < n1)
            buffer[temp++] = alphabet.charAt(init + (temp1++));
        while (temp2 < n2)
            buffer[temp++] = alphabet.charAt(init + n1 + (temp2++));
        for (i = 0; i < n1+n2; i++)
            alphabet.setCharAt(init + i, buffer[i]);
    }


    public StringBuilder getAlphabet(){
        return alphabet;
    }

    public int getComp(){
        return  comp;
    }

}