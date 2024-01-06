package com.transteven.multiplaylist.user;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.checkerframework.checker.units.qual.A;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(
  name = "user",
  uniqueConstraints = {
    @UniqueConstraint(name = "user_email_unique", columnNames = "email"),
  }
)
public class User implements UserDetails {

  @Id
  @SequenceGenerator(
    name = "user_id_seq",
    sequenceName = "user_id_seq",
    allocationSize = 1
  )
  @GeneratedValue(
    strategy = GenerationType.SEQUENCE,
    generator = "user_id_sequence"
  )
  @Column(nullable = false)
  private Integer id;

  @Column(nullable = false)
  private String email;

  @Column(nullable = false)
  private String password;

  public User() {}

  public User(Integer id, String email, String password) {
    this.id = id;
    this.email = email;
    this.password = password;
  }

  public User(String email, String password) {
    this.email = email;
    this.password = password;
  }

  // Getters & Setters
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  // Spring Security
  @Override
  public String getPassword() {
    return this.password;
  }

  @Override
  public String getUsername() {
    return email;
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return List.of(new SimpleGrantedAuthority("ROLE_USER"));
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return (
      Objects.equals(id, user.id) &&
      Objects.equals(email, user.email) &&
      Objects.equals(password, user.password)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, password);
  }

  //returns customer info
  @Override
  public String toString() {
    return (
      "Customer{" +
      "id=" +
      id +
      ", email='" +
      email +
      '\'' +
      ", password='" +
      password +
      '\'' +
      '}'
    );
  }
}
