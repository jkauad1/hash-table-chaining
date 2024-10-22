import classes.Aluno;

public class Main {

    public static void main(String[] args) {

        Aluno[] alunos = new Aluno[2000];

        Aluno aluno0 = new Aluno(21,"Kauã");

        alunos[aluno0.getMatricula()] = aluno0;

        System.out.println(alunos[aluno0.getMatricula()].getNome());
    }
}