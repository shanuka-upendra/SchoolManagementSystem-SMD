package edu.icet.controller;

import edu.icet.dto.UserDto;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    final UserService userService;

    @PostMapping("/add-user")
    public void addUser(@RequestBody UserDto userDto){
        userService.addUser(userDto);
    }

    @PutMapping("/update-user")
    public void updateUser(@RequestBody UserDto userDto){
        userService.updateUser(userDto);
    }

    @DeleteMapping("/delete-user/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
    }

    @GetMapping("/search-user/{id}")
    public UserDto searchUser(@PathVariable Integer id){
        return userService.searchUser(id);
    }
}
