package kea.reactintro.todo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {


    private final TodoRepository todoRepository;

    public InitData(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Create initial todo items
        Todo todo1 = new Todo("Learn basic React");
        Todo todo2 = new Todo("Learn components and props");
        Todo todo3 = new Todo("Learn useState and useEffect hooks");
        Todo todo4 = new Todo("Learn React Router");

        todo1.setCompleted(true);

        // Save todos to the repository
        todoRepository.save(todo1);
        todoRepository.save(todo2);
        todoRepository.save(todo3);
        todoRepository.save(todo4);

        // Log to console
        System.out.println("Initial data has been loaded.");
    }
}
