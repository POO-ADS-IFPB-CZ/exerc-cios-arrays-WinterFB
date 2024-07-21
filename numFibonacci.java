public class Main {
    public static void main(String[] args) {
        int numFibonacci[] = new int[30];
        numFibonacci[0] = 1;
        int numPassado = 0;
        int numAtual = 1;
        int i, numVet;

        for (i=0; i<30; i++){
            numFibonacci[i] = numPassado+numAtual;
            
            numVet = i+1;
            System.out.println(""+ numVet + " =" + " "+numFibonacci[i]);
            
            numAtual = numPassado;
            numPassado = numFibonacci[i];
        }
    }
}
