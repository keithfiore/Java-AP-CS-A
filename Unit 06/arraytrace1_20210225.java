public class Test1
{
   public static void main(String[] args)
   {
     String[ ] names = {"Jenny", "Emily", "Destiny", "Mateo", "Sofia"};

     int index = 1;
     System.out.println(names[index - 1]);
     index++;
     System.out.println(names[index]);
     System.out.println(names[index/2]);
     names[index] = "Rafi";
     index--;
     System.out.println(names[index+1]);
   }
}
