package org.example;
import java.util.HashMap;
import java.util.ArrayList;

public class ToDo {
    private HashMap<String, ArrayList<String>> hash;

    public ToDo(){
        this.hash = new HashMap<>();
    }

    public void addTask(String tag, String task){
        this.hash.putIfAbsent(tag, new ArrayList<>()); //verifica, por meio do metodo outIfAbsent se a teg já está presente na HashMap, se não estiver
        this.hash.get(tag).add(task); // Tarefa é adicionada à lista e relacionada à teg
    }

    public void remove(String tag, String task){
        if(this.hash.containsKey(tag)){ // Verifica-se a existência da key(tag) na lista
            this.hash.get(tag).remove(task); // Se houver, a tesk é retirada
            if(this.hash.get(tag).isEmpty()){ // Se a lista relacionada à tag estiver vázia, a tag também é removida;
                this.hash.remove(tag);
            }
        }
    }

    public String setCaterogias(){
        StringBuilder string = new StringBuilder();
        for(String tag: this.hash.keySet()){
            string.append(tag).append("\n");
        }
        return string.toString();
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder(); // Cria-se um objeto StringBuilder, responsável por armazenar o retorno


        for(String tag: this.hash.keySet()){ //Laço for percorre todos os valores, representando-os por 'tag'
            int contador = 1;
            builder.append("Categoria: ").append(tag).append("\n"); //Cada valor "abre" um "leque" com as categorias
            for(String task: this.hash.get(tag)){ // A partir das keys (tag) o faço percorre pelo HashMap, retornando os valores;
                builder.append(" ").append(contador).append(". ").append(task).append("\n");
                contador++;
                System.out.println("");
            }
        }
        return builder.toString();
    }
}