package OfficeHours_wSaim.Practice_06_10_2020;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
    (*) Create a class that has the following instance variables:
    String body, and String dateTime
    - Encapsulate body. Provide a public getter and setter(update)
    - Make dateTime final and read only (getter)
(*) Create a constructor that will take the body and initialize store it to the instance variable. Upon creation of the post the current time should be taken and stored into the dateTime variable
(*) Implement post method to create a post by the given body and store it to the ArrayList of Posts of the user
     */
public class c06_Post {

    private String body; //body of the post
    // when we have a post we will have time and date for when we post it
    // so we want to have that day and time here
    private String dateAndTime;

        // constructor
        public c06_Post(String body){
            //whenever we create post object it will add body here
            // and it will add current date and time
            setBody(body);
            setDateAndTime();
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public String getDateAndTime() {
            return dateAndTime;
        }

        public void setDateAndTime() {
            //we want to get the current date and time here
            // so it will set it with current date and time (not with parameters we pass)
            LocalDateTime dt = LocalDateTime.now();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a");
            this.dateAndTime= dt.format(format);
        }

       // here I will override toString method so that I decide how I want my object from post class printed
       // which is I decide how I want body of post and date printed
       //  I will try in c07_Test class.
        @Override
    public String toString(){
            return body+"\n"+dateAndTime;
        }

}
