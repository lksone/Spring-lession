package com.demo.kafka.message;


public class HelloMessage {

    public static final String TOPIC = "Hello_kitty";

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "HelloMessage{" +
                "id='" + id + '\'' +
                '}';
    }
}
