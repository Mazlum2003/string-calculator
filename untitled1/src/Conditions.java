import java.util.Arrays;

public class Conditions {
   private String[] arr ;
   private char operation ;


    public Conditions(String[] arr, char operation) {
        this.arr = arr;
        this.operation = operation;
        Resultat resultat = new Resultat();

    }
    public static String m2 (String[] arr ,  char operation ) throws Exception {

        String resultat = "";
        int number = 0;
        if(arr[0].length() > 10 ){
            throw new Exception("Должно быть не большь 10 символов ");
        }else if (arr[1].length() > 10){
            throw new Exception("Должно быть не большь 10 символов ");
        }

        switch (operation) {
            case '+':
                    resultat = arr[0] + arr[1];
                break;
            case '*':
                number = Integer.parseInt(arr[1]);
                if (number > 10){
                    throw new Exception("Числа  должны быть от 1 до 10 ");
                }
                for (int i = 0; i < number; i++) {
                    resultat += arr[0];
                }
                break;
            case '-':
                int num1 = arr[0].indexOf(arr[1]);
                if (num1 == -1) {
                    resultat = arr[0];
                } else {
                    resultat = arr[0].substring(0, num1);
                    resultat += arr[0].substring(num1 + arr[1].length());
                }
                break;
            case '/':
                int num2 = arr[0].length() / Integer.parseInt(arr[1]);
                resultat = arr[0].substring(0, num2);
                break;

        }
        return resultat ;
    }

    @Override
    public String toString() {
        return
                 Arrays.toString(arr) +
                 operation ;
    }
}
