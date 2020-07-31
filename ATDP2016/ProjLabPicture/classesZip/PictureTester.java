/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testGrayscale()
  {
      Picture selfie = new Picture("selfie.jpg");
      selfie.explore();
      selfie.grayscale();
      selfie.explore();
  }
  
  public static void testkeepOnlyBlue() 
  {
      Picture beach = new Picture("DRAGON!.jpg");
      beach.explore();
      beach.keepOnlyBlue();
      beach.explore();
  }
  
  public static void testNegate()
  {
      Picture beach = new Picture("DRAGON!.jpg");
      beach.explore();
      beach.negate();
      beach.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // Method Calls (Uncomment and Comment): 
    //testZeroBlue();                                   //COMPLETED |
    testkeepOnlyBlue();                               //COMPLETED |
    //testKeepOnlyRed();                                //COMPLETED |
    //testKeepOnlyGreen();                              //COMPLETED |
    testNegate();                                     //COMPLETED |
    testGrayscale();                                  //COMPLETED |
    //testFixUnderwater();
    //testMirrorVertical();                             //COMPLETED |
    //testMirrorTemple();                               //COMPLETED |
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();                                    //COMPLETED |
    //testCopy();
    //testEdgeDetection();                              //COMPLETED |
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}