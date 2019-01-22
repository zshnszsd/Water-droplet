package yh.zsh.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Resource
    private RestTemplate restTemplate;


    @Override
    public String getname() {

        return restTemplate.getForObject("http://service-producer/pro/info",String.class);
    }
}
