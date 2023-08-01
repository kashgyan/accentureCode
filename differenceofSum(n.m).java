// //def differenceofSum(n.m)

// The function takes two integrals m and n as arguments.
//   You are required to obtain the total of all integers ranging between 1 to n (both inclusive) which are not divisible by m. 
//   You must also return the distinction between the sum of integers not divisible by m with the sum of integers divisible by m.
  






import java.util.*;
class main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt() ;
        int n = scn.nextInt() ;
        int countM =0;
        int countN =0;
        for(int i =0;i<=n;i++){
            if(i%m == 0){
                countM = countM+i;
            }else{
                countN = countN+i;
            }
        }
        int res = countN - countM;
        System.out.println("the desired result is "+ res);
        
    }
}
