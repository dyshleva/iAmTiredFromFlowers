package ua.edu.ucu.apps.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
// annotation
public class AppUserController {
    private AppUserService appUserService;

    @Autowired
    public AppUserController(AppUserService userService) {
        this.appUserService = userService;
    }

    @GetMapping("/list")
    public List<AppUser> getUser() {
        return appUserService.getUsers();
    }

    @PostMapping("/add")
    public void addUser(@RequestBody AppUser user) {
        // check by mail active users
        appUserService.add(user);
    }

}
