package Day1_2;

public class Main {
    public static void main(String[] args) {
//       Scanner console = new Scanner(System.in);
//
//        System.out.println("Enter your name >>> ");
//        String name = console.nextLine();
//        System.out.println("Hello " + name + " !");

        helloName("fevzi");

        int area=findTheAreaOfTheRectangle(3,4);//

        System.out.println(area);
    }



    public static int findTheAreaOfTheRectangle(int length, int width) {

        return length * width;
    }


    public static void helloName(String name){
        // gashahahah
        System.out.println("Hello " + name + " !");
    }

    public static String  helloName2(String name){
       return "3";
    }

    public static double helloName3(int number){
        return number*5;
    }
    
}