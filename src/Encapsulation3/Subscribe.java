package Encapsulation3;

public class Subscribe {
    private String name ,whichTypeOfMember;
     private int memberCount , price;

    public void setName(String name) {
        this.name = name;
    }

    public void setWhichTypeOfMember(String whichTypeOfMember) {
        this.whichTypeOfMember = whichTypeOfMember;
    }

    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }

    public void getPrice() {
        int a=0;
        if(whichTypeOfMember.equals("Gold")){
            a= 50*memberCount;
            System.out.println("Welcome to membership "+name+". Your membership is "+a+" dollar for month you can enjoy the videos , all homework and see you soon.");
        }else if (whichTypeOfMember.equals("Silver")){
            a=40*memberCount;
            System.out.println("Welcome to membership "+name+". Your membership is "+a+ " dollar for month you can enjoy the videos");
        }else  if (whichTypeOfMember.equals("Bronze")){
            a=30*memberCount;
            System.out.println("Welcome to membership "+name+". Your membership is "+a+" dollar for month you can enjoy and all homework.");

        }
    }
    public String toString() {
        return "Subscribe{" +
                "name='" + name + '\'' +
                ", whichTypeOfMember='" + whichTypeOfMember + '\'' +
                ", memberCount=" + memberCount +
                ", price=" + price +
                '}';
    }
}
