package cn.massz.service.impl;

import cn.massz.domain.User;
import cn.massz.dao.UserDao;
import cn.massz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务层实现类
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAllUser() {
        return userDao.findAll();
    }
}
