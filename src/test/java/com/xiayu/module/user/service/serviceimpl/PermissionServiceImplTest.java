package com.xiayu.module.user.service.serviceimpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PermissionServiceImplTest {
    @Test
    public void test(){
        Map<String ,String> map = new HashMap<>();
        map.put(null,"abc");
        map.put("abc","abc");
        System.out.println(map.get(null));
        System.out.println(map.get("abc"));
        Set<String> set = new HashSet<>();
        set.add(null);
    }

}