
package com.ecommerce.model;
import javax.persistence.*;
@Entity
public class User {
@Id @GeneratedValue private Long id;
private String email;
private String password;
private String role;
}
