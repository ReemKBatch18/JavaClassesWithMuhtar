package Tasks.Replits;


/*
In  Db class we have two attributes/instance variables with the private visibility.
meaning they cannot be accessed outside of the class.
Instance variables:
   1) name: data -
       type: String
       Visibility/Access modifier: private
   2) name: yint -
       type: int
       Visibility/Access modifier: private
Methods:
    - insertData - lets you set the values to above encapsulated instance variables.
    - getData - getter method for private data
    - getYint - getter method for private yint
    - setData - setter method for private data
    - setYint - setter method for private yint
 */
public class Rep_Encapsulation_Db {

    private String data;
    private int yint;

    public void insertData(String data, int yint){
        this.data = data;
        this.yint = yint;
    }
    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }
    public int getYint(){
        return yint;
    }
    public void setYint(int yint){
        this.yint = yint;
    }

}
