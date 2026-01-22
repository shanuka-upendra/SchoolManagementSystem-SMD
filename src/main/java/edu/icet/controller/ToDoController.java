package edu.icet.controller;

import edu.icet.dto.ToDoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class ToDoController {

    private final RestTemplate restTemplate;

    @GetMapping("/get-todo/{id}")
    public ToDoDto getToDoDto(@PathVariable Integer id){
        String url = "https://jsonplaceholder.typicode.com/todos/1";

        ToDoDto forObject = restTemplate.getForObject(url,ToDoDto.class);

        return forObject;
    }

    @GetMapping("/get-todos")
    public ToDoDto[] getToDo(){
        String url = "https://jsonplaceholder.typicode.com/todos";

        ToDoDto[] forObject = restTemplate.getForObject(url,ToDoDto[].class);

        return forObject;
    }
}
