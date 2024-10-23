package main;

import classes.Aluno;
import classes.TabelaHash;

public class Main {

    public static void main(String[] args) {

        TabelaHash tabela1 = new TabelaHash();

        Aluno kaua = new Aluno(1951292912, "Kauã");
        Aluno pedro = new Aluno(1231292912, "Pedro");
        Aluno luan = new Aluno(121294212, "Luan");
        Aluno arthur = new Aluno(1212994215, "Arthur");

        tabela1.put(1951292912, kaua);
        tabela1.put(1231292912, pedro);
        tabela1.put(121294212, luan);
        tabela1.put(1212994215, arthur);

        System.out.println(tabela1.get(1951292912).getNome());
        System.out.println(tabela1.get(1951292912).getMatricula());

        System.out.println("------------------");

        System.out.println(tabela1.get(1212994215).getNome());
        System.out.println(tabela1.get(1212994215).getMatricula());
    }
}