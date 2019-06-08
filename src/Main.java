import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array = input.nextLine().split(" "); // => "abc" "afsasSA", "wasasdsf"
        for (String e:array){
            if (Pattern.matches(".*?a.*?b.*?c.*?",e))
                System.out.println(e);
        }

    }
}
