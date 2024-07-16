package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    @Autowired
    @Qualifier(value = "pizza")
    Food food;

    @Autowired Food chicken;
    @Autowired Food pizza;

    @Test
    @DisplayName("테스트1")
    void test1() {
        chicken.eat();
        pizza.eat();
    }

    @Test
    @DisplayName("테스트2")
    void test2() {
        food.eat();
    }

    @Test
    @DisplayName("@Primary와 @Qualifier 중 우선순위가 높은 것은? ==> @Qualifier")
    void test3() {
        food.eat();
    }

}