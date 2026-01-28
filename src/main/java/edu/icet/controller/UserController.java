package edu.icet.controller;

import edu.icet.dto.UserDto;
import edu.icet.service.SchoolService;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    final UserService userService;

    @PostMapping("/add-user")
    public void addUser(@RequestBody UserDto userDto){
        userService.addUser(userDto);
    }
}
