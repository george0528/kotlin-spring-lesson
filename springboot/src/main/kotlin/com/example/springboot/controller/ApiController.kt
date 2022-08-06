package com.example.springboot.controller

import com.example.springboot.entity.User
import com.example.springboot.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ApiController {
    @Autowired
    lateinit var userRepository: UserRepository

    @GetMapping("")
    fun getApi(): String {
        return "ハロー a"
    }

    @GetMapping("/users")
    fun getUsers(): Iterable<User> {
        return userRepository.findAll()
    }
    
    @GetMapping("/param")
    fun getParam(@RequestParam param: String): String {
        return "[${param}] がリクエストされました"
    }
}