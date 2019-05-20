import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	//	String seat = "";
	//	int near = 0;
	    while(T>0) {
	        int near;
	        int sno;
	        String seat;
	        near=sc.nextInt();
	        int num=near/6;
	        if(near % 6 != 0){
	            num++;
	        }
	        if(num % 2 == 1){
	            int temp = 6 *(num + 1);
	            //int temp=12;
	            sno = temp - ((near-1) % 6);
	        }
	        else{
	            int temp = 6 * num;
                sno=6*(num-2)+1+temp-near;
	        }
	        if(sno %6 ==0 || sno % 6 == 1) seat="WS";
	        else if(sno % 6 == 2 || sno % 6 == 5) seat="MS";
	        else seat="AS";
	        System.out.println(sno + " " + seat);
	        T--;
	    }	
		/*while(T-->0) {
			int seatNo = sc.nextInt();
			int remainder = seatNo % 12;
			switch (remainder) {
				case 0:
						seat="WS";
						near=seatNo-11;
						break;
				case 1: 
						seat="WS"; 
						near=seatNo+11; 
						break;
				case 2: 
						seat="MS"; 
						near=seatNo+9; 
						break;
				case 3: 
						seat="AS"; 
						near=seatNo+7; 
						break;
				case 4: 
						seat="AS"; 
						near=seatNo+5; 
						break;
				case 5: 
						seat="MS"; 
						near=seatNo+3; 
						break;
				case 6: 
						seat="WS";
						near=seatNo+1; 
						break;
				case 7: 
						seat="WS"; 
						near=seatNo-1; 
						break;
				case 8: 
						seat="MS"; 
						near=seatNo-3; 
						break;
				case 9: 
						seat="AS"; 
						near=seatNo-5; 
						break;
				case 10: 
						seat="AS"; 
						near=seatNo-7; 
						break;
				case 11:
						seat="MS"; 
						near=seatNo-9; 
						break;
				}
			System.out.println(near + " " + seat);
			}*/
	sc.close();

    }
}

