package com.example.hexacode.Controller;

import com.example.hexacode.Entity.Badge;
import com.example.hexacode.service.BadgeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/badge")
@RequiredArgsConstructor
@Slf4j
public class BadgeController {
    private final BadgeService badgeService ;

    @PostMapping("/save")
    public Badge saveBadge(@RequestBody Badge badge){
        return badgeService.addBadge(badge);
    }
    @PostMapping("/edit")
    public Badge editBadge(@RequestBody Badge badge){
        return badgeService.editBadge(badge);
    }
    @PostMapping("/addBadgeToUser")
    public void editBadge(@RequestBody String username){
         badgeService.addBadgeToUser(username);
    }

}
