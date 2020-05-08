package Tasks.Replits;
/*
To book  a room first it needs to be available for rent and make sure its available at the date selected:
the room is already booked between 7/1/2018 - 7/8/2018 and not available
accepting bookings only for year of 2018
example:
simpleRoomBook(false,2,1,2018)
    return false
simpleRoomBook(true,2,1,2018)
    return true
simpleRoomBook(true,7,2,2018)
    return false
 */
public class Rep_164_Methods_wReturn_SimpleRoomBooking {
    public static void main(String[] args) {
        // Here we will try our method
        System.out.println(simpleRoomBook(false,2,1,2018)); // false
        System.out.println(simpleRoomBook(true,2,1,2018)); // true
        System.out.println(simpleRoomBook(true,7,2,2018)); // false


    }

    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
        if (isAvailable){
            if (year ==2018){
                if (month ==7){
                    if (day >= 1 && day <= 8){
                        return false;
                    }else {
                        return true;
                    }
                }else {
                    return true;
                }
            }else {
                return false;
            }
        }else {
            return false;
        }


    }
}
