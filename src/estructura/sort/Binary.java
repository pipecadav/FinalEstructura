package estructura.sort;


public class Binary {



    StringBuilder alphabet;
    static  int comp = 0;

    public Binary(StringBuilder alphabet, int n) {
        this.alphabet = alphabet;
        binary(this.alphabet, n);
    }

    public void binary(StringBuilder alphabet, int n){
        alphabet = new StringBuilder(alphabet);
        char aux;
        int first;
        int last;
        int center;
        for (int k = 1; k < n; k++){
            aux = alphabet.charAt(k);
            first = 0;
            last = k-1;
            while (first <= last){
                center = (first + last)/2;
                if(aux <= alphabet.charAt(center)){
                    comp++;
                    last = center -1;
                }else{
                    first = center +1;
                    comp++;
                }
            }
            for (int i = k-1; i >= first; i--){
                alphabet.setCharAt(i+1, alphabet.charAt(i));
            }
            alphabet.setCharAt(first, aux);

        }

        this.alphabet = alphabet;

    }


    public StringBuilder getAlphabet(){
        return alphabet;
    }

    public int getComp(){
        return  comp;
    }

}