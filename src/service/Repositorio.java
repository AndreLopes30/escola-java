package service;
import java.util.ArrayList;
import java.util.List;

public class Repositorio<T> {
    private ArrayList<T> lista = new ArrayList<>();
    public void adicionar(T item){
        lista.add(item);
    }

    public List<T> listar(){
        return lista;
    }

    public T buscarPorIndice(int indice){
        return lista.get(indice);
    }

    public int tamanho(){
        return lista.size();
    }
}
