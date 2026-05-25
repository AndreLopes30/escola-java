package model;

public class AlunoBolsista extends Aluno{
    private double bolsa;

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    public AlunoBolsista(String nome, double nota, int idade, char turma, double bolsa) {
        super(nome, nota, idade, turma);
        this.bolsa = bolsa;
    }
}
