
package com.ecommerce.controller;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/products")
public class ProductController {
@GetMapping
public String list(){return "Products";}
}
