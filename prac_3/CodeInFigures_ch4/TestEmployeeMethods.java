public class TestEmployeeMethods
{
   public static void main(String[] args)
   {
      Employees aWorker = new Employees();
      aWorker.setValues();
      aWorker.methodThatUsesInstanceAttributes();
      aWorker.methodThatUsesLocalVariables();
   }
}
