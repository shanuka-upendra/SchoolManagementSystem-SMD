package edu.icet.service;

import edu.icet.dto.UserDto;


public interface UserService {
    void addUser(UserDto userDto);
    void updateUser(UserDto userDto);
    void deleteUser(Integer id);
    UserDto searchUser(Integer id);
}
