package com.sparta.springauth.controller;

import com.sparta.springauth.entity.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class ProductController {

    @GetMapping("/products")
    public String getProducts(HttpServletRequest req) {
        System.out.println("ProductController.getProducts : 인증 완료");
        // AuthFilter.doFilter()에서 request.setAttribute("user", user); 했던 user attribute를 가져옴.
        User user = (User) req.getAttribute("user");
        System.out.println("user.getUsername() = " + user.getUsername());

        return "redirect:/";
    }
}