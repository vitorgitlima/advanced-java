package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TodoListSVA{

    List<String> todoList = new ArrayList<>();

    public void adicionarTarefas(String... tarefas){
        todoList.addAll(Arrays.asList(tarefas));
    }

}

public class TodoListSemVarArgs {

    public static void main(String[] args) {

        TodoListSVA exemplo = new TodoListSVA();

        exemplo.adicionarTarefas("Estudar java");
        exemplo.adicionarTarefas("Estudar Java", "Tomar café");
        exemplo.adicionarTarefas(new String[] {"Ler livro", "Fazer exercícios"});

        System.out.println(exemplo);

    }
}
