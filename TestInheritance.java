// a)
interface Pet{
    void beFriendly();
}

interface Playful{
    void play();
}

class Animal{
    void eat(){
         System.out.println("Animal is Eating");
    }
}

class Dog extends Animal implements Pet, Playful{
      public void beFriendly(){
             System.out.println("Dog is Friendly");
      }
      public void play(){
             System.out.println("Dog loves to Play");
      }
}

public class TestInheritance{
       public static void main(String[] args){

          System.out.println("Nidhi Sharma");
          System.out.println("24CSU140");  

          Dog d = new Dog();
          d.eat();
          d.beFriendly();
          d.play();
   }
}