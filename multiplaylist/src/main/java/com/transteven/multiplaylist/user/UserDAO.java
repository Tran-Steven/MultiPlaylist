package com.transteven.multiplaylist.user;

public interface UserDAO {
  void insertUser(User user);
  boolean existsUserWithEmail(String email);
  boolean existsUserWithId(Integer userId);
}
