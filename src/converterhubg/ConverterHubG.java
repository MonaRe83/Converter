package converterhubg;

import java.util.Scanner;

import javax.swing.JOptionPane;


    public class ConverterHubG {
    public static void main(String[] args) {
        
       int userSelection ;     // user enters input into value 1 
       double convertFrom; // user enters input into value 2
       double cmToinch= 0.393700787;
       double metreTofeet = 3.280839895;
       double celsiusTofahrenheit=33.8;
       double mileTokm =1.60935 ;
       double cmTofeet=0.032808399 ;
      Scanner sc = new Scanner (System.in);
     
       do{
           do {
               
           
             String []M={"1.Convert Cm to Inch","2.Convert Metres to Feet","3.Celsius to Fahrenheit","4.Cm to Feet","5.Miles to Kilometres","6.Exit"};
             for (int i =0 ;i<M.length;i++){
             System.out.println(M[i]);}    

             
             try{
              userSelection= Integer.parseInt(JOptionPane.showInputDialog("Enter your number from 1 to 6 from the menu displayed."));// enter number to show which unit to convert  
             
             
   }
             catch(Exception e){
          System.out.println("error");
          userSelection=7;
        
      } 
             } while (userSelection>6);
           
      

     
        switch (userSelection){
    case 1 :
        convertFrom=Double.parseDouble(JOptionPane.showInputDialog("Enter your Value to convert (cm->inch)"));//enter value to convert from cm to inch
        JOptionPane.showMessageDialog(null,"Your Value is " + ConvertToNew(convertFrom,cmToinch));
        break ;

    case 2 :
        convertFrom=Double.parseDouble(JOptionPane.showInputDialog("Enter your Value to convert (m->feet)"));//enter value to convert from m to feet
    JOptionPane.showMessageDialog(null,"Your value is "+ConvertToNew(convertFrom,metreTofeet));
        break ;

     case 3 :
        convertFrom=Double.parseDouble(JOptionPane.showInputDialog("Enter your Value to convert (cel->fah)"));//enter value to convert from cel to fah
    JOptionPane.showMessageDialog(null,"Your value is "+ConvertToNew(convertFrom,celsiusTofahrenheit));
        break ;
         
     case 4 :
        convertFrom=Double.parseDouble(JOptionPane.showInputDialog("Enter your Value to convert (cm->feet)"));//enter value to convert from cm to feet
    JOptionPane.showMessageDialog(null,"Your value is "+ConvertToNew(convertFrom,cmTofeet));
        break ; 
         
     case 5 :
        convertFrom=Double.parseDouble(JOptionPane.showInputDialog("Enter your Value to convert (miles->km)"));//enter value to convert from miles to km
   JOptionPane.showMessageDialog(null,"Your value is "+ConvertToNew(convertFrom,mileTokm));
        break ;
         
//default
   case 6 :
       JOptionPane.showMessageDialog(null,"Good Bye :)  MAY THE FORCE BE WITH YOU ");
          System.exit(0);
       break;
    // TODO code application logic here
}


      }
        
while (userSelection<7);//Any number less than 7 will loop
       // TODO code application logic here
 
      }
     // ConvertToNew method receives two parameters from the calling routing and then multiplies these number before returning the results back
    private static double ConvertToNew(double userInput, double convertTo) { //recieve parameters
        
       
        return userInput*convertTo; // returning results of the converttonew method
    }
}

    