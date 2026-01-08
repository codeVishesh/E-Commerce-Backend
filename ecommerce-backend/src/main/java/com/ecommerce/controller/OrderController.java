
package com.ecommerce.controller;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/orders")
public class OrderController {
@PostMapping
public String create(){return "Order placed";}
}
