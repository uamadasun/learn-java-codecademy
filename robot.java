public class Droid{
  int batteryLevel;
  String name;

  public Droid(String droidName){
    batteryLevel = 100;
    name = droidName;
  }

  public void performTask(String task) {
    System.out.println(name + " is performing task: " + task);
    batteryLevel -= 10;
  }

  public int energyReport() {
    return batteryLevel;
  }

  public String toString() {
    return "Hello, I'm the droid: " + name;
  }


  public static void main(String[] args) {
    Droid codey = new Droid("Codey");
    System.out.println(codey);
    codey.performTask("dancing");
    codey.performTask("cleaning");
    System.out.println(codey.energyReport());
    

  

  }
}
