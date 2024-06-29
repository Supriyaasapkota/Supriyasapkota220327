public class MyStudent {
    
        private String name;
        private String address;
        private String phone;
        public MyStudent(String name, String address, String phone) {
            this.name = name;
            this.address = address;
            this.phone = phone;
    
        }
         public String getName() {
            return name;
         }
         public String getAddress() {
            return address;
         }
         public String getPhone() {
            return phone;
         }
         public void setName(String name) {
            this.name = name;
         }
         public void setAddress(String address) {
            this.address = address;
         }
         public void setPhone(String phone) {
            this.phone = phone;
         }
        public static void main(String[] args) {
            MyStudent studentObject = new MyStudent("Zake", "Kathmaandu", "123456789");
    
            System.out.println(studentObject.getName());
            System.out.println(studentObject.getAddress());
            System.out.println(studentObject.getPhone());
    
            studentObject.setName("Alex");
            studentObject.setAddress("New york");
            studentObject.setPhone("555-5678");
    
            System.out.println(studentObject.getName());
            System.out.println(studentObject.getAddress());
            System.out.println(studentObject.getPhone());
    
            
        }
    
    
    
        
    }
    

