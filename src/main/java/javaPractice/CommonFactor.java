package javaPractice;

 public class CommonFactor { 

       int small_number;

       int big_number;
    

       int x, y;

       int reminder = 1;

       int reminder1, reminder2, reminder3, reminder4;

      

       public void common_fact(int a, int b) {

              small_number = a;

              big_number = b;

             

              x= big_number;

              y=small_number;

              int reminder =1;
              int reminder2 = 0;

              while (reminder != 0) {

                     reminder1 = x%y;

                     reminder = reminder1;
                     if (reminder !=0) {
                    	 reminder2 = reminder;
                     }
                     System.out.println("Reminder1 :" + reminder1);

                     x=small_number;

                     y=reminder1;
                     
                                 
                    
              }
              System.out.println("HCF is: " + reminder2); 
              
              
              

         }

 

       public static void main(String[] args) {

              CommonFactor cmn = new CommonFactor();

              cmn.common_fact(348, 456);

            }

 

}
