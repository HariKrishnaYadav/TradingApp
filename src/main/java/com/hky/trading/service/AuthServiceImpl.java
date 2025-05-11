package com.hky.trading.service;

import com.hky.trading.domain.User;
import com.hky.trading.model.UserDto;
import com.hky.trading.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements  AuthService {

    private UserRepository userRepository;

     @Autowired
     private ModelMapper modelMapper ;

    @Override
    public UserDto save(UserDto userDto) {
      User  user=modelMapper.map(userDto, User.class);
        User userRes = userRepository.save(user);
        return modelMapper.map(userRes,UserDto.class);
    }
}
