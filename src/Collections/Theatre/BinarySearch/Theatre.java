package Collections.Theatre.BinarySearch;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Theatre {
    private final String TheatreName;
    private List<Seat> seats = new LinkedList<>();

    public Theatre(String theatreName,int numRows, int seatsPerRow) {
        TheatreName = theatreName;
        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat( row + String.format ( "%02d" , seatNum ) ) ;
                seats.add (seat) ;
            }
        }
    }

    public String getTheatreName() {
        return TheatreName;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = new Seat(seatNumber);
        int FoundSeat = Collections.binarySearch(seats,requestedSeat,null);

        if (FoundSeat >= 0){
            return seats.get(FoundSeat).reserve();
        }
        else {
            System.out.println("There is No Seat As "+ seatNumber);
            return false;
        }
        //        for (Seat seat: seats) {
//            if (seat.getSeatNumber().equals(seatNumber)){
//                requestedSeat = seat;
//                break;
//            }
//        }
//        if ( requestedSeat == null ) {
//            System.out.println ( " There is no seat"+ seatNumber);
//            return false ;
//        }
//        return requestedSeat.reserve();
    }

    public void getSeats(){
        for(Seat seat : seats){
            System.out.println(seat.getSeatNumber());
        }
    }

    private class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve(){
            if (!this.reserved){
                this.reserved = true;
                System.out.println("Seat "+ seatNumber+" Reserved ");
                return true;
            }else
                return  false;
        }

        public boolean cancel () {
            if ( this.reserved ) {
                this.reserved = false ;
                System.out.println ( " Reservation of seat " + seatNumber + " cancelled " ) ;
                return true ;
            } else
                return false ;
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }

}

