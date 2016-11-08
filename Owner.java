public class Owner
{
   // Attributes
   
   private String name;
   private Dog dog;
   
   // Methods
   
   public Owner(String name)
   {
      this.name = name;
   }
   
   
   public void addDog(String name, String sex, String race, int age)
   {
      dog = new Dog(name, sex, race, age);
   }

   public String getName()
   {
      return name;
   }
   
   public Dog getDog()
   {
      return dog;
   }

   
}