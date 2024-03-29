package com.zhifei.cloud.feign;

import com.zhifei.cloud.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserFeignClientHystrixFallBack implements UserFeignClient {

    @Override
    public User findById(Long id) {
        User user1 = new User();
        user1.setId(99L);
        user1.setUsername("哈哈哈");
        return user1;
    }

    @Override
    public User testGet(User user) {
        User user1 = new User();
        user1.setId(1000L);
        user1.setUsername("嘻嘻");
        return user1;
    }
}
