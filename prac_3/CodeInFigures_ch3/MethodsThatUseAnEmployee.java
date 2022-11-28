import java.util.Scanner;
class MethodsThatUseAnEmployee
{
   public static void main (String args[])
   {
     Employees myEmployee;
     myEmployee = getEmployeeData();
     displayEmployee(myEmployee);
   }
   public static Employees getEmployeeData()
   {
      Employees tempEmp = new Employees();
      int id;
      double sal;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter employee ID >> ");
      id = input.nextInt();
      tempEmp.setEmpNum(id);
      System.out.print("Enter employee salary >> ");
      sal = input.nextDouble();
      tempEmp.setEmpSalary(sal);
      return tempEmp;
   }
   public static void displayEmployee(Employees anEmp)
   {
       System.out.println("\nEmployee #" + anEmp.getEmpNum() +
          " Salary is " + anEmp.getEmpSalary());
   }
}
