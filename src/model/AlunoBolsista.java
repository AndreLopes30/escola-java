package model;

import java.time.LocalDate;

public class AlunoBolsista extends Aluno {
    private double bolsa;

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    public AlunoBolsista(String nome, double nota, int idade, Turma turma, LocalDate dataMatricula, double bolsa) {
        super(nome, nota, idade, turma, dataMatricula);
        this.bolsa = bolsa;
    }

    @Override
    public String exibirInfo() {
        return String.format("Aluno: %s | Nota: %s | Turma: %s | Bolsa: %s ", getNome(), getNota(), getTurma(), this.bolsa);
    }
}
