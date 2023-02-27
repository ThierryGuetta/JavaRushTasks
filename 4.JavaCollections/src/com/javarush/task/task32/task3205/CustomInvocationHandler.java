package com.javarush.task.task32.task3205;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvocationHandler implements InvocationHandler {
    private SomeInterfaceWithMethods SomeInterfaceWithMethods;

    public CustomInvocationHandler(SomeInterfaceWithMethods SomeInterfaceWithMethods) {
        this.SomeInterfaceWithMethods = SomeInterfaceWithMethods;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + " in");
        Object res = method.invoke(SomeInterfaceWithMethods, args);
        System.out.println(method.getName() + " out");
        return res;
    }
}
