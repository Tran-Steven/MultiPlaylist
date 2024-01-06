package com.transteven.multiplaylist.user;

import com.transteven.multiplaylist.user.UserDAO;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UserDAO userDAO;
  private final PasswordEncoder passwordEncoder;

  public void addUser(UserRegistrationRequest userRegistrationRequest) {
    String email = userRegistrationRequest.email();
    if (userDAO.existsUserWithEmail(email)) {
      throw new DuplicateResourceException(
        "User with this email already exists"
      );
    }

    User user = new User(
      userRegistrationRequest.email(),
      passwordEncoder.encode(userRegistrationRequest.password())
    );
    userDAO.insertUser(user);
  }
}
