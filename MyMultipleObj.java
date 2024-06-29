public class MyMultipleObj {
    
        private int x = 100;
        public int getX() {
            return x;
    
        }
        public void setX(int x) {
            this.x = x;
        }
        public static void main(String[] args) {
            MyMultipleObj myObjectOne = new MyMultipleObj();
            MyMultipleObj myObjectTwo = new MyMultipleObj();
    
            myObjectTwo.setX(111);
            System.out.println("Value of x in myObjectOne: " + myObjectOne.getX());
            System.out.println("Value of x in myObjectTwo: " + myObjectTwo.getX());
        }
        
    }

