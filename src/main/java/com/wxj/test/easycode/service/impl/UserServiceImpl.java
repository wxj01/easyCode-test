package com.wxj.test.easycode.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxj.test.easycode.dao.UserDao;
import com.wxj.test.easycode.entity.User;
import com.wxj.test.easycode.service.UserService;
import org.springframework.stereotype.Service;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2023-02-20 21:12:30
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}

