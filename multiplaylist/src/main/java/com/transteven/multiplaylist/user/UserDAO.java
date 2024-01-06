package com.transteven.multiplaylist.user;

import java.util.Optional;

public interface UserDAO {
  void insertUser(User user);
  boolean existsUserWithEmail(String email);
  boolean existsUserWithId(Integer userId);
  Optional<User> selectUserByEmail(String email);
}
