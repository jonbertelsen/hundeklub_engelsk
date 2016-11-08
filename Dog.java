public class Dog
{
   // Attributes
   
   private String name;
   private String sex;
   private String race;
   private int age; // in months

   // Methods
   
   public Dog(String name, String sex, String race, int age)
   {
      this.name = name;
      this.sex = sex;
      this.race = race;
      this.age = age;
   }

   public String getName()
   {
      return name;
   }
   
   public String getRace()
   {
      return race;
   }
   
   public String getSex()
   {
      return sex;
   }
   
   public int getAge()
   {
      return age;
   }
   
}