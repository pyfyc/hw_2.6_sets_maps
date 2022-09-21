import java.util.*;

public class Main {
    public static void main(String[] args) {
        task4();
    }

    // Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
    // Код должен работать с любой последовательностью и объемом списка чисел.
    private static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        System.out.println(nums.toString());

        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }

    // Напишите код, с помощью которого можно напечатать только четные числа без повторений
    // в порядке возрастания.
    // Код должен работать с любой последовательностью и объемом списка чисел.
    private static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(8, 8, 1, 1, 10, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> evenNums = new HashSet<>();

        Collections.sort(nums);
        System.out.println(nums.toString());

        for (Integer num : nums) {
            if (num % 2 == 0) {
                evenNums.add(num);
            }
        }
        System.out.println(evenNums.toString());
    }

    // Напишите код, который выводит в консоль все уникальные слова из списка слов,
    // в котором могут встречаться дубли.
    // В качестве отладочной информации возьмите произвольный набор слов или текст,
    // в котором встречаются повторения.
    // Код должен работать с любой последовательностью и объемом списка слов.
    private static void task3() {
        List<String> words = new ArrayList<>(List.of("one", "two", "three", "four", "five", "five", "six", "seven", "seven", "one", "eight", "nine", "ten"));
        Set<String> uniqueWords = new HashSet<>(words);

        System.out.println(words.toString());
        System.out.println(uniqueWords.toString());
    }

    // Напишите код, который выводит в консоль все количество дублей из списка слов.
    // Например, у вас есть текст из 6 слов, в котором есть одно слово, которое повторяется.
    // В таком случае в консоли выведется результат "2", то есть то количество элементов,
    // которые повторяются.
    // В качестве отладочной информации возьмите произвольный набор слов или текст,
    // в котором встречаются повторения.
    // Код должен работать с любой последовательностью и объемом списка слов.
    private static void task4() {
        List<String> words = new ArrayList<>(List.of("one", "two", "one", "three", "four", "five", "five", "six", "seven", "seven", "one", "eight", "nine", "ten"));
        Map<String, Integer> duplicates = new HashMap<>();

        System.out.println(words);

        for (String word : words) {
            if (duplicates.containsKey(word)) {
                duplicates.put(word, duplicates.get(word) + 1);
            } else {
                duplicates.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> word : duplicates.entrySet()) {
            if (word.getValue() > 1) {
                System.out.print(word.getValue() + " ");
            }
        }
    }
}