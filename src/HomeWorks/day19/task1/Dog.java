package HomeWorks.day19.task1;

import HomeWorks.day19.task1.Animal;

public class Dog extends Animal {
    @Override
    protected void voice() {
        System.out.println("voice");
    }


    @Override
    protected void eat() {
        System.out.println("Eat");
    }

    ;
}
