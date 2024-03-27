package com.transteven.multiplaylist.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, updatable = false)
  protected int id;

  @Column(nullable = false)
  protected String encryptedPassword;

  @Column(nullable = false, updatable = false, unique = true)
  private String email;

  protected User(final String encryptedPassword) {
    this.encryptedPassword = encryptedPassword;
  }

  public User(final String email, final String encryptedPassword) {
    this.email = email;
    this.encryptedPassword = encryptedPassword;
  }
}
