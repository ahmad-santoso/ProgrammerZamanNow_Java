package service;

import entity.TodoList;
import repository.TodoListRepository;

public class TodoListServiceImpl implements TodoListService{

    private TodoListRepository todoListRepository;

    public TodoListServiceImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void showTodoList() {
        TodoList[] model = todoListRepository.getAll();

        System.out.println("TodoList");
        for (var i = 0; i < model.length; i++) {
            var todoList = model[i];
            var no = i + 1;

            if (todoList != null) {
                System.out.println(no + ". " + todoList.getTodo());
            }
        }
    }

    @Override
    public void addTodoList(String todo) {
        TodoList todoList = new TodoList(todo);
        todoListRepository.add(todoList);
        System.out.println("Sukses Menambah Todo : " + todo);
    }

    @Override
    public void removeTodoList(Integer number) {
        boolean success = todoListRepository.remove(number);
        if (success) {
            System.out.println("Sukses Menghapus Todo : " + number);
        } else {
            System.out.println("Gagal Menghapus Todo : " + number);
        }
    }
}
