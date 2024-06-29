public class MyInfo {
    
        private String name = "Zake";
        private String address = "Kathmandu";
        private String phone = "123456789";
        
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
            MyInfo info = new MyInfo();
            System.out.println(info.getName());
            System.out.println(info.getAddress());
            System.out.println(info.getPhone());
    
            info.setName("Jolie");
            info.setAddress("Lalitpur");
            info.setPhone("987654321");
    
            System.out.println(info.getName());
            System.out.println(info.getAddress());
            System.out.println(info.getPhone());
    
        }
    
}
    

