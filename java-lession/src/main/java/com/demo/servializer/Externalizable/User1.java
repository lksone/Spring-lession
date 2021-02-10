package com.demo.servializer.Externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class User1 implements Externalizable {

    private String username;

    private int age;

    private String addr;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(username);
        out.writeInt(age);
        out.writeObject(addr);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        username = (String) in.readObject();
        age = in.readInt();
        addr = (String) in.readObject();
    }

    @Override
    public String toString() {
        return "User1{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                '}';
    }
}
