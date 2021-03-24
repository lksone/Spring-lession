package com.demo.thread.pool;

import org.slf4j.MDC;

import java.util.Objects;
import java.util.UUID;

public class MDCUtil {

    private final static String REQUEST_ID = "requestId";

    private MDCUtil() {
    }

    public static void putRequestID() {
        if (Objects.isNull(MDC.get(REQUEST_ID))) {
            MDC.put(REQUEST_ID, UUID.randomUUID().toString().replace("-", ""));
        }
    }

    public static void delRequestID() {
        if (!Objects.isNull(MDC.get(REQUEST_ID))) {
            MDC.remove(REQUEST_ID);
        }
    }

    public static String getRequestID() {
        return MDC.get(REQUEST_ID);
    }
}
