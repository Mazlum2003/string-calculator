import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        char operation = 0;
        int number;
        String result = "";
        String[] arr;
        if (s1.contains(" + ")) {
            arr = s1.split(" \\+ ");
            operation = '+';
        } else if (s1.contains(" - ")) {
            arr = s1.split(" - ");
            operation = '-';
        } else if (s1.contains(" * ")) {
            arr = s1.split(" \\* ");
            operation = '*';
        } else if (s1.contains(" / ")) {
            arr = s1.split(" / ");
            operation = '/';
        } else {
            throw new Exception("Некорректный знак операции");
        }
        if (operation == '*' || operation == '/') {
            if (arr[1].contains("\""))
                throw new Exception("Строку можно делить или умножать только на число");
        }
        for (String s : arr) {
            if (operation == '+' || operation == '-') {
                if (arr[0].contains("\"") && arr[1].contains("\"")) {
                } else {
                    throw new Exception("Строки можно только выполнят  операций сложения и вычитания");
                }
            }
        }
        for (int a = 0; a < arr.length; a++) {
            arr[a] = arr[a].replace("\"", "");
        }
        Conditions r1 = new Conditions(arr, operation);
        Resultat p1 = new Resultat();

        Resultat.print(Conditions.m2(arr, operation));
    }


}

