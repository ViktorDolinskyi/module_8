package goit.module_8;

// клас для прямокутника, що наслідується від Shape
public class Rectangle extends Shape {
    private int width, height;

    // конструктор класу
    public Rectangle(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    // перевизначений метод для виведення інформації про прямокутник
    public void draw() {
        System.out.println("Назва фігури: " + name + ", ширина = " + width + ", висота = " + height);
    }
}
