package yh.zsh.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yh.zsh.service.ConsumerService;

import javax.annotation.Resource;

@RestController
@RequestMapping("/con")
public class ConsumerController {

    @Resource
    private ConsumerService service;

    @RequestMapping("/getname")
    public String getname(){
        return service.getname();
    }

}