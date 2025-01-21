class SumCountUntilBecomesOneDigit{

    static int digitSum(int n){
        if(n == 0)
            return 0;
        return (n % 9 == 0) ? 9 : (n % 9);
    }
    public static void main(String...args){
        int n = 6879554;
       System.out.println(digitSum(n));
    }
}