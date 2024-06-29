public class MyClassOne {
    
        private String name;
        private String phone;
        private final String address = "Kathmandu";
    
        public MyClassOne() {
            this.name = "John";
            this.phone = "123";
        }
        public String getName() {
            return name;
        }
        public String getPhone() {
            return phone;
        }
        public String getAddress() {
            return address;
        }
          
        public static void main(String[] args) {
            MyClassOne myclassone = new MyClassOne();
    
            System.out.println("Name:" + myclassone.getName());
            System.out.println("Phone:" + myclassone.getPhone());
            System.out.println("Address:" + myclassone.getAddress());
        }
        
    }

