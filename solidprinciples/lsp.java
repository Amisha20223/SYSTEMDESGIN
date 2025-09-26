public class vehicle {
    public Integer getnumberofwheels(){
        return 2;
    }
    public Boolean haswheels(){
        return true;
    }
}
// ye bhi child class hai vehicle ka 
public class MotarGadi extends vehicle{
    public Boolean hashorn(){
        return false;
    }

}
//child of vehicle isme overide hua kyuki same function call kia
public class Car extends vehicle{
    @override
    public Integer getnumberofwheels(){
        return 4;
    }
}
public class Bicycle extends vehicle{
    @override
    public Integer hasengine(){
        return null;
    }
}
//client code c
public class Main{
    public static void main(String args[]){
        List<vehicle> vclist = new ArrayList<>();
        vclist.add(new MotarGadi());
        vclist.add(new Car());
       vclist.add(new Bicycle()); //null pointer exeption when parent class me function na ho to 
        for(vehicle vehicle : vclist){
            System.out.println(vehicle.haswheels().toString());
        }
    }
}
// true 
// true clinte code will brack 
// problem will occur kyuki one child is downsizing code break ho rha agar null daal dia 
// vechile ke pass engine hai aur bicyle ke ne reduce krti capabilty uski to null pointer expetion agya jiske vajah se error hai




//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++==
//SOLUTION
// put generic methods in parent class