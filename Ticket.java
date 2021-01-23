import java.util.Scanner;
public class Ticket{
    public static void main(String[]args){
        System.out.println("Choose language");
        int language;
        String input;
        int dayTicket = 10;
        int onewayTicket = 5;
        int buy;
        int buy1;
        Scanner scanner = new Scanner(System.in);
        language = scanner.nextInt();
        switch(language){
            case 1:
                System.out.println("English");
                break;
            case 2:
                System.out.println("German");
                break;
            case 3:
                System.out.println("Chinese");
                break;
            case 4:
                System.out.println("Japanese");
                break;
            default:
                System.out.println("Use default language!");
                break;
        }
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Choose ticket onewayTicket or dayTicket");
        input = scanner1.nextLine();
        if(input.equals("dayTicket")){
            System.out.println("DayTicket    : " + dayTicket    + " Euro.");
            System.out.println("To buy dayTicket press 1 or 2 for exist");
            Scanner scanner2 = new Scanner(System.in);
            buy = scanner2.nextInt();
            switch(buy){
                case 1:
                    System.out.println("Put money between 10 to 20");
                    int money = scanner2.nextInt();
                    if(money >10 && money <= 20){
                           int change = money - dayTicket;
                           System.out.println("Change money : " + change);
                           System.out.println("Here is your dayTicket");
                    }else if(money == 10){
                        System.out.println("No change and here is your dayTicket");
                    }else{
                        System.out.println("Money is less than 10 or bigger than 20!");
                    }
                    break;
                case 2:
                    System.out.println("Exit");
                    System.out.println("Thank you for using our service");
                    break;
                default:
                    System.out.println("Just choose to buy or exist");
                    break;
            }
        }else if(input.equals("onewayTicket")){
            System.out.println("OnewayTicket : " + onewayTicket + " Euro.");
            System.out.println("To buy onewayTicket press 1 or 2 for exit");
            Scanner scanner3 = new Scanner(System.in);
            buy1 = scanner3.nextInt();
            switch(buy1){
                case 1:
                    System.out.println("Put money between 5 to 10");
                    int money1 = scanner3.nextInt();
                    if(money1 > 5 && money1 <= 10){
                        int change1 = money1 - onewayTicket;
                        System.out.println("Change money : " + change1);
                        System.out.println("Here is your onewayTicket");
                    }else if(money1 == 5){
                        System.out.println("No change and here is your onewayTicket");
                    }else{
                        System.out.println("Money is less than 5 or greater than 10!");
                    }
                    break;
                case 2:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Just choose to buy or exist!");
                    break;
            }
        }else{
            System.out.println("Choose the ticket again!");
        }
    }
}