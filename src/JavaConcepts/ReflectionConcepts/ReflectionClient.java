package JavaConcepts.ReflectionConcepts;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionClient {
    public  static void  main(String[]args){
        Employee emp= new Employee();
        Class clazz = emp.getClass(); //Employee.class;

        Constructor[]arrCons= clazz.getConstructors();
        Annotation[]arrAnnotation= clazz.getAnnotations();
        Field[]arrFields=clazz.getDeclaredFields();
        Class[]arrInterface=clazz.getInterfaces();
        Method[] arrMethod = clazz.getMethods();


        try {
            Constructor constructor =
                    clazz.getConstructor(new Class[]{String.class});

            //get constructor that takes a String as argument
            Constructor constructor1 = Employee.class.getConstructor(String.class);

            Employee myObject = (Employee)
                    constructor.newInstance("constructor-arg1");
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        Field field = null;
        Employee objectInstance = new Employee();
        try {
            field = clazz.getField("EmployeeId");
            Object value = field.get(objectInstance);
            field.set(objectInstance, value);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        Method method = null;
        try {
            method = Employee.class.getMethod("setEmployeeId");
            Object returnValue = method.invoke(objectInstance, "12204");
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        printGettersSetters(Employee.class);


    }

    public static void printGettersSetters(Class aClass){
        Method[] methods = aClass.getMethods();

        for(Method method : methods){
            if(isGetter(method)) System.out.println("getter: " + method);
            if(isSetter(method)) System.out.println("setter: " + method);
        }
    }

    public static boolean isGetter(Method method){
        if(!method.getName().startsWith("get"))      return false;
        if(method.getParameterTypes().length != 0)   return false;
        if(void.class.equals(method.getReturnType())) return false;
        return true;
    }

    public static boolean isSetter(Method method){
        if(!method.getName().startsWith("set")) return false;
        if(method.getParameterTypes().length != 1) return false;
        return true;
    }

}
