package chapter6;public class HomeAreaCalculator {
    public static void main(String[] args) {

        /*******************
         * RECTANGLE 1
         ********************/
        // using default constructor
        Rectangle room1 = new Rectangle();
        //use setter method
        room1.setWidth(25);
        room1.setLength(50);
        double perimeterOfRoom1 = room1.calculatePerimeter();
        double areaOfRoom1  = room1.calculateArea();
        /*******************
         * RECTANGLE 2
         ********************/
        // using constructor with parameter
        Rectangle room2 = new Rectangle(40,50);
        double perimeterOfRoom2 = room2.calculatePerimeter();
        double areaOfRoom2 = room2.calculateArea();

        System.out.println("Room 1 length : "+room1.getLength());
        System.out.println("Room 1 width : "+room1.getWidth());
        System.out.println("Area of room 1 : "+areaOfRoom1);
        System.out.println("Perimeter of room 1 : "+perimeterOfRoom1);
        System.out.println("-------------------------------------------");
        System.out.println("Room 2 length : "+room2.getLength());
        System.out.println("Room 2 width : "+room2.getWidth());
        System.out.println("Area of room 2 : "+areaOfRoom2);
        System.out.println("Perimeter of room 2 : "+perimeterOfRoom2);
        System.out.println("-------------------------------------------");
        System.out.println("Total area of rooms : "+(areaOfRoom1+areaOfRoom2));
        System.out.println("Total perimeter of rooms : "+(perimeterOfRoom1+perimeterOfRoom2));

    }
}
