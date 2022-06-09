package com.luo.std;


import com.alibaba.testable.core.annotation.MockDiagnose;
import com.alibaba.testable.core.annotation.MockInvoke;
import com.alibaba.testable.core.model.LogLevel;
import com.luo.demo.Foo;
import com.luo.demo.StaticMethod;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author leijun.luo
 * @Date 2022/5/25 17:55
 * @Version 1.0
 */
public class Foo2Test {

    @MockDiagnose(LogLevel.VERBOSE)
    public static class Mock {
        @MockInvoke(targetClass = Util.class,targetMethod = "add")
        public static String add(int i, int i2) {
            return "bbbb" ;
        }
    }


    @Test
    public void b(){
        String s = Foo2.b();

        Assertions.assertEquals("bbbb", s);

    }


}
