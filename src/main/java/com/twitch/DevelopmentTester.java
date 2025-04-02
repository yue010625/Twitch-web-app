package com.twitch;


import com.twitch.user.UserService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DevelopmentTester implements ApplicationRunner {


    private final UserService userService;


    public DevelopmentTester(UserService userService) {
        this.userService = userService;
    }




    @Override
    public void run(ApplicationArguments args) {
        userService.register("default", "123456", "John", "Smith");
    }
}

