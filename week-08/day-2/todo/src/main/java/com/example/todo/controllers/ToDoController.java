package com.example.todo.controllers;

import com.example.todo.models.ToDo;
import com.example.todo.services.AssigneeServicInterface;
import com.example.todo.services.ToDoServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "todo")
public class ToDoAppController {

    ToDoServiceInterface toDoService;
    AssigneeServicInterface assigneeService;

    @Autowired
    public ToDoAppController(ToDoServiceInterface toDoService, AssigneeServicInterface assigneeService) {
        this.toDoService = toDoService;
        this.assigneeService = assigneeService;
    }

    @GetMapping(value = {"/", "/list"})
    public String listToDos(Model model, @RequestParam(required = false) String ready) {
        if (ready == null) {
            model.addAttribute("todolist", toDoService.findAll());
        } else if (ready.equals("true")) {
            model.addAttribute("todolist", toDoService.findReady());
        }
        return "todolist";
    }

    @PostMapping("search")
    public String search(Model model, @RequestParam(name = "search") String search) {
        model.addAttribute("todolist", toDoService.findTitle(search));
        return "todolist";
    }
    @GetMapping("add")
    public String addTodoRender(){
        return "addtodo";
    }
    @PostMapping("add")
    public String addTodo(Model model, @RequestParam(name = "newTodo") String newTodo) {
        toDoService.addToDo(newTodo);
        return "redirect:/todo/";
    }
    @GetMapping("/delete/{id}")
    public String deleteToDo(@PathVariable ("id") String id ,Model model){
        toDoService.deleteById(id);
        model.addAttribute("todolist",toDoService.findAll());
        return "redirect:/todo/";
    }

    @GetMapping("undone")
    public String listUndoneTodos(Model model) {
        model.addAttribute("todolist",toDoService.findNotReady());
        return "todolist";
    }

    @GetMapping("assignees")
    public String listOfAssignees(Model model) {
        model.addAttribute("assignees", assigneeService.findAll());
        return "assignees";
    }

    @PostMapping("assignees/alter")
    public String alterName(Model model, @RequestParam(name = "name") String name, @RequestParam(name = "newName") String newName) {
        assigneeService.alterName(name, newName);
        model.addAttribute("assignees", assigneeService.findAll());
        return "redirect:/";
    }

    @PostMapping("assignees/delete")
    public String deleteAssignee(Model model, @RequestParam(name = "name") String name) {
        assigneeService.deleteAssignee(name);
        model.addAttribute("assignees", assigneeService.findAll());
        return "assignees";
    }

    @PostMapping("assignees/add")
    public String addAssignee(Model model, @RequestParam(name = "name") String name, @RequestParam(name = "email") String email) {
        assigneeService.addAssignee(name, email);
        model.addAttribute("assignees", assigneeService.findAll());
        return "assignees";
    }
}
