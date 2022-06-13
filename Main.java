import java.util.*;
import java.io.*;

class Main {
  
  public static void main(String[] args) throws IOException {
    
    File fileQ = new File("Questions.txt");
    
    Scanner readQ = new Scanner(fileQ).useDelimiter("\n");
    String[] questions = new String[100];
    for(int i = 0; i < 100; i++)
    {
      questions[i] = readQ.next();
    }
    readQ.close();

    ArrayList<Integer> nums = new ArrayList<Integer>();
    for(int i = 1; i <= 10; i++)
    {
      int rand = (int) (Math.random() * 100);

      if(nums.contains(rand))
      {
        i--;
      }
      else
      {
        nums.add(rand);
        System.out.println("\n" + questions[rand]);
      }
    }
    
  }
  
}