public class VariableParameter {
    public static void main(String[] args) {

        College obj1=new Pailan();
        College obj2=new TechnoIndia();
        College obj3=new GuruNanak();
        obj1.department("ECE", "ME", "CIVIL","CSE","IT");
        obj2.department("IT", "CSE", "ECE");
        obj3.department("EEE", "ECE", "Instrumentation","BCA","MCA","Computer SC. Hons");
        
    }
    
}

class Pailan implements College{

    @Override
    public void department(String... dept) {
        System.out.println("\n The departments at college Pailan are as follows ::");
       for(String str:dept)
        {
         System.out.print(str+"   ,   ");   
        }
        System.out.println();
    }
    
}


class TechnoIndia implements College{

    @Override
    public void department(String... dept) {
        System.out.println("\n The departments at college TechnoIndia are as follows ::");
       for(String str:dept)
        {
         System.out.print(str+"   ,   ");   
        }
        System.out.println();
    }
    
}


class GuruNanak implements College{

    @Override
    public void department(String... dept) {
        System.out.println("\n The departments at college GuruNanak are as follows ::");
        for(String str:dept)
        {
         System.out.print(str+"   ,   ");   
        }
        System.out.println();
    }
    
}

interface College {
    void department(String... dept);

    
}