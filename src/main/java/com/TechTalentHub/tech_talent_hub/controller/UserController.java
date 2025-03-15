//package com.TechTalentHub.tech_talent_hub.controller;
//
//import com.TechTalentHub.tech_talent_hub.model.Users;
//import com.TechTalentHub.tech_talent_hub.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/user")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @GetMapping
//    public ResponseEntity<?> getAllUsers(){
//        return ResponseEntity.ok(userService.findAllUsers());
//    }
//
//    @PostMapping
//    public ResponseEntity<?> saveUser(@RequestBody Users user){
//        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
//    }
//}
