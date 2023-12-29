// Write a java program to find sum of first n natural number which are odd only.

public class  NaturalNumber{

    public int findNaturalNumber(int n){
        int sum = 0;
        for(int i=1;i<n;i+=2){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args){
        NaturalNumber q = new NaturalNumber();
        System.out.println("Sum: "+q.findNaturalNumber(10));
    }
}