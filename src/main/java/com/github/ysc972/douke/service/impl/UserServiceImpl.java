package com.github.ysc972.douke.service.impl;

import com.github.ysc972.douke.model.DkUser;
import com.github.ysc972.douke.repository.UserRepository;
import com.github.ysc972.douke.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author 袁士成
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 15127765662
 * @created 2020/1/14 4:12 下午
 * @changeRecord
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public DkUser getUser(String phone) {
        return userRepository.findUserByPhone(phone);
    }
}
