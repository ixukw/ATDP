import java.lang.Math;

/**
 * Write a description of class gEomEtry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Geometry2
{

    public static double cubeVolume(double h) {
        double answer = h * h * h;
        return answer;
    }
    
    public static double cubeSurface(double h) {
        double answer = h * h * 6;
        return answer;
    }
    
    public static double sphereVolume(double r) {
        double answer = (4 * Math.PI * (Math.pow(r, 3)) / 3);
        return answer;
    }
    
    public static double sphereSurface(double r) {
        double answer = 4 * Math.PI * (Math.pow(r, 2));
        return answer;
    }
    
    public static double cylinderVolume(double r, double h) {
        double answer = (2 * Math.PI * (Math.pow(r, 2))) + (2 * Math.PI * r * h);
        return answer;
    }
    
    public static double cylinderSurface(double r, double h) {
        double answer = Math.PI * (Math.pow(r, 2)) * h;
        return answer;
    }
    
    public static double coneVolume(double r, double h) {
        double answer = (Math.PI * (Math.pow(r, 2)) * h) / 3;
        return answer;
    }
    
    public static double coneSurface(double r, double h) {
        double answer = (Math.PI * r * (r + (Math.sqrt(Math.pow(h, 2) + Math.pow(r, 2)))));
        return answer;
    }
}
