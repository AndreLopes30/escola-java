package service;

import model.Aluno;

import java.util.ArrayList;

public class EscolaService {
    ArrayList<Aluno> alunosLista = new ArrayList<>();
    public Aluno adicionar() {

    }
    public Aluno listar() {
        for(Aluno aluno : alunosLista) {
            return aluno;
        }
    }
    public Aluno listar_aprovados() {
        for(Aluno aluno : alunosLista) {
            if(aluno.getNota() >= 6){
                return aluno;
            }
        }
    }
    public Aluno listar_reprovados() {
        for(Aluno aluno : alunosLista) {
            if(aluno.getNota() < 6){
                return aluno;
            }
        }
    }
    public Aluno buscar_aluno(String busca) {
        for(Aluno aluno : alunosLista) {
            if(aluno.getNome().equals(busca)){
                return aluno;
            }
        }
    }

    public double exibir_média() {
        double nota = 0;
        for(Aluno aluno : alunosLista) {
            nota += aluno.getNota();
        }
        return nota/ alunosLista.toArray().length;
    }

}
