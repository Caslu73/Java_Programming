package day07_ifStatements;

public class MultiBranchIf {

    public static void main(String[] args) {
        int num = 100;

        String result = "";

        if (num > 0) { // True
            result = "Positive";
        }
        if (num < 0) {
            result = "Negative";
        }
        if (num == 0) {
            result = "Zero";
        }
        System.out.println(result);

        System.out.println("----------------------------------");
        // MULTI BRANCH STATEMENT

        String result2 = "";

        if (num > 0) {
            result2 = "Positive";

        } else if (num < 0) {
            result2 = "Negative";

        }else{
            result2 = "Zero";  // else block only in the very end
        }

        System.out.println(result2);

        }


    }
