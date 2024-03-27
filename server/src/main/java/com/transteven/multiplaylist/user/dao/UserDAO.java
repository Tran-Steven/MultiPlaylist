package com.transteven.multiplaylist.user.dao;

import com.transteven.multiplaylist.user.User;
import java.util.Optional;

public interface UserDAO {
  boolean emailExists(String email);
  Optional<User> getUserByEmail(String email);
  void createUser(User user);
  void updateUser(User user);
}
