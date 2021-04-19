package com.demo.redis;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LockContent {

    private Long startTime;
    private Long lockExpire;
    private long expireTime;
    private String requestId;
    private Thread thread;
    private long bizExpire;
    private int lockCount;
}
