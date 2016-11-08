import java.io.*;
import java.util.Scanner;

public class DogClubMain
{

   public static void main(String[] args)
   {
      int menuChoice = 0;
      Scanner console = new Scanner(System.in);
      MemberList members = new MemberList();
   
      members.addOwner("Bent", "Pelle", "Male", "Labrador", 36);
      members.addOwner("Ole", "Bella", "Female", "Golden Retriever", 15);
      members.addOwner("Kirsten","Marcel","Male","Fransk Buldog",5);
      members.addOwner("Dorthe","Topsy","Female","Kongepuddel",28);
               
      // Menu
   
      while (menuChoice != 7)
      {
      
         showMenu();
         menuChoice = console.nextInt();
         
         switch (menuChoice)
         {
            case 1: members.showMemberList("race"); break;
            case 2: members.showMemberList("sexage"); break;
            case 3: members.showOwnerWithYoungestDog(); break;
            case 4: members.showOwnerWithOldestDog(); break;
            case 5: members.sortMemberlistAscending(); members.showMemberList("sexage");break;
            case 6: members.sortMemberlistDescending(); members.showMemberList("sexage");break;
            case 7: break;     
         }   
      }
   
   }
   
   public static void showMenu()
   {
      System.out.println();
      System.out.println("************* Menu *****************");
      System.out.println("[1] Vis medlemsliste og hunde - race");
      System.out.println("[2] Vis medlemsliste og hunde - køn ");
      System.out.println("[3] Vis ejer med yngste hund");
      System.out.println("[4] Vis ejer med ældste hund");
      System.out.println("[5] Sorter stigende");
      System.out.println("[6] Sorter faldende");

      System.out.println("[7] Afslut");
   }
   
}