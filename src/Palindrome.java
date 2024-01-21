public class Palindrome {


    public static void main(String[] args) {
        int no=151;
        int reminder;
        int reversenum=0;
        int c=no;
       // System.out.println(151%10);
        while(c!=0){
            reminder=c%10;

            reversenum= reversenum*10+reminder;

            c=c/10;



        }

        if(no==reversenum){
            System.out.println("he");
        }else{
            System.out.println("nhi he");
        }
    }

}
