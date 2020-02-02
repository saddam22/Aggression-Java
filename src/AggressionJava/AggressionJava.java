
package AggressionJava;

public class AggressionJava {
    
    int square(int n){
    return n*n;
    }
}
class Circle{
AggressionJava aj;//aggression
double pi = 3.14;

double area(int radius){
aj = new AggressionJava();
int square = aj.square(radius);//code reuseability(i.e delegates the method call)
return pi*square;
}
    public static void main(String[] args) {
        Circle c = new Circle();
        double result = c.area(5);
        System.out.println(result);
    }
}
