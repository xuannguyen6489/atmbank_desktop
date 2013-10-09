/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.admin.security;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;

/**
 *
 * @author Xuan Nguyen
 */

public class SystemValidation {
    public static final ImageIcon CORRECT_ICON = new ImageIcon("src/images/icon24x24_correct.gif");
    public static final ImageIcon INCORRECT_ICON = new ImageIcon("src/images/icon24x24_incorrect.png");
    
    private Pattern ckInput;
    //check date by string
   public static String Convert(int val,int lenght){
        String values = String.valueOf(val);
        String zero = "";
        if(values.length() == lenght){
            return values.trim();
        }else{
            for(int i = 0; i < lenght - values.length() ; i++){
                zero += "0";
            }
            zero = zero + values;
            return zero.trim();
        }
    }
   public static String ConvertDateToString(Date date){
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       String da = sdf.format(date);
       return da;
   }
   public static float ConvertFloatMoney(String moneys){
        float money;
        if(moneys.contains(",")){
            money = Float.parseFloat(moneys.replaceAll(",", ""));
        }else{
            money = Float.parseFloat(moneys);
        }
       return money;
       
   }
   public static String ConvertMoneyToString(float money){
       //xai numberformat de convert du~ lieu , vi du: taco float = 5000; khi convert xong ta co String 5,000
       NumberFormat nf = NumberFormat.getInstance();
       return nf.format(money);
   }
   public static String ConvertFloatToString(float money){
        String moneys = String.valueOf(money);
        moneys = moneys.substring(0,moneys.lastIndexOf("."));
       return moneys;
   }
    public boolean validateDate(String date){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date testDate;
        try {
            testDate = sdf.parse(date);
        } catch (ParseException ex) {
            return false;
        }
        if(!sdf.format(testDate).equals(date)){
        return false;
        }
        return true;
    }
    //check is date 
    public boolean validateIsDate(String date){
        if(date.equals("null")){
         return false;   
        }else{
            return true;
        }
    }
    //check phone number
    public boolean validatePhone(String phone){
     ckInput = Pattern.compile("^[0-9]{9,12}");
     Matcher match = ckInput.matcher(phone);
        if(match.matches()){
            return true;
        }
        return false;   
    }
    public boolean validateMoney(String money){
    ckInput = Pattern.compile("^([0-9][,]?){1,15}$");
    Matcher match = ckInput.matcher(money);
        if(match.matches()){
            return true;
        }
        return false;
    }
    public boolean validateEmail(String email){
        ckInput = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[a-z]{2,5})$");
        Matcher match = ckInput.matcher(email);
        if(match.matches()){
        return true;
        }
        return false;
    }
    
}
