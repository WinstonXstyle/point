package point;

//1. Создать класс Point для представления точек на двумерной плоскости.+
// Объекты этого класса должны содержать два атрибута, которые соответствуют координатам точки на плоскости.+
//2. Создать функцию public static double distance(Point p1, Point p2) которая вычисляет расстояние между двумя точками.+
// Для вычисления квадратного корня можно использовать функцию Math.sqrt+
//3. Сделать запускаемый класс, то есть содержащий функцию public static void main(String[] args) {...} и при помощи него убедиться,
// что функция вычисления расстояния между точками действительно работает.+
// Результат вычисления выводить на экран и контролировать визуально.+
//4. Реализовать то же самое (вычисление расстояния между двумя точками) при помощи метода в классе Point,
// и добавить в созданный в предыдущем пункте запускаемый класс примеры использования метода вместо ранее созданной функции.

public class Point{
    public static double x1;
    public static double y1;
    public static double x2;
    public static double y2;

    public static void main (String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();

        p1.x1 = 9;
        p1.y1 = 4;
        p2.x2 = 5;
        p2.y2 = 1;

        System.out.println("Расстояние между точками " + p1.toString() + " и " + p2.toString1() + " = " + distance(p1,p2));
    }

    public static double distance(Point p1, Point p2){
        return Math.sqrt((p2.x2 - p1.x1) * (p2.x2 - p1.x1) + (p2.y2 - p1.y1)*(p2.y2 - p1.y1));
    }

    public String toString() {
        return this.x1 + ":" + this.y1;
    }


    public String toString1() {
        return this.x2 + ":" + this.y2;
    }
}