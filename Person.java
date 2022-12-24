package person;
import java.util.Scanner;
public class Person {
static String wabi="jimma";
void display(){
  System.out.println("WELCOME TO JIMMA");         
  }   
// two Dimensional array
    public static void main(String[] args) {
     Scanner scan =new Scanner(System.in);       
   boolean check1=wabi.startsWith("j");
   System.out.println(check1);
      boolean check2=wabi.equals("JIMMA"); 
      System.out.println(check2);
       boolean check3=wabi.equalsIgnoreCase("JIMMA");
       System.out.println(check3);
        boolean check4=wabi.endsWith("a");
    System.out.println(check4);
      String check5=wabi.toUpperCase();
      System.out.println(check5);
      int check6=wabi.compareTo("JIMMA");  
      int check7=wabi.compareToIgnoreCase("JIMMA");
      System.out.println(wabi.length());
      System.out.println(check6);
   System.out.println(check7);
   // two dimensional array
   int [][]a=new int[3][3];
  System.out.println("enter 9 elements of 1st array");
   for(int i=0;i<a.length;i++)
     for(int j=0;j<a[i].length;j++)
   a[i][j]=scan.nextInt();
     // ouput of the 1st array
   System.out.println("FIRST ARRAY IS");
     for(int i=0;i<a.length;i++){
     for(int j=0;j<a[i].length;j++){
         //out put of the 1st array 
      System.out.print(a[i][j]+"   ");    
     } 
     System.out.println();   
 }
   int [][]b=new int[3][3];
  System.out.println("enter 9 elements of 2nd array");
   for(int i=0;i<b.length;i++)
     for(int j=0;j<b[i].length;j++)
   b[i][j]=scan.nextInt();
    System.out.println("SECOND  ARRAY IS");
     for(int i=0;i<b.length;i++){
     for(int j=0;j<b[i].length;j++){
       //out put of 2nd array   
      System.out.print(b[i][j]+"   ");    
     } 
     System.out.println();   
 }
    
     int[][] sum=new int[3][3];// only array of the same size can be added
     for(int i=0;i<b.length;i++)
     for(int j=0;j<b[i].length;j++)
  sum[i][j]=a[i][j]+b[i][j]; 
     System.out.println("the sum of two array is");
     //sum of two array
      for(int i=0;i<b.length;i++){
     for(int j=0;j<b[i].length;j++){
     System.out.print(sum[i][j]+"   ");
     }
     System.out.println();   
    }
   // multiplication of matrix     
int[][]mul=new int [3][3];
for(int i=0;i<b.length;i++)
     for(int j=0;j<b[i].length;j++)
         mul[i][j]=0;
  for(int i=0;i<b.length;i++){
     for(int j=0;j<b[i].length;j++){
         for(int k=0;k<3;k++){
    mul[i][j]=mul[i][j]+a[i][k]*b[k][j]; 
         }
  
         }
  }
  System.out.println("multiplication of array");
      for(int i=0;i<b.length;i++){
     for(int j=0;j<b[i].length;j++){
     System.out.print(mul[i][j]+"   ");  
     }
  System.out.println();
    }
      // maximum elemnts of matrix 1
      
       int max=a[0][0]; 
   for(int i=0;i<a.length;i++){
    for(int j=0;j<a[i].length;j++){
   if(a[i][j]>=max){
   max=a[i][j];    
       
   }     
    }
    
    } 
   System.out.println("THE MAXIMUM NUMBER FROM ELEMENTS OF ARRAY IS:"+max);
   // minimum elements of matrix 1
   
       int min=a[0][0]; 
   for(int i=0;i<a.length;i++){
    for(int j=0;j<a[i].length;j++){
   if(a[i][j]<=min){
   min=a[i][j];    
       
   }     
    }
    
    } 
   System.out.println("THE MINIMUM NUMBER FROM ELEMENTS OF ARRAY IS:"+min);
   
 // transpose of 2nd matrix      
    for(int i=0;i<b[i].length;i++){
     for(int j=0;j<b.length;j++){
    System.out.println(b[j][i]+"  ");
     }
   System.out.println(" ");
    }
   
  
       
   } 
    
    
    
    
    
    }
    
    
    


