package Lab17;
public class MoneyMain {
   
   static String[] dataSource =  {"B5","Q","B20","Q","P","D","N"};
   static Money[] wallet = new Money[dataSource.length];
   
   public static void main (String[] args) {
            
      for (int i=0;i<dataSource.length;i++){
         char dataItem = dataSource[i].charAt(0);
         if (dataItem == 'B') {
            int billValue= Integer.parseInt(dataSource[i].substring(1,dataSource[i].length()));
            wallet[i]= new Bill(billValue);
         }   
         else
            if (dataItem == 'Q')
               wallet[i]=new Quarter();
            if (dataItem == 'P')
               wallet[i] = new Penny();
            if (dataItem == 'D')
               wallet[i] = new Dime();
            if (dataItem == 'N')
               wallet[i] = new Nickel();
         }
      printWallet();
      System.out.println("The sum is $" + sumWallet(wallet));
   }
   public static void printWallet () {
        for (Money m: wallet)
            System.out.println(m);
      }
   public static double sumWallet(Money[] wallet){
      int sum = 0;
      for (Money m: wallet)
         if (m instanceof Bill)
            sum += ((Bill) m).getValue();
         else
            sum += ((Coin) m).getValue();
      return sum;

      
   }
   }
   

