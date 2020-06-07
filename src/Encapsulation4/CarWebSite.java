package Encapsulation4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class CarWebSite {

    private String brandOfCar ,manufacturedYear;
   private int doorCount;

    public void brand(String brandOfCar) {
        this.brandOfCar = brandOfCar;
    }

    public void manufacturedYear(String manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }

    public void doorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    @Override
    public String toString() {
        LocalDate localDate= LocalDate.parse(manufacturedYear, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        LocalDate localDate1=LocalDate.now();
        Period period=Period.between(localDate,localDate1);
        if (period.getYears()>10||doorCount!=2||doorCount!=4){
            return "This is not a valid search";
        }else if (period.getYears()<10&& doorCount==2||doorCount==4){
            return "brand of the car='" + brandOfCar +"'"+
                    "\nmanufactured date='" + manufacturedYear +"'"+
                    "\ndoor count=" + doorCount;
        }
       return "";

    }
}
