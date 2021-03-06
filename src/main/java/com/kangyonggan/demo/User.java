package com.kangyonggan.demo;

import java.io.Serializable;

/**
 * @author kyg
 */
public class User implements Serializable {

    /**
     * 用户ID
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
