import java.util.*;

class prime{

public static void main(String[]args){

    int flag=0;

    System.out.println("Enter any number: ");	
	Scanner sc=new Scanner(System.in);

    int n = sc.nextInt();
    
    for(int i=2;i<=n/2;i++){

        if(n%i==0)
        {
            flag=1;
            break;
        }
    }

    if(flag==1)
	System.out.println("The number is not prime.");
    
    else if(flag==0)
	System.out.println("The number is prime.");
}
}
