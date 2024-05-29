public class Main {
    public static void main(String[] args) {
        System.out.println("Завдання 1");
        int n = 36;
        if (n<100 & n>50) {
            System.out.println("Число "+n+" належить проміжку (50;100)");
        }else{
            System.out.println("Число "+n+" не належить проміжку (50;100)");
        }
        System.out.println("Завдання 2");
        int m = 767;
        int a = m/100;
        int b = (m%100)/10;
        int c = (m%10);
        if (a>b & a>c){
            System.out.println(a);
        } else if (b>a & b>c){
            System.out.println(b);
        } else if (c>a & c>b){
            System.out.println(c);
        } else if (a==b & a>c){
            System.out.println(a);
        } else if (a==b & a<c) {
            System.out.println(c);
        } else if (a==c & a>b) {
            System.out.println(a);
        } else if (a==c & a<b) {
            System.out.println(b);
        } else if (b==c & a>b) {
            System.out.println(a);
        } else if (b==c & a<b) {
            System.out.println(b);
        } else{
            System.out.println(a);
        }

        System.out.println("Завдання 3");
        String direction = "До гори";
        int floor = 2;
        if (direction=="До низу" & floor==2){
            System.out.println("Ви спустились на 1 поверх");
        }else if ((direction=="До низу" & floor!=2)){
            System.out.println("Ви спустились на "+floor+" поверх");
        }else if (direction=="До гори" & floor==2){
            System.out.println("Ви піднялись на 3 поверх");
        }else{
            System.out.println("Ви піднялись на "+floor+" поверх");
        }
        System.out.println("Завдання 4");
        String yn = "-";
        switch (yn){
            case "Yes":
            case "Ok":
            case "Y":
                System.out.println("Я за!");
                break;
            case "+":
            case "Так":
            case "ОК":
                System.out.println("Я за!");
                break;
            case "Ні":
            case "NO":
            case "No":
                System.out.println("Я не хочу цього робити");
            case "N":
            case "-":
                System.out.println("Я не хочу цього робити");

        }
    }
}