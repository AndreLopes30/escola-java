package service;

import model.Aluno;

import java.util.ArrayList;

public class EscolaService {
    ArrayList<Aluno> alunosLista = new ArrayList<>();
    public void adicionar(Aluno alunoNovo) {
        alunosLista.add(alunoNovo);
    }
    public alunosLista listar() {
        for(Aluno aluno : alunosLista) {
            return ArrayList<Aluno>;
        }
        return null;
    }
    public alunosLista listarAprovados() {
        for(Aluno aluno : alunosLista) {
            if(aluno.getNota() >= 6){
                return ArrayList<Aluno>;
            }
        }
        return null;
    }
    public alunosLista listarReprovados() {
        for(Aluno aluno : alunosLista) {
            if(aluno.getNota() < 6){
                return ArrayList<Aluno>;
            }
        }
        return null;
    }
    public Aluno buscarAluno(String busca) {
        for(Aluno aluno : alunosLista) {
            if(aluno.getNome().equals(busca)){
                return aluno;
            }
        }
        return null;
    }

    public double exibirMedia() {
        double nota = 0;
        for(Aluno aluno : alunosLista) {
            nota += aluno.getNota();
        }
        return nota/ alunosLista.toArray().length;
    }

}
