import java.util.List;
import java.util.ArrayList;

public class Service {
    private  List<Shirt> shirts=new ArrayList<>();
    private Scanner sc=new Scanner(System.in);

    public void start(){
       do{
        options();
        System.out.println("Press YES To Continue....");
        choice=sc.nextline();
       } while(choice.equalsIgnoreCase   )
    }
   

public void addShirt(Shirt s){
    shirts.add(s);
   }



}