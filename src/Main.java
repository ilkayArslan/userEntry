import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String username,password;

        Scanner input = new Scanner(System.in);

        System.out.print("Username : ");
        username = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();
        if(username.equals("ilkay")&&password.equals("arslan")){
            System.out.println("Hoşgeldin İlkay");
        }else {
            System.out.println("Kimsin sen");
        }


    }
}