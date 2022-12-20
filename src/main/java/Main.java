import java.util.*;

public class Main {
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
        System.out.print("Введите размер списка: ");
        size = sc.nextInt();//4
        System.out.print("Введите верхнюю границу для значений: ");
        max = sc.nextInt();//10
        logger.log("Создаем и наполняем список");

        numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add((int) (Math.random() * max) + 1);
        }

        System.out.print("Вот случайный список: ");
        numbers.forEach(element -> System.out.print(element + " "));
        System.out.println();

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        logger.log("Введите порог для фильтра: ");
        min = sc.nextInt();//4

        filter = new Filter(min);
        result = filter.filterOut(numbers);

        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        result.forEach(element -> System.out.print(element + " "));
        System.out.println();

        logger.log("Завершаем программу");
    }
}