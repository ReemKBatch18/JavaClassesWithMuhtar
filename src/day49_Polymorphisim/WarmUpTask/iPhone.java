package day49_Polymorphisim.WarmUpTask;
    /*
        4. create a class named iPhone that can inherit from AppleApps interface
            actions that every iphone can do: texting(), calling(), faceTiming(), selfie()
     */

    // i will give final keyword to this class so no other class can inherit from it or copy form it
public final class iPhone extends Phone implements AppleApps {


        // here I will initialize my static variable in a static block
        // I can initialize in constructor but then it will have to be created as many times as many objects we are creating
        // whereas in static block we initialize once
        static {
            brand = "Apple";
        }
        // constructor
        public iPhone(String model, double price, String size) {
            this.model = model;
            this.price = price;
            this.size = size;
        }

        @Override
        public void download() {
            System.out.println("iPhone is downloading in apps from "+AppStoreName);
        }

        @Override
        public void texting(long phoneNumber) {
            System.out.println("iPhone is texting to "+phoneNumber);
        }

        @Override
        public void calling(long phoneNumber) {
            System.out.println("iPhone is calling to "+phoneNumber);
        }

        // here we will create the method that belong only to iPhone
        public void faceTiming(long phoneNumber){
            System.out.println("iPhone is facetiming "+phoneNumber);
        }
        public void selfie(){
            System.out.println("iPhone is taking selfie");
        }


    }
