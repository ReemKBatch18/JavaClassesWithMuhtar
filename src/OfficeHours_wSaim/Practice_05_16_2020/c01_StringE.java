package OfficeHours_wSaim.Practice_05_16_2020;
/*
Return true if the given string contains between 1 and 3 'e' chars.
stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */
public class c01_StringE {      //CodingBat : Warmup -1
    public boolean stringE(String str) {

        int count = 0;
        for (int i = 0 ; i < str.length(); i++){
            if (str.charAt(i) == 'e'){
                count ++;
            }
        }
        if (count >0  && count <4){
            return true;
        }
        return false;

  /*
  or like Saim's
  int count = 0 ;
  for (int i = 0 ; i < str.length() ; i ++){
    if (str.charAt(i) == 'e'){
      count ++;
    }
  }


  return count >=1 && count <= 3
  */


  /*
  or using WHILE LOOP:
  int count = 0 ;
  while (str.contains("e")){   //as long as str contains e, it will keep executing
    count ++;
    str = str.replaceFirst("e", "");   // we have to reassign after replacing because string is immutable

  }

  */
    }

}
