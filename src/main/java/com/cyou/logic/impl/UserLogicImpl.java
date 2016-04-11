package com.cyou.logic.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyou.common.core.BusinessLogicImpl;
import com.cyou.common.core.Pager;
import com.cyou.common.exception.LogicException;
import com.cyou.dao.UserDao;
import com.cyou.logic.UserLogic;
import com.cyou.po.UserPo;

/**
 * 类UserLogicImpl.java的实现描述：TODO 类实现描述
 * 
 * @author qibaichao 2014年7月21日 下午5:37:57
 */
@Service
public class UserLogicImpl extends BusinessLogicImpl implements UserLogic {

    @Autowired
    private UserDao userDao;

    @Override
    public UserPo getUserById(int userId) throws LogicException {
        UserPo po = this.userDao.selectUserById(userId);
        return po;
    }

    @Override
    public int addUser(UserPo userPo) throws LogicException {
        return this.userDao.insertUser(userPo);
    }

    @Override
    public void deleteUser(int[] userIds) throws LogicException {
        this.userDao.deleteUser(userIds);

    }

    @Override
    public int updateUser(UserPo userPo) throws LogicException {
        return this.userDao.updateUser(userPo);
    }

    @Override
    public int selectCount(Pager pager) throws LogicException {
        return this.userDao.selectCount(pager);
    }

    @Override
    public List<UserPo> selectUserList(Pager pager) throws LogicException {
        return this.userDao.selectUserList(pager);
    }

}
