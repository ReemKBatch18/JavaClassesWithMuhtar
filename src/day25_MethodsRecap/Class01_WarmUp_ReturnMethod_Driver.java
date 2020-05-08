package day25_MethodsRecap;
/*
1. write a return method named getDriver1 that accepts a string parameter called Browser
				if the browser name matches with {"chrome", "firefox", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
							....
				if the browser name does not match with any of browsers above, the method should return "Invalid"
				APPLY SWITCH STATEMENTS
 */
public class Class01_WarmUp_ReturnMethod_Driver {
    // TO CREATE A METHOD WE NEED:
    /* Access-modifier  Specifier  return-Type  MethodName (parameter){
     Statement; }
     Access-Modifier: public, protected, default, private -- we usaully use public
                public: visible to the world
     Specifier: static, final, abstract, synchronized
                static: can be called through class name
     return-types: void, any datatype like int, String, chart....
                void: executes function but does NOT return any value from method
                datatype: executes function but it also MUST returns a value from method that matches the return type
         */
    // HERE IS OUR MAIN METHOD TO CALL THE METHOD WE ARE CREATING:
    public static void main(String[] args) {
        getDriver1("chrome"); // it is mandatory to provide argument. The kind of argument here must be a String.
        // We can assign this to a variable (String) to reuse it again.
        String str = getDriver1("chrome"); //==> Chrome Driver
        System.out.println(str);

        getDriver2("ChRoMe"); //getDriver2 method, we did with multi if statements
        String str2 = getDriver2("ChRoMe");
        System.out.println(str2);

        getDriver3("firefox");
        String str3 = getDriver3("fireFox");
        System.out.println(str3);
    }

    // HERE IS THE METHOD WE ARE CREATING: getDriver1
    public static String getDriver1(String broweserName){
        // can I pass a string in the switch statement expression? yes I can.
        // we can not pass double, boolean, long, or float in switch statemnts at all.
        // We need to return a string in this method therefore, the value i'm returning I can create a variable for it:
        // The variable we will declare must be String because we are returning String
        String result = "";
        switch (broweserName.toLowerCase()){ // we need to convert to lower case here so string is not case sensitive
            // we can also put: switch (broweserName.toLowerCase().replace(" "), ("")) to make sure fire fox = firefox
            case "chrome": result= "Chrome Driver";
            break;
 // We can use return statement instead of result here and we won't need break; after each one because it exits method if condition is true
            case "firefox": result= "Firefox Driver";
            break;
            case "safari": result = "Safari Driver";
            break;
            case "opera" : result = "Opera Driver";
            break;
            case "edge": result = "Edge Driver";
            break;
            default: result= "Invalid Driver"; // No need for break statement because it is at the end of switch statement
                // if we put default at the beginning we have to put break; after it.
                // switch statement is the easiest way to add more browsers in the future if we have to
        }
       return result;
    }


    // NOW WE WILL DO IT WITH MULTIBRANCH IF STATEMENTS IN A METHOD CALLED getDriver2
    public static String getDriver2 (String browserName){
        browserName = browserName.toLowerCase(); // so we can ignore case sensitivity
    //    String result = "";
        if (browserName.equals("chrome")){
            // we can apply .equalsIgnoreCase here because it can give a boolean expression
    //        result = "Chrome Driver";
            return "Chrome Driver";     // return will exit method if condition is true
        }else if(browserName.equals("firefox")){
     //       result = "Firefox Driver";
            return "Firefox Driver";
        }else if (browserName.equals("safari")){
    //        result = "Safari Driver";
            return "Safari Driver";
        }else if (browserName.equals("edge")){
     //       result = "Edge Driver";
            return "Edge Driver";
        }else if (browserName.equals("opera")){
   //         result = "Opera Driver";
            return "Opera Driver";
        }else {
   //         result = "Ivalid Driver";
            return "Ivalid Driver";
        }
  //      return result;
    }



    // NOW WE WILL DO THE SAME TASK WITH TERNARY IN A METHOD CALLED getDriver3
    public static String getDriver3(String browserName){
        // we need to ignore case sensitivity here better than in the ternary
        browserName = browserName.toLowerCase();
        String result = "";

        // we apply the ternary to the String variable result
        result = (browserName.equals("chrome"))?"Chrome Driver":(browserName.equals("firefox"))?"Firefox Driver":
                (browserName.equals("edge"))?"Edge Driver":(browserName.equals("opera"))?"Opera Driver":"Invalid Driver";

        return result;
    }
}



