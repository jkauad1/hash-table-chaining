package classes;

import java.util.ArrayList;
import java.util.Iterator;

public class TabelaHash {
    private ArrayList<Aluno>[] tabela;
    private final int CAPACIDADE_DEFAULT = 20;

    public TabelaHash(){
        this.tabela = new ArrayList[CAPACIDADE_DEFAULT];
    }

    //Calcula hash usando o método da divisão.
    private int hash(int chave){
        return chave % this.tabela.length;
    }

    //Calcula hash usando o método da multiplicação.
    private int hashMultiplicacao(Integer chave){

        double a = 0.617648934;
        double hash = chave * a;
        hash = (hash % 1) * this.tabela.length;
        return (int)hash; //retorna um inteiro para evitar erro de número quebrado.
    }
    public Aluno get(int chave) {
        int hash = hash(chave);
        ArrayList<Aluno> alunos = this.tabela[hash];

        if (alunos == null)
            return null;

        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == chave)
                return aluno;
        }

        return null;
    }

    public void put(int chave, Aluno valor){

        int hash = hash(chave);
        ArrayList<Aluno> alunos = this.tabela[hash];

        if (alunos == null){

            alunos = new ArrayList<Aluno>();
            alunos.add(valor);
            this.tabela[hash] = alunos;

        } else {
            for (int i = 0; i < alunos.size(); i++){
                if (alunos.get(i).getMatricula() == chave){
                    alunos.set(i, valor);
                    return;
                }
            }

            alunos.add(valor);
        }
    }

    public Aluno remove(int chave){

        int hash = hash(chave);
        ArrayList<Aluno> alunos = this.tabela[hash];

        Iterator<Aluno> it = alunos.iterator();
        Aluno atual = null;

        while(it.hasNext()) {
            atual = it.next();
            if (atual.getMatricula() == chave) {
                it.remove();
                return atual;
            }
        }

        return atual;
    }
}
