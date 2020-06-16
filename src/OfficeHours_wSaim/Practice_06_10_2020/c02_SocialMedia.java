package OfficeHours_wSaim.Practice_06_10_2020;
    /*
    (*) Create an abstract class for Social Media that has the following features:
    - Direct messaging(String username, String message)
    - Post(String body)
    - Notifications(int time)
   (*) The Social Media will also have the following fields:

    - Personal URl (String)
    - Account length (int) : means how long you've had your account open for
    - Platform (static String) ==> either facebook or instagram
                               ==> static because all facebook users will have same platform = facebook
     */
public abstract class c02_SocialMedia {

        // every person using social media need to have social url
        // need to have some account, and have platform
        protected String personalUrl;
        protected int accountLength;
        protected static String platform;

    // we re setting up the rules for whoever inheriting this social media class
    // so if you are social media you need to be able to send direct message, create post, and send notifications
    public abstract boolean directMessage(String username, String message);

    public abstract boolean createPost(String body);

    public abstract void notification(int time);









}
