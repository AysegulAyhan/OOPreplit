package Encapsulation3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String  whichMember = scan.nextLine();
        int memberCount = scan.nextInt();

        Subscribe subscribe=new Subscribe();
        subscribe.setName(name);
        subscribe.setWhichTypeOfMember(whichMember);
        subscribe.setMemberCount(memberCount);
        subscribe.getPrice();
        
    }
}
