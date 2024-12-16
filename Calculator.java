public class Calculator{
   public static class number{
    int num1;
    int num2;



    public int addition(int i,int j){
        num1 = i;
        num2 = j;
        return i + j;
       }

       public int subtraction(int i,int j){
        num1 = i;
        num2 = j;
        return i - j;
       }


       public int mul(int i,int j){
        num1 = i;
        num2 = j;
        return i * j;
       }




       public int div(int i,int j){
        num1 = i;
        num2 = j;
        return i / j;
       }
   }

   public static void main(String[] args) {
    number num = new number();
    
    
    num.mul(1, 2);
    num.div(1, 2);

    System.out.println(num.addition(1, 2));
    System.out.println(num.subtraction(1, 2));
    System.out.println(num.mul(1, 2));
    System.out.println(num.div(1, 2));
   }
}