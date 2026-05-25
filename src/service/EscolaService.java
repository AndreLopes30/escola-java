package service;

import model.Aluno;
import model.AlunoBolsista;
import java.util.ArrayList;

public class EscolaService {
    ArrayList<Aluno> alunos = new ArrayList<>();
    public Aluno adicionar() {

    }
    public Aluno listar() {

    }
    public Aluno listar_aprovados() {

    }
    public Aluno listar_reprovados() {

    }
    public Aluno buscar_aluno() {

    }

    public double exibir_média() {
        double nota = 0;
        for(Aluno aluno : alunos) {
            nota += aluno.getNota();
        }
        return nota/alunos.toArray().length;
    }

}
