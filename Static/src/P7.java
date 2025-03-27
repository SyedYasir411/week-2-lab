class patient{
    static String hospital = "Ayush";
    String name;
    int age;
    String ailment;
    final int patientID;
    static int totalpatients;

    patient(String name,int age,String illness,int id){
        this.name = name;
        this.age=age;
        this.ailment=illness;
        this.patientID=id;
        totalpatients++;
    }

    static void getTotalPatients(){
        System.out.println("totalpatients : "+totalpatients);
    }

    void display(){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
        System.out.println("ailment : "+ailment);
        System.out.println("ID : "+patientID);
        System.out.println("hospital : "+hospital);
        System.out.println();
    }

}
public class P7 {
    public static void main(String[] args){
        patient n = new patient("ayu",26,"fever",645);
        n.display();
        patient.getTotalPatients();
    }
}
