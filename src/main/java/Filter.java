import java.util.ArrayList;
import java.util.List;

public class Filter {
    private int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");
        for (int element : source) {
            if (element < treshold) {
                logger.log("Элемент \" " + element + "\" не подходит");
            } else {
                logger.log("Элемент \" " + element + "\" подходит");
                result.add(element);
            }
        }
        return result.stream().sorted().toList();
    }
}