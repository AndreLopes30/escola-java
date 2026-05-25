package model;

public class Aluno {
    private String nomme;
    private double nota;
    private int idade;
    private char turma;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNomme() {
        return nomme;
    }

    public void setNomme(String nomme) {
        this.nomme = nomme;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getTurma() {
        return turma;
    }

    public void setTurma(char turma) {
        this.turma = turma;
    }

    public Aluno(String nomme, double nota, int idade, char turma) {
        this.nomme = nomme;
        this.nota = nota;
        this.idade = idade;
        this.turma = turma;
    }
}
