package metier;

import org.junit.Assert;

public class CalculTest {
    private Calcul calcul;
    public void TestSomme(){
        double a=5; double b=9;
        calcul=new Calcul();
        double expected=14;
        double res=calcul.somme(a,b);
        Assert.assertTrue(res==expected);
    }
}
