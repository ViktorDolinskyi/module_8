package goit.module_8;

// клас для квадрата, що наслідується від Shape
public class Square extends Shape {
    private int side;

    // конструктор класу
    public Square(String name, int side) {
        super(name);
        this.side = side;
    }

    // перевизначений метод для виведення інформації про квадрат
    @Override
    public void draw() {
        System.out.println("Назва фігури: " + name + ", сторона = " + side);
    }
}
