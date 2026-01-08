
package com.ecommerce.model;
import javax.persistence.*;
@Entity
@Table(name="orders")
public class Order {
@Id @GeneratedValue private Long id;
private String status;
}
