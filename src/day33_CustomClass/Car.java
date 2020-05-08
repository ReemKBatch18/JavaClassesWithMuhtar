package day33_CustomClass;

public class Car {
    // those are instance variables NOT local variables
    String Brand;
    String Model;
    int year;
    String color;

    public void start(){            //   we will call this method through each object car1 and then car2 (in class07)
        System.out.println(Brand+ " is started");
    }

    public void drive(){    // instance method ==> call through the object
        System.out.println("Driving "+ Brand+" "+ Model);
    }

    public void getCarInfo(){
        System.out.println(year+ " " + Brand+" "+ Model+" "+ color);
    }

    // after I pass those variable, I can assign them to each instance variable
    public void setCarInfo(String carBrand, String carModel, int carYear, String carColor){
        Brand = carBrand;
        Model = carModel;
        year = carYear;
        color = carColor;
        // then whenever I call this action, I will have to provide these info, whenever
    }

    public String toString(){ // the name of method must be toString..
        // compiler calls this method of printing automatically if we pass the object name
          String result =  Brand+ " " +year + " " + Model+ " " +color;
         return result;
        }



    public static void main(String[] args) {

    }
}
