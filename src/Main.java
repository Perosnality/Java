import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> skills=new ArrayList<String>();
        skills.add("Finisher");
        skills.add("Dribbler");
        skills.add("Poacher");
        skills.add("Headers");
        Player ronaldo = new Player("Christiano Ronaldo", 37, 182, 78, "Striker", skills, 320000);
        ronaldo.display();
        skills.clear();
        skills.add("Finisher");
        skills.add("Dribbler");
        skills.add("Playmaker");
        Player messi = new Player("Lionel Messi", 34, 172, 55, "Forward", skills, 500000);
        messi.display();
       


        
    }
    
}
