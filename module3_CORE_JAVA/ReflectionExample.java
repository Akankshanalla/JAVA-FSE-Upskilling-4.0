import java.lang.reflect.*;

public class ReflectionExample {
    public void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("ReflectionExample");

        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Method: " + m.getName() + ", Params: " + m.getParameterCount());
        }

        Object instance = clazz.getDeclaredConstructor().newInstance();

        Method sayHello = clazz.getDeclaredMethod("sayHello", String.class);
        sayHello.invoke(instance, "World");
    }
}