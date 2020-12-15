package com.kangyonggan.demo;

import org.springframework.stereotype.Service;

/**
 * @author kyg
 */
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public User getUserById(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("name-" + id);
        return user;
    }
}
