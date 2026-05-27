package model;

public class Aluno extends Pessoa{
    private double nota;
    private final Turma turma;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Turma getTurma() {
        return turma;
    }

    public Aluno(String nome, double nota, int idade, Turma turma) {
        super(nome,idade);
        this.nota = nota;
        this.turma = turma;
    }

    @Override
    public String exibirInfo() {
        return String.format("Aluno: %s | Nota: %s | Turma: %s ", this.nome, this.nota, this.turma);
    }
}
