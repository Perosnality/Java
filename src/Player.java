import java.util.ArrayList;
//class
public class Player{
    public String name;
    public int age;
    public double height;
    public double weight;
    public String position;
    public ArrayList<String> skills;
    public double wages;
    
//constructor
public Player(String name,int age,double height,double weight,String position,ArrayList<String> skills,double wages)
{
    this.name=name;
    this.age=age;
    this.height=height;
    this.weight=weight;
    this.position=position;
    this.skills=skills;
    this.wages=wages;
}
public void display()
{
    System.out.println("The name of the player is " + name);
    System.out.println("The age of the player is " + age);
    System.out.println("The height of the player is " + height);
    System.out.println("The weight of the player is " + weight);
    System.out.println("The position of the player is " + position);
    for(String skill:skills)
    {
        System.out.println("The skill of the player is " + skills);
    }
        System.out.println("The wages of the player is " + wages);

    
}

    
}
