package yh.zsh.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yh.zsh.service.FeignExampleService;

import javax.annotation.Resource;

@RestController
@RequestMapping("/feign")
public class ConsumerController {

    @Resource
    private FeignExampleService feignExampleService;

    @RequestMapping("getname")
    public String getname(){
        return feignExampleService.getname();
    }
}
