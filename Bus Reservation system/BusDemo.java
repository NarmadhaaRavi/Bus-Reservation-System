package Bus Reservation system;

public class BusDemo {
    public static void main(String[] args) {
        ArrayList<Booking> bookings = new ArrayList<Booking>();

        ArrayList<Bus> buses = new ArrayList<Bus>();
        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,true,35));
        buses.add(new Bus(4,false,50));
        Scanner in = new Scanner(System.in);
        for(Bus b:buses){
            b.displayBusInfo();
        }

        int userOpt = 1;

        while (userOpt == 1) {
            System.out.println("Enter 1 to Book and 2 to Exit");
             userOpt = in.nextInt();
             if(userOpt ==1){
                Booking booking = new Booking();
                if(booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("Your Bokking is confirmed ");
                }
                else{
                    System.out.println("Sorry bus is full.Try Another bus or date.");
                }
             }
        }
    }
}
