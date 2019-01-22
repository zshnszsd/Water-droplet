package yh.zsh.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "service-producer",fallback = FeignServiceHystrix.class)
public interface FeignExampleService {
    @GetMapping("/pro/info")
    String getname();
}
