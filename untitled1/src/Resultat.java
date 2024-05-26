public class Resultat {
    static void print(String result){
        System.out.print("\"" + result + "\"");
        if (result.length()>40)
            System.out.println(result.substring(0 , 40 ) + "...");}
}

