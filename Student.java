public class Student {
        
			String name;
			int age;
		
        public void display() {
        	System.out.println("NAME"+name+"AGE"+age);
			
		}
  
        public static void main(String[] args) {
			Student s=new Student();
			s.name="javid";
			s.age=22;
			s.display();
		}
}

