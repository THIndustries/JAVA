package Java_home_work2;

public class Jewels {
    public static String findJewelsInStones(String jewels, String stones) {
        // Посчитайте сколько драгоценных камней в куче обычных камней
        // Пример:
        // jewels = “aB”, stones = “aaaAbbbB”
        // Результат в консоль ”a3B1”
        String result = "";
        for (int i = 0; i < jewels.length(); i++) {
            int count = 0;
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)){
                    count++;
                }
            }
            result += jewels.charAt(i) + String.valueOf(count);
        }
        return result;
    }
}
