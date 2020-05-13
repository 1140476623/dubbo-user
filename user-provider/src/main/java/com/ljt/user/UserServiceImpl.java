package com.ljt.user;

import com.ljt.IUserService;
import com.ljt.dto.DebitRequest;
import com.ljt.dto.DebitResponse;
import com.ljt.dto.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    UserDao userDao;

    public DebitResponse debit(DebitRequest request) {
        DebitResponse response=new DebitResponse();
        System.out.println("运行了user");
        userDao.updateUser();
        response.setCode("000000");
        response.setMemo("成功");
        return response;
    }
}
