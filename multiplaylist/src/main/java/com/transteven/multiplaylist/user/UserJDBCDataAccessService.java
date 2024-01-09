package com.transteven.multiplaylist.user;

import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("jdbc")
public class UserJDBCDataAccessService implements UserDAO {

  @Override
  @Query("")
  public void insertUser(User user) {}

  @Override
  @Query("")
  public boolean existsUserWithEmail(String email) {}

  @Override
  @Query("")
  public boolean existsUserWithId(Integer id) {}

  @Override
  @Query(value = "SELECT username from User WHERE username.email")
  public Optional<User> selectUserByEmail(String email) {}
}
