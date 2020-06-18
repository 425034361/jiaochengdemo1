package cn.yykjc.jiaochengdemo.user.service;

import cn.yykjc.jiaochengdemo.user.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<UserEntity> getAll(Map map);
    void delById(Integer id);

    public void save(UserEntity userEntity);
}
