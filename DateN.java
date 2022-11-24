import java.util.Scanner;
public class DateN {
  private static final String bin = null;

  public static void main(String[] args) {

  int[][] set1 = {
    {1, 3, 5, 7},
    {9, 11, 13, 15},
    {17, 19, 21, 23},
    {25, 27, 29, 31}, 
  };

int[][] set2 = {
    {2, 3, 6, 7},
    {10, 11, 14, 15},
    {18, 19, 22, 23},
    {26, 27, 30, 31}, 
  };

int[][] set3 = {
    {4, 5, 6, 7},
    {12, 13, 14, 15}, 
    {20, 21, 22, 23}, 
    {28, 29, 30, 31},
  };

int[][] set4 = {
    {8, 9, 10, 11},
    {12, 13, 14, 15}, 
    {24, 25, 26, 27},
    {28, 29, 30, 31}, 
  };

int[][] set5 = {
    {16, 17, 18, 19},
    {20, 21, 22, 23}, 
    {24, 25, 26, 27},
    {28, 29, 30, 31}, 
  };
  
for (int setn = 0; setn<6; setn++)
{
  for(int i = 0; i<5; i++)
  {
    for(int j = 0; j<5; j++)
    {
      switch (setn)
      {
        case 0:
        System.out.println(set1);
        break;
        case 1:
        System.out.println(set2);
        break;
        case 2:
        System.out.println(set3);
        break;
        case 3:
        System.out.println(set4);
        break;
        case 4:
        System.out.println(set5);
        break;
      }
    }
  }
  Scanner Clavier = new Scanner(System.in);
  
  do
  {
    System.out.println("Votre jour de naissance est dans la set: " + (setn+1)+"?");
    String bin = Clavier.nextLine();
  }while ((bin != ("0") & ("1"))=true);
  bin = bin.concat(bin);
}
  int decimal = Integer.parseInt(bin,2); 
  System.out.println("Votre jour de naissance est: " + decimal);
}
}

