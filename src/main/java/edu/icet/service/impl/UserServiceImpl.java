package edu.icet.service.impl;

import edu.icet.dto.UserDto;
import edu.icet.entity.UserEntity;
import edu.icet.repository.UserRepository;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    final UserRepository userRepository;

    final ModelMapper modelMapper;

    @Override
    public void addUser(UserDto userDto) {
        userRepository.save(modelMapper.map(userDto, UserEntity.class));
    }

    @Override
    public void updateUser(UserDto userDto) {
        userRepository.save(modelMapper.map(userDto, UserEntity.class));
    }
}
