import java.util.*;

class primebetween{

public static void main(String[]args){

    int flag=0;

    System.out.println("Enter any number two number: ");	
	Scanner sc=new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println();

    if(a<2)
    {
        System.out.println("2,");
    }

    if((a+1)%2!=0)
{ 
    
    for(int i=a+1;i<b;i=i+2){

        flag=0;


        int root=(int)Math.sqrt(i);

        for(int j=2;j<=root;j++){
            if(i%j==0)
            flag=1;
            
        }

        if(flag==0)
        System.out.println(i+", ");

    }
}

    else{

        for(int i=a+2;i<b;i=i+2){

            flag=0;

            int root=(int)Math.sqrt(i);

            for(int j=2;j<=root;j++){
                if(i%j==0)
                flag=1;            
            }

            if(flag==0)
	System.out.println(i+", ");

        }
    
    }
}
}
