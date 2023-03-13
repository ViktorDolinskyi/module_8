package goit.module_8;

// клас для трикутника, що наслідується від Shape
public class Triangle extends Shape {
    private int side1, side2, side3;

    // конструктор класу
    public Triangle(String name, int side1, int side2, int side3) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // перевизначений метод для виведення інформації про трикутник
    public void draw() {
        System.out.println("Назва фігури: " + name + ", сторони = " + side1 + ", " + side2 + ", " + side3);
    }
}
