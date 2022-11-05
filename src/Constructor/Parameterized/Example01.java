package Constructor.Parameterized;

public class Example01 {

        int empId;
        String empName;

        //parameterized constructor with two parameters
        Example01(int id, String name){
            this.empId = id;
            this.empName = name;
        }
        void info(){
            System.out.println("Id: "+empId+" Name: "+empName);
        }

        public static void main(String args[]){
            Example01 obj1 = new Example01(2000,"Abhiram");
            Example01 obj2 = new Example01(2004,"Amit");
            obj1.info();
            obj2.info();
        }
    }

