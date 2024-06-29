public class student {
    String name;
    String phone;
    String address;
     
    public student() {
        this.name = "Zake";
        this.phone = "123456789";
        this.address = "Kathmandu";

    }
    public static void main(String[] args) {
        student studentObject = new student();
        System.out.println(studentObject.name + "\n");
        System.out.println(studentObject.phone+ "\n");
        System.out.println(studentObject.address+ "\n");

        System.out.println(studentObject.name + studentObject.phone + studentObject.address + "\n");

        System.out.println(studentObject.name + "   " + studentObject.phone + "   "+ studentObject.address);
        // System.out.println(studentObject.phone);
        // System.out.println(studentObject.address);


}
}
