package practice12_1;

public class PatientInfo {
 public static void main(String[] args) {

  String name="Farya";
  int age=34;
  char gender='F';
  String dateOfBirth="1987/11/18";
  boolean isMarried=true;
  String phone="1234567";
  boolean havingInsurance=true;
  String insuranceNum="56789478ghk";
  String employer="Cydeo";
  double copayWithInsurance=20.00;
  double copayWithoutInsurance=250.00;

  System.out.println(name);
  System.out.println(age);
  System.out.println(gender);
  System.out.println(dateOfBirth);
  System.out.println(isMarried);
  System.out.println("phone = " + phone);
  System.out.println("havingInsurance = " + havingInsurance);
  System.out.println("employer = " + employer);
  System.out.println("insuranceNum = " + insuranceNum);
  System.out.println("copayWithInsurance = " + copayWithInsurance);
  System.out.println("copayWithoutInsurance = " + copayWithoutInsurance);


  System.out.println("\tName: "+name+"\n\tAge: "+age+"\n\tGender: "+gender);

  if (havingInsurance){
   System.out.println("copayWithInsurance = " + copayWithInsurance);
  }else{
   System.out.println("copayWithoutInsurance = " + copayWithoutInsurance);
  }










 }
}











/*
 1. name (String)
         2. age (int)
         3. gender (char)
         4. date of birth (String)
         5. isMarried (boolean)
         6. phone number (String)
         7. havingInsurance (boolean)
         8. Insurance number (String)
         9. Employer (String)
         10. copayWithInsurance (double)
         11. copayWithoutInsurance (double)

 */
