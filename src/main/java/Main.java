import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int size;
        int max;
        int min;
        List<Integer> numbers;
        Filter filter;
        List<Integer> result;

        Scanner sc = new Scanner(System.in);
        Logger logger = Logger.getInstance();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка: 4");

        size = enterNumber("Введите размер списка: ");
        max = enterNumber("Введите верхнюю границу для значений: ");

        logger.log("Создаем и наполняем список");

        numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add((int) (Math.random() * max) + 1);
        }

        System.out.print("Вот случайный список: ");
        numbers.forEach(element -> System.out.print(element + " "));
        System.out.println();

        logger.log("Просим пользователя ввести входные данные для фильтрации");

        min = enterNumber("Введите порог для фильтра: ");

        filter = new Filter(min);
        result = filter.filterOut(numbers);

        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        result.forEach(element -> System.out.print(element + " "));
        System.out.println();

        logger.log("Завершаем программу");
    }

    public static int enterNumber(String message){
        int result;
        while (true){
            try {
                System.out.print(message);
                result = sc.nextInt();//4
                break;
            }catch (InputMismatchException e){
                System.out.println("Некорректно указано значение!");
            }finally {
                sc.nextLine();
            }
        }
        return result;
    }
}