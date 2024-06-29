public class TestStatic {
    
        public static void myStaticMethod() {
            System.out.println("I am static method");
        }
        public void allFreeMethod() {
            System.out.println("I am non-static method");
        }
        public static void main(String[] args) {
            TestStatic.myStaticMethod();
            TestStatic teststaticobj = new TestStatic();
            teststaticobj.allFreeMethod();
            
        }
        
    }

