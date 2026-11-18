import java.util.Scanner;
class hello{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Give Input: ");
        String num = input.nextLine(); 
        System.out.print("Hello Saran Morning "+ num + " ");
        System.out.print("Give Age: ");
        int age = input.nextInt(); 
        System.out.print("Age is "+ age);
    }
}