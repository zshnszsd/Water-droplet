package yh.zsh.service;

import org.springframework.stereotype.Component;


@Component
public class FeignServiceHystrix implements FeignExampleService {


    @Override
    public String getname() {
        return null;
    }
}
