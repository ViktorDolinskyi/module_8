package goit.module_8;

// клас для кола, що наслідується від Shape
public class Circle extends Shape {
    private int radius;

    // конструктор класу
    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    // перевизначений метод для виведення інформації про коло
    @Override
    public void draw() {
        System.out.println("Назва фігури: " + name + ", радіус = " + radius);
    }
}
