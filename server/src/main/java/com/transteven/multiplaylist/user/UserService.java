package com.transteven.multiplaylist.user;

import jakarta.persistence.EntityManager;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

  @Autowired
  public UserService(final UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public boolean emailExists(final String email) {
    return customerDAO.emailExists(email);
  }

  public int getCustomerIdByEmail(final String email) {
    return customerDAO
      .getCustomerByEmail(email)
      .orElseThrow(() ->
        new CustomerNotFoundException(
          String.format("User with email `%s` does not exist.", email)
        )
      )
      .getId();
  }

  public boolean isValidPassword(final int customerId, final String password) {
    final User user = entityManager.find(User.class, customerId);
    return BCrypt.checkpw(password, user.getEncryptedPassword());
  }

  public LoginCustomerDTO getCustomerByEmailAndPassword(
    final String email,
    final String password
  ) {
    final User user = customerDAO
      .getCustomerByEmail(email)
      .orElseThrow(() ->
        new CustomerNotFoundException(
          String.format("User with email `%s` does not exist.", email)
        )
      );
    if (BCrypt.checkpw(password, user.getEncryptedPassword())) {
      return new LoginCustomerDTO(user.getId(), user.getEmail());
    } else {
      throw new LoginCredentialsInvalidException(
        "Email or password credential is incorrect."
      );
    }
  }
}
