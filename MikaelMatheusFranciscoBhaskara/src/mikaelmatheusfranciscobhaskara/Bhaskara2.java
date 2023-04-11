
package mikaelmatheusfranciscobhaskara;

public class Bhaskara2 extends MikaelMatheusFranciscoBhaskara {
   
    public int a;
    public int b;
    public int c;
    public int delta;
    public int x1;
    public int x2;

    public Bhaskara2 () {
    }
    
    

    public Bhaskara2 (int a, int b, int c, int delta, int x1, int x2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = delta;
        this.x1 = x1;
        this.x2 = x2;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }
    
    public void ValorDelta(){
        delta= b*b - 4*a*c;
    }
    
    public void Valorx1(){
        x1 = (int) ((-b + Math.sqrt(delta)) / (2 * a));
    }
    
    public void Valorx2(){
        x2 = (int) ((-b - Math.sqrt(delta)) / (2 * a));
    }
    
    public void Status(){
        System.out.println("O valor de Delta e: " + this.delta);
        System.out.println("x1 vele: " + this.x1);
        System.out.println("x2 vale: " + this.x2);
    }
}

