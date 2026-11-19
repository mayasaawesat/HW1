public class Assignment01Q03 {
    public static void main(String[] args) {
        int x =Integer.parseInt(args[0]); // TODO: Read the first string argument (replace this line)
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int numOdd = 0;
        int prevNum=0;
        int num=1;
        for (int i=0; i < x; i++){
            System.out.print(num);
            if (num%2==1){
                numOdd+=1;
            }
            int temp=num;
            num=num+prevNum;
            prevNum=temp;

            
            if (i < x - 1) 
                System.out.print(" ");


        }
        
        
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
