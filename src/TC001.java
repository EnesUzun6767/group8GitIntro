public class TC001 {
    public static void main(String[] args) {
       int num1=43;
       String result=oddEven(num1);
        System.out.println("result = " + result);

    }
    public static String oddEven(int num){
        String result="";
        if(num%2==0){
           result="even";
        }else{
            result="odd";
        }
        return result;
    }
}
