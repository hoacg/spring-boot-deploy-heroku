package com.example.eshopdemo.controller;

import com.example.eshopdemo.model.Product;
import com.example.eshopdemo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    IProductService productService;

    @GetMapping("/")
    String index(Model model) {

        try {
            Product product = this.productService.getById(1L);
            model.addAttribute("product", product);
            return "index";
        } catch (Exception e) {
            return "error";
        }
    }

}
