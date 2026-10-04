public class StringAndStringBuilderConcatenate {
    public static void main(String[] args) {

//String
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            String result = "Сейчас " + "мы" + " протестируем " + "разницу " + "между " + "String" + " и " + "StringBuilder";
            System.out.println(result);
        }
        long endTime = System.currentTimeMillis();
        //StringBuilder
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            StringBuilder result = new StringBuilder();
            result.append("Сейчас ");
            result.append("мы");
            result.append(" протестируем ");
            result.append("разницу ");
            result.append("между ");
            result.append("String");
            result.append(" и ");
            result.append("StringBuilder");
            System.out.println(result);
        }
        long endTime1 = System.currentTimeMillis();

        System.out.println("Время, затраченное на " + "конкатенацию строк с использованием оператора `+`:" + (endTime - startTime) + " мс");
        System.out.println("Время, затраченное на конкатенацию строк " + "с использованием StringBuilder: " + (endTime1 - startTime1) + " мс");
        System.out.println("Итог: \n С использованием оператора `+`: " + (endTime - startTime) + "мс" + " \n C использованием StringBuilder: " + (endTime1 - startTime1) + "мс");
    }
}