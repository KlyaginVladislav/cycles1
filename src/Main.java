public class Main {

    public static void main(String[] args) {

        int currentNum = 0;
        while (currentNum < 10){
            System.out.println(  ++ currentNum + "цифра");
        }
        System.out.println();

        for (;currentNum > 0; currentNum--){
            System.out.println(currentNum + "цифра");
        }
    }
}