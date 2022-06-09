package com.luo.demo;


import com.alibaba.testable.core.annotation.MockDiagnose;
import com.alibaba.testable.core.annotation.MockInvoke;
import com.alibaba.testable.core.model.LogLevel;
import com.luo.std.Foo2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author leijun.luo
 * @Date 2022/5/25 17:55
 * @Version 1.0
 */
public class FooTest {

    @MockDiagnose(LogLevel.VERBOSE)
    public static class Mock {
        @MockInvoke(targetClass = StaticMethod.class,targetMethod = "function1")
        public static String function1(Integer i) {
            return "aaaa" ;
        }
    }

    @Test
    public void a(){
        String s = Foo.a();

        Assertions.assertEquals("aaaa", s);
    }



}
