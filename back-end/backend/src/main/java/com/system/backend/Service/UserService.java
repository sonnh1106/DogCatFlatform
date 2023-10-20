package com.system.backend.Service;

import com.system.backend.Dto.LoginDTO;
import com.system.backend.Dto.UserDTO;
import com.system.backend.Entity.User;
import com.system.backend.payload.response.LoginMessage;

import java.util.List;

public interface UserService {
    String addUser(UserDTO userDTO);
    LoginMessage loginUser(LoginDTO loginDTO);
    List<User> getUsers();
    User getUser(Integer user_id);
    String deleteUser(Integer user_id);
    String updateUser(Integer user_id, UserDTO userDTO);
    String checkUserPassword(String password, String account);
    String setUserPassword(String password, String account);
}