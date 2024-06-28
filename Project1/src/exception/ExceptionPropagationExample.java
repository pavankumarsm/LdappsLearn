package exception;

import java.io.IOException;

public class ExceptionPropagationExample {

    private void method1()  {
    	
        method2();
    }

    private void method2()  {
        method3();
    }

    private void method3()  {
        method4();
    }

    private void method4(){
        boolean condition = false;
        if (condition) {
            System.out.println("exception in method4");
        } else {
            method5();
        }
    }

    private void method5()  {
        method6();
    }

    private void method6()  {
        method7();
    }

    private void method7() {
        boolean condition = true;
        if (condition) {
            throw new RuntimeException("  uncheckedException occurred in method7");
        } 
    }

    private void method8() {
        try {
            method1();
        } catch(RuntimeException e) {
        	System.err.println("RuntimeException caught in method8"+ e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Exception caught in method8");
        }
    }

    public static void main(String[] args) {
        ExceptionPropagationExample obj = new ExceptionPropagationExample();
        obj.method8();
    }
}
