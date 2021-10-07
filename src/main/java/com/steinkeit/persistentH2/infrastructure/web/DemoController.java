package com.steinkeit.persistentH2.infrastructure.web;

import com.steinkeit.persistentH2.domain.model.User;
import com.steinkeit.persistentH2.domain.model.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class DemoController {

    private final UserService userService;

    public DemoController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{name}")
    public @ResponseBody String addUserToDB(@PathVariable String name) {
        this.userService.save(new User(name));
        return String.format("Saved %s", name);
    }

    @GetMapping("/users")
    public @ResponseBody String allUsers() {
        List<User> users = this.userService.findAllUsers();
        System.out.println(users.size());
        return users.stream().map(User::getName).collect(Collectors.joining("<br>"));
    }
}
