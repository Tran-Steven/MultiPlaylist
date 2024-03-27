package com.transteven.multiplaylist.user;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

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

  protected User() {}

  protected User(final String encryptedPassword) {
    this.encryptedPassword = encryptedPassword;
  }

  public Customer(final String email, final String encryptedPassword) {
    this.email = email;
    this.encryptedPassword = encryptedPassword;
  }
}
