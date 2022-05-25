package com.demo.base.mode.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/25 21:24
 */
public class MedalServicesFactory {

    private static final Map<String, Strategy> map = new HashMap<>();

    static {
        map.put("guard", new GuardMedalServiceImpl());
        map.put("vip", new VipMedalServiceImpl());
        map.put("guest", new GuestMedalServiceImpl());
    }

    public static Strategy getMedalService(String medalType) {
        return map.get(medalType);
    }
}
