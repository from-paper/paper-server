package kr.co.frompaper.paperserver.controller;

import kr.co.frompaper.paperserver.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @PostMapping("")
    public User generateUser(@RequestBody User user) {
        return user;
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable(name = "id") String userId) {
        return userId;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable(name = "id") String userId) {
        return userId;
    }

    @PutMapping("/{id}")
    public String modifyUser(@PathVariable(name = "id") String userId) {
        return userId;
    }

    @GetMapping("")
    public Integer getAllUsers(@RequestParam Integer page) {
        return page;
    }
}
