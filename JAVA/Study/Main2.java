interface Converter {
    String convert(String s) throws Exception;
}

public class Main2 {
    static String run(String[] arr, Converter c) {
        String result = "";
        for (String s : arr) {
            try {
                result += c.convert(s);
            } catch (Exception e) {
                result += "X";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] data = {"Hello", "", "Java", "Hi"};

        Converter c1 = (s) -> {
            if (s.length() == 0)
                throw new Exception();
            return String.valueOf(s.charAt(0));
        };

        Converter c2 = (s) -> s.length() >= 4 ? s.toUpperCase() : s;

        System.out.println(run(data, c1));
        System.out.println(run(data, c2));
    }
}