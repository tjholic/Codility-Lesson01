import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter any Integer value : ");

        String input = scanner.nextLine();

        System.out.println("Input : " + input);

        try {
            int inputValue = Integer.parseInt(input);
            System.out.println("Output : " + solution(inputValue));
        } catch (Exception e) {
            System.out.print("Invalid value.");
        }

    }

    public static int solution(int N) {
        String binaryInputValue = Integer.toBinaryString(N);

        int maxCount = 0, tmpCount = 0;
        boolean isCounted = false;

        for (int i = 0; i < binaryInputValue.length(); i++) {
            if ((isCounted == true || tmpCount > 0) && binaryInputValue.substring(i, i + 1).equals("0")){
                tmpCount++;
            }

            if (binaryInputValue.substring(i, i + 1).equals("1")) {
                isCounted = true;
                maxCount = tmpCount > maxCount ? tmpCount : maxCount;
                tmpCount = 0;
            } else {
                isCounted = false;
            }
        }
        return maxCount;
    }
}
