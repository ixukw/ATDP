import java.util.Scanner;
/**
 * This tests the Geometry Class
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Geometry2Tester
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a height (this will be used to calculate the formulas!): ");
        double height = input.nextDouble();
        System.out.println();
        System.out.print("Enter a radius (This will be used to calculate the formulas!): ");
        double radius = input.nextDouble();
        System.out.println();
        
        double cubeVolume = Geometry2.cubeVolume(height);
        double cubeSurface = Geometry2.cubeSurface(height);
        double sphereVolume = Geometry2.sphereVolume(radius);
        double sphereSurface = Geometry2.sphereSurface(radius);
        double cylinderVolume = Geometry2.cylinderVolume(radius, height);
        double cylinderSurface = Geometry2.cylinderSurface(radius, height);
        double coneVolume = Geometry2.coneVolume(radius, height);
        double coneSurface = Geometry2.coneSurface(radius, height);
        
        System.out.println("Cube Volume: " + cubeVolume);
        System.out.println("Cube Surface: " + cubeSurface);
        System.out.println("Sphere Volume: " + sphereVolume);
        System.out.println("Sphere Surface: " + sphereSurface);
        System.out.println("Cylinder Volume: " + cylinderVolume);
        System.out.println("Cylinder Surface: " + cylinderSurface);
        System.out.println("Cone Volume: " + coneVolume);
        System.out.println("Cone Surface: " + coneSurface);
    }
}
