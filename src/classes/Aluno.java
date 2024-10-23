package classes;

public class Aluno {

    private Integer matricula;
    private String nome;

    public Aluno(){}

    public Aluno(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getMatricula(){ return this.matricula;}

    public String getNome(){ return this.nome;}
}
