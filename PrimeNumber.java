import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        int n;
        int i,j;
        String pn =" ";
      // int n=9;
       Scanner sc=new Scanner(System.in);
      // System.out.println("Enter Number :");
      n=sc.nextInt();
       //System.out.println(n);
       for(i=1;i<=n;++i){
           int flag =0;
           for(j=1;j<=i;++j){
               if(i % j == 0){
                   flag++;
                   //return;
               }
           }
            if(flag == 2){
                 System.out.print(i + " ");
               }
       }
    }
}
