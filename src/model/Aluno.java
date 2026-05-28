package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Aluno extends Pessoa{
    private double nota;
    private final Turma turma;
    private LocalDate dataMatricula;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Turma getTurma() {
        return turma;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Aluno(String nome, double nota, int idade, Turma turma, LocalDate dataMatricula) {
        super(nome,idade);
        this.nota = nota;
        this.turma = turma;
        this.dataMatricula = dataMatricula;
        if(nota < 0 || nota > 10) throw new IllegalArgumentException();
    }

    @Override
    public String exibirInfo() {
        return String.format("Aluno: %s | Nota: %s | Turma: %s | Matrícula: %s ", getNome(), this.nota, this.turma, this.dataMatricula.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    public long diasMatriculado(){
        LocalDate agora = LocalDate.now();
        return ChronoUnit.DAYS.between(dataMatricula, agora);
    }
}
