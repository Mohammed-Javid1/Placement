class Animal
{
    public void makeSound()
    {
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("Dog Bark");
    }
}
public class OverRide{
public static void main(String args[])
{
    Dog D = new Dog(); 
    D.makeSound();
}
}