
package com.ecommerce.model;
import javax.persistence.*;
@Entity
public class Product {
@Id @GeneratedValue private Long id;
private String name;
private double price;
}
