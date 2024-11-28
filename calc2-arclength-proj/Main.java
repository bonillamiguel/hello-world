
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
public class Main {
 
public static void main(String[] args) {
 
double sum = 0, ds;
 
System.out.println("Curve: y = xsin(x/2), 72 <= x <= 82");
 
System.out.println("x: 
f(x):");
 
for(int i = 73; i <= 82; i++){
 
ds = sqrt(1 + pow((i/2.0) * Math.cos(i/2.0) + Math.sin(i/2.0), 2));
 
sum += ds;
 
System.out.println(" " + i + " 
" + ds);
 
}
 
System.out.println("Sum: " + sum);
 
}
