import java.util.*;

public class HowManyTimedDidItRepeat {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 2, 3, 4, 3, 1);

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Sayıların frekansını hesaplayalım ve frekansları frequencyMap'e ekleyelim
        for (int num : numbers) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        // Sonuçları yazdıralım
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();
            System.out.println("Number " + number + " -> " + frequency + " times");
        }
    }
}
