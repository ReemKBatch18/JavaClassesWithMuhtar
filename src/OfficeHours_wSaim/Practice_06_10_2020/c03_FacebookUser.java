package OfficeHours_wSaim.Practice_06_10_2020;

import java.util.ArrayList;

/*
    Facebook User:
(*) Create a class for a facebook user which inherits the Social Media class and additional instance variables: username, password, full name, age, and number of friends
(*) Encapsulate all the variables.
(*) Create a constructor which will create a facebook user by taking username and password.
    - If the password contains the username then it is not a valid password and should not be saved. In this case Print “Password contained username. Default password created: ‘password’” and set the password for the user to the default value.
    - Create and assign the the user's person url by taking 'facebook.com/' and adding their username
    - Set the account length to 0
    - Set the platform for "Facebook" using static block
(*) Overload the constructor to accept username, password, and the user’s name.
    - If the name entered has any characters that are not letters from the alphabet, then the name is invalid. In this case print “invalid name” and assign the name value to be ‘no name’
(*) Overload the constructor to accept username, password, the user’s name, age and number of friends.
    - Only store the age and number of friends into the variables if they are valid numbers ( No negative numbers ). If they are invalid print “Invalid (age/number of friends) and keep the values as the default of 0.

 (*) Implement all methods coming from Social Media class
    (*) Direct messaging(String username, String message)
        - print = %message sent to %username
    (*) Post(String body)
        - Should be added to the the ArrayList of Posts of the user
    (*) Notifications(int time)
        - Checks the current time. If the time is between 8 am - 5 pm print "Notification", otherwise print "Sleep mode"
(*) Override the toString method to print all of the information of a Facebook user when they are searched.




     */
public class c03_FacebookUser extends c02_SocialMedia implements c05_Groups {


    // here we will declare our private variables
    // then we will encapsulate them ==> we can apply the rules we want in the setter method to be used later
    // ==> generate getters and setters for all of them
      private String username;
      private String password;
      private String fullName;
      private int age;
      private int numberOfFriends;
     // we can add this too for the group interface:
      private int numberOfGroups;
      //here we will store our collection of posts in this arraylist
    // we will store the objects created in post class
      private ArrayList<c06_Post> allPosts;


      // here we will initialize the static variable platform inherited from super class social media in a static block
        // because static block runs first we want to declare our platform here
      static {
          platform = "Facebook";
      }

        // here I will create my constructor with two variables
         // we will only call set methods in the constructor
        // instead of adding logic in set method and in constructor ==> we can add logic only in set methods
        // we set our rules in the set method, then we call our set method in the constructor
         public c03_FacebookUser(String username, String password){
          setUsername(username);
          setPassword(password);
          // here we will set a personal url(inherited from social media class) for every user on facebook like this
          // personal url and account length are inherited form super class social media
          // we will set the account length to 0
          personalUrl = "Facebook.come/" +username;
          accountLength = 0;
          // here I will initialize my array list of posts
          allPosts = new ArrayList<>();
      }

      // Here we will overload our constructor like this:
        public c03_FacebookUser(String username, String password, String fullName){
          // here we will call the first constructor we created before then handle fullName separately
            this(username, password);
            setFullName(fullName);
        }

        // here we will overload constructor again
        public c03_FacebookUser(String username, String password, String fullName, int age, int numberOfFriends ){
          this(username,password,fullName);
          //we will set rule for age in set age
            // we will set rule for number of friends in set number of friends
            setAge(age);
            setNumberOfFriends(numberOfFriends);
        }

        // getter and setter for userName
        public String getUsername() {
            return username;
        }
        public void setUsername(String username) {
            this.username = username;
        }

        // getter and setter for password
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
          // here we will set the password rule
          if (password.contains(username)){
              System.out.println("Invalid password, username is in password");
              password = "password";
          }
          this.password = password;
        }


        // getter and setter for fullName variable
        public String getFullName() {
            return fullName;
        }
        public void setFullName(String fullName) {
          //I'm gonna assume my name is always true
          boolean isValid = true;
          // we need to delete all spaces in full name
            String check = fullName.replace(" ", "");
          for (int i=0; i<check.length(); i++){
              // we will check if characters are not letters
              if ( ! Character.isLetter(check.charAt(i))){
                  isValid = false;
                  break;
              }
          }
          if (isValid) {
              this.fullName = fullName;
          }else {
              System.out.println("This is not a valid name");
              this.fullName= "No name";
          }
        }


        // getter and setter for Age variable
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
           if (age <0){
               System.out.println("invalid age");
               age = 0;
           }
            this.age = age;
        }

        // getter and setter for numberOfFriends variable
        public int getNumberOfFriends() {
            return numberOfFriends;
        }
        public void setNumberOfFriends(int numberOfFriends) {
            if (numberOfFriends>0){
                this.numberOfFriends=numberOfFriends;
            }else {
                System.out.println("invalid number of friends");
                this.numberOfFriends = 0;
            }
      }

    //getter and setter for numberOfGroups
        public int getNumberOfGroups() {
            return numberOfGroups;
        }
        public void setNumberOfGroups(int numberOfGroups) {
            this.numberOfGroups = numberOfGroups;
        }


    // getter and setter for allPosts variable
    public ArrayList<c06_Post> getAllPosts() {
        return allPosts;
    }
    public void setAllPosts(ArrayList<c06_Post> allPosts) {
        this.allPosts = allPosts;
    }


    @Override
        public boolean directMessage(String username, String message) {
        if (message.isEmpty()) {
            return false;
        }
        System.out.println("Sent " + message + " to " + username);
        return true;
    }

        @Override
        public boolean createPost(String body) {
         // here I will add the posts created as objects from post class to here
            // I'm calling the constructor from post class
            // I'm creating a post object from that class
            // here in this method : takes object I make and stores to my collection of all posts
          allPosts.add(new c06_Post(body));

            return true;
        }

        @Override
        public void notification(int time) {

        }

        @Override
        public boolean joinGroup(String name) {
            System.out.println(fullName +" welcome to "+name);
            numberOfGroups++;
            return true;
        }

        @Override
        public boolean leaveGroup(String name) {
            System.out.println(fullName+" do you really want to leave? "+name);
            numberOfGroups--;
            return false;
        }



    }
