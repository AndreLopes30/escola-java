package model;

public class Aluno {
    private String nome;
    private double nota;
    private int idade;
    private final Turma turma;

    public enum Turma {
        A,B
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Turma getTurma() {
        return turma;
    }

    public Aluno(String nome, double nota, int idade, Turma turma) {
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
        this.turma = turma;
    }
}
