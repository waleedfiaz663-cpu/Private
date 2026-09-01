
public class Student {
    
    private String name;
    
    private int age;
    
    private int rollno;
    
 private void setdata(String n, int a,int r){
        
        name=n;
        age=a;
        rollno=r;
        
    }
    
 private void print(){
        
        System.out.println(name);
        
        System.out.println(age);
        
        System.out.println(rollno);
        
    }
    

public static void main(String[]args){
    
Student s1=new Student();
    
s1.setdata("waleed",22,135);
    
s1.print();
    
}
    
}
