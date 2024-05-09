package co.edu.uniquindio.templatemethod.model;

public abstract class Template {
    public abstract void step1();
    public abstract void step2();

    public abstract void stepN();
    public final void template(){
        step1();
        step2();
        stepN();
    }

}
