package co.edu.uniquindio.templatemethod.model;

public class ConcreteTemplateA  extends Template{
    @Override
    public void step1() {
        System.out.println("Step 1 class A");
    }

    @Override
    public void step2() {
        System.out.println("Step 2 Class A");
    }

    @Override
    public void stepN() {
        System.out.println("Step N Class A");
    }
}
