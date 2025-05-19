public class sumOfNum {
    public static int seriesSum(int n) {
        int sum=0;
        for(int i=0;i<=n;i++){
            sum += i;
    }
     System.out.print(sum); 
     return 0;
}
    public static void main(String[] args){
        seriesSum(5);
    }
}
