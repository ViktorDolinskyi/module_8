package goit.module_8;

// базовий клас для фігур
public abstract class Shape {
    protected String name;

    // конструктор класу
    public Shape(String name) {
        this.name = name;
    }

    // метод для виведення назви фігури
    public String getName() {
        return name;
    }

    // абстрактний метод для виведення інформації про фігуру
    public abstract void draw();
}


