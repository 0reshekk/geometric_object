package org.example;

public class Main {
    public static void main(String[] args) {
        Circle circ_1 = new Circle();
        Circle circ_2 = new Circle(4.0);
        Circle circ_3 = new Circle(5.5, "black", true);

        Rectangle rect_1 = new Rectangle();
        Rectangle rect_2 = new Rectangle(2.0, 4.0);
        Rectangle rect_3 = new Rectangle(3.5, 4.5, "blue", false);

        System.out.println("— ○ ◐ ●  Объекты Круга ○ ◐ ● —");
        System.out.println("Круг №1: " + circ_1);
        System.out.printf("Площадь: %.2f, Периметр: %.2f, Диаметр: %.2f\n\n",
                circ_1.getArea(), circ_1.getPerimeter(), circ_1.getDiameter());

        System.out.println("Круг №2: " + circ_2);
        System.out.printf("Площадь: %.2f, Периметр: %.2f, Диаметр: %.2f\n\n",
                circ_2.getArea(), circ_2.getPerimeter(), circ_2.getDiameter());

        System.out.println("Круг №3: " + circ_3);
        System.out.printf("Площадь: %.2f, Периметр: %.2f, Диаметр: %.2f\n\n",
                circ_3.getArea(), circ_3.getPerimeter(), circ_3.getDiameter());

        System.out.println("— ▯▮▯ Объекты Прямоугольника ▯▮▯ —");
        System.out.println("Прямоугольник №1: " + rect_1);
        System.out.printf("Площадь: %.2f, Периметр: %.2f\n\n",
                rect_1.getArea(), rect_1.getPerimeter());

        System.out.println("Прямоугольник №2: " + rect_2);
        System.out.printf("Площадь: %.2f, Периметр: %.2f\n\n",
                rect_2.getArea(), rect_2.getPerimeter());

        System.out.println("Прямоугольник №3: " + rect_3);
        System.out.printf("Площадь: %.2f, Периметр: %.2f\n\n",
                rect_3.getArea(), rect_3.getPerimeter());

        System.out.println("— --- Тестирование Setter-методов --- —");
        circ_1.setRadius(2.0);
        circ_1.setColor("красный");
        circ_1.setFilled(true);

        rect_1.setWidth(7.0);
        rect_1.setHeight(5.0);
        rect_1.setColor("желтый");
        rect_1.setFilled(true);

        System.out.println("Измененный Круг №1: " + circ_1);
        System.out.println("Измененный Прямоугольник №1: " + rect_1);

        System.out.println("\n— --- Тестирование метода «printCircle» --- —");
        circ_2.printCircle();
    }
}