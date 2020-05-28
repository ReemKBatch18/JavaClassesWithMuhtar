package day44_Exceptions;



class c08_ExceptionPractice {

    public static void main(String[] args) {


        try{    // we can place as many statement in the block
            System.out.println("hi");
            System.out.println("java");
            System.out.println("*********");
            System.out.println(9/0);    // as soon as this happens ==> jumps to catch block
            System.out.println("cc"); // this will NOT get printed
            System.out.println("bb"); // this will NOT be printed
        }catch (Exception e){

        }

        // but if we place print statements here after catch block ==> will get printed
        System.out.println("hello");
        System.out.println("school");
    }
}
