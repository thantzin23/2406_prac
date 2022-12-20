public class DebugBox
{
   private final int width;
   private final int length;
   private final int height;

   public DebugBox(int width, int length, int height)
   {
      this.width = width;
      this.length = length;
      this.height = height;
   }

   public void showData(){
      System.out.println("Height"+height+"Width"+width+"Length"+length);
   }

   public double getVolume(){
      double vol = length * width * height ;
      return vol;
   }


}

