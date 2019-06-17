package com.sample.domain;

/**
 * TODO
 *
 * @author <a href="mailto:ference.zeng@gmail.com">Ference</a>
 * @since 2019-06-06
 */
public class Person {

    private Long id;
    private String name;
    private Integer age;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
