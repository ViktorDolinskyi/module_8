package goit.module_8;

public class Ellipse extends Shape {
    private int majorAxis, minorAxis;
    // конструктор класу
    public Ellipse(String name, int majorAxis, int minorAxis) {
        super(name);
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    // перевизначений метод для виведення інформації про еліпс
    public void draw() {
        System.out.println("Назва фігури: " + name + ", велика вісь = " + majorAxis + ", мала вісь = " + minorAxis);
    }
}
