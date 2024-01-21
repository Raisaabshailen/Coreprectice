public class Armstong {

    public static void main(String[] args) {
        int a=153;
        System.out.println("ram");
        int s=0;
        int r;
        int c=a;

        while(c!=0){
            r=c%10;

            c=c/10;
            s=s+(r*r*r);
        }

        if(s==a){
            System.out.println("armstrong");
        }else{
            System.out.println("nhi he");
        }
    }
}
