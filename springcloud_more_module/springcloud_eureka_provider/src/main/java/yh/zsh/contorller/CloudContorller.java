package yh.zsh.contorller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/pro")
public class CloudContorller {

    @RequestMapping("/info")
    public String test() {
        return "我是爱的提供者";
    }

}
