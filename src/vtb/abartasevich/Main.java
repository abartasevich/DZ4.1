package vtb.abartasevich;

public class Main {

    public static void main(String[] args) {
	   //Написать программу для поиска минимального из двух чисел X и Y


        int x = 48;
        int y = 6;
        System.out.println("Ответ:");

        if (x - y == 0) {
            System.out.println("нет минимального числа, x = y (" + x + " = " + y + ")");
        }
        else
        if (x>y) {
            System.out.println("число x > y (" + x + " > " + y + ")");
        }
        else
            System.out.println("число x < y (" + x + " < " + y + ")");

    }
}

