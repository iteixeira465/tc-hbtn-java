public class Quadrado {
    public static double area(double lado){
        double area = 0;
        if(lado > 0){
            area = lado * lado;
        } else{
            throw new IllegalArgumentException("Lado deve possuir valor positivo");
        }
        return area;
    }
}