package com.example.login2.mapper;

import com.example.login2.to.UserTo;
import com.example.login2.entities.UserEntity;

public class UserMapper {
    public static UserEntity toEntity(UserTo userToMap) {
        if(userToMap == null) {
            return null;
        }
        UserEntity mappedUser = new UserEntity();
        mappedUser.setEmail(userToMap.getEmail());
        mappedUser.setId(userToMap.getId());
        return mappedUser;
    }

    public static UserTo toTo(UserEntity userToMap) {
        if(userToMap == null) {
            return null;
        }
        UserTo mappedUser = new UserTo();
        mappedUser.setEmail(userToMap.getEmail());
        mappedUser.setId(userToMap.getId());
        return mappedUser;
    }
}
