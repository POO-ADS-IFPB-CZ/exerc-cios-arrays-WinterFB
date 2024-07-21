import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int notasAlunos[] = new int[10];
        int i, somaMedia = 0;
        
        // Foi gerado um número aleatório entre 0 e 10 para a nota de cada aluno
        Random rand = new Random();

        for (i=0; i<10; i++){
            notasAlunos[i] = rand.nextInt(10);
            System.out.println("" + notasAlunos[i]);
            // A primeira nota se torna o valor da variável, o restante é somado
            if (i > 0){
                somaMedia = somaMedia + notasAlunos[i];
            } else {
                somaMedia = notasAlunos[i];
            }
        }

        int mediaNotas = somaMedia / 10;
        System.out.println("\nA média de notas foi: " + mediaNotas);

        // Cálculo da quantidade de alunos acima e abaixo da média
        int acimaMedia = 0, abaixoMedia = 0;
        for (i=0; i<10; i++){
            if (notasAlunos[i] >= mediaNotas){
                acimaMedia++;
            } else {
                abaixoMedia++;
            }
        }
        System.out.println("\nAlunos acima da média: " + acimaMedia);
        System.out.println("Alunos abaixo da média: " + abaixoMedia);
    }
}
