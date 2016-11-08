public class MemberList
{
   // Attributes
   
   private static final int MAX_NO_OF_MEMBERS = 10;
   private Owner[] memberList = new Owner[MAX_NO_OF_MEMBERS];
   private int memberCount = 0;
   
   // Methods
   
   public void addOwner(String name, String dogName, String dogSex, String dogRace, int dogAge)
   {
      memberList[memberCount] = new Owner(name);
      memberList[memberCount].addDog(dogName, dogSex, dogRace,dogAge);
      memberCount++;
   }
   
   public void showMemberList(String listVersion)
   {
      Owner member;
      Dog membersDog;
 
      for (int i = 0; i < memberCount; i++)
      {
         member = memberList[i];
         membersDog = member.getDog();
         
         System.out.print(i + ") " + member.getName()); 
         System.out.print(" owns the dog ");
         System.out.print(membersDog.getName());

         
         if (listVersion == "race")
         {
            System.out.print(", " + membersDog.getRace());          
         }
         if (listVersion == "sexage")
         {
            System.out.print(", " + membersDog.getSex());
            System.out.print(", " + membersDog.getAge() + " months");                    
         }
         if (listVersion == "age")
         {
            System.out.print(", " + membersDog.getAge() + " months");          
         }
  
         System.out.println();
      }
   }

   public void showOwnerWithOldestDog()
   {
      int oldest = 0;
      Owner hasOldestDog = null;
      Owner member;
      Dog membersDog;

   
      for (int i = 0; i < memberCount; i++)
      {
         member = memberList[i];
         membersDog = member.getDog();
         
         if (membersDog.getAge() > oldest)
         {
            hasOldestDog = member;
            oldest = membersDog.getAge();
         }
      }
      
      System.out.println("Oldest dog is owned by " + hasOldestDog.getName());
      System.out.println("The dog is called " + hasOldestDog.getDog().getName());
   
   }

   public void showOwnerWithYoungestDog()
   {
      int youngest = 1000;
      Owner hasYoungestDog = null;
      Owner member;
      Dog membersDog;

   
      for (int i = 0; i < memberCount; i++)
      {
         member = memberList[i];
         membersDog = member.getDog();
         
         if (membersDog.getAge() < youngest)
         {
            hasYoungestDog = member;
            youngest = membersDog.getAge();
         }
      }
      
      System.out.println("Oldest youngest dog is owned by " + hasYoungestDog.getName());
      System.out.println("The dog is called " + hasYoungestDog.getDog().getName());

   }
   
   public void sortMemberlistAscending()
   {
      Owner firstMember;
      Dog firstMembersDog;
      
      Owner secondMember;
      Dog secondMembersDog;
  
      for (int i = 0; i < memberCount - 1; i++)
      {
         for (int j = 0; j < memberCount - 1; j++)
         {
            firstMember = memberList[j];
            firstMembersDog = firstMember.getDog();
            
            secondMember = memberList[j + 1];
            secondMembersDog = secondMember.getDog();
                     
            if (firstMembersDog.getAge() > secondMembersDog.getAge())
            {
               // Swap
               memberList[j] = secondMember;
               memberList[j + 1] = firstMember;
            }
         }
      }
   }
   
   public void sortMemberlistDescending()
   {
      Owner firstMember;
      Dog firstMembersDog;
      
      Owner secondMember;
      Dog secondMembersDog;
  
      for (int i = 0; i < memberCount - 1; i++)
      {
         for (int j = 0; j < memberCount - 1; j++)
         {
            firstMember = memberList[j];
            firstMembersDog = firstMember.getDog();
            
            secondMember = memberList[j + 1];
            secondMembersDog = secondMember.getDog();
                     
            if (firstMembersDog.getAge() < secondMembersDog.getAge())
            {
               // Swap
               memberList[j] = secondMember;
               memberList[j + 1] = firstMember;
            }
         }
      }
   }

}