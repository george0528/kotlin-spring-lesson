package com.example.springboot.controller

import com.example.springboot.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController {
    @Autowired
    lateinit var userRepository: UserRepository

    @GetMapping("/")
    fun showUsers(model: Model): String {
        return "index"
        val users = userRepository.findAll()
        model.addAttribute("users", users)
        return "index"
    }
    
    @GetMapping("/add")
    fun showAddPage(): String {
        return "add"
    }
}