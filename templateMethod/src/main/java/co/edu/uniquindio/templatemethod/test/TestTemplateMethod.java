package co.edu.uniquindio.templatemethod.test;

import co.edu.uniquindio.templatemethod.model.*;

public class TestTemplateMethod {
    public static void main(String[] args) {
        Template templateA = new ConcreteTemplateA();
        templateA.template();
        EnemyTemplate warrior = new Warrior();
        EnemyTemplate mage = new Mage();
        warrior.template();
        mage.template();
    }
}
