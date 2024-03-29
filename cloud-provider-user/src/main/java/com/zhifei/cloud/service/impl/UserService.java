package com.zhifei.cloud.service.impl;

import com.zhifei.cloud.entity.User;
import com.zhifei.cloud.repository.UserRepository;
import com.zhifei.cloud.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Long id) {
        User user = userRepository.getOne(id);
        Long id_ = user.getId();
        String username_ = user.getUsername();
        short age_ = user.getAge();
        return user;
    }
}
