package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class AnimalsCage {

    private Animal dog;
    private Animal cat;
    private Timer timer;

    @Autowired
    public AnimalsCage(@Qualifier("dog") Animal dog,
                       @Qualifier("cat") Animal cat,
                       Timer timer) {
        this.dog = dog;
        this.cat = cat;
        this.timer = timer;
    }

    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(cat.toString());
        System.out.println("Say:");
        System.out.println(dog.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}
