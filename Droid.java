public class Droid {
    int batterylevel;
String name;

public Droid(String droidName){
  batterylevel = 100;
  name = droidName;
}

public String toString(){
  return "Hello, i am the droid "+ name;
}

public void performTask(String task){
  batterylevel -= 10;
System.out.println(name + " is performing task: " + task);

}

public void energyreport(){
  System.out.println("Energy left: " + batterylevel+ "%");
}

public void reservedenergy(){
  int power = 40;
   batterylevel += power;
   System.out.println();
   System.out.println(" battery after charge: " + batterylevel + "%");
}



  public static void main(String[]args){
Droid codey = new Droid("Codey");
System.out.println(codey);
codey.performTask("dancing");
codey.performTask("singing");
codey.performTask("rocking");
codey.performTask("flying");
codey.energyreport();
codey.reservedenergy();



  }
}
