package service;

import model.Aluno;

import java.util.ArrayList;

public class EscolaService {
    ArrayList<Aluno> alunosLista = new ArrayList<>();
    public void adicionar(Aluno alunoNovo) {
        alunosLista.add(alunoNovo);
    }
    public ArrayList<Aluno> listar() {
        return alunosLista;
    }
    public ArrayList<Aluno> listarAprovados() {
        ArrayList<Aluno> alunosAprovados = new ArrayList<>();
        for(Aluno aluno : alunosLista) {
            if(aluno.getNota() >= 6){
                alunosAprovados.add(aluno);
            }
        }
        return alunosAprovados;
    }
    public ArrayList<Aluno> listarReprovados() {
        ArrayList<Aluno> alunosReprovados = new ArrayList<>();
        for(Aluno aluno : alunosLista) {
            if(aluno.getNota() < 6){
                alunosReprovados.add(aluno);
            }
        }
        return alunosReprovados;
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
        return nota/alunosLista.size();
    }

}
