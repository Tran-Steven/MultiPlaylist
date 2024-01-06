package com.transteven.multiplaylist;

import com.transteven.multiplaylist.user.User;
import com.transteven.multiplaylist.user.UserDTO;
import java.util.function.Function;
import org.springframework.stereotype.Service;

@Service
public class UserDTOMapper implements Function<User, UserDTO> {

  @Override
  public UserDTO apply(User user) {
    return new UserDTO(user.getId(), user.getEmail(), user.getPassword());
  }
}
