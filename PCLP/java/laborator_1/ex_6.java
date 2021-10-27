import java.util.Scanner;

public class ex_6 
{
    public static void main(String[] args) 
    {
        int s_0, t, g, a, p, b, y, m_1, m_2;
        Scanner tast = new Scanner(System.in);
        System.out.println("introduceti a =");
        a = tast.nextInt();
        System.out.println("introduceti b =");
        b = tast.nextInt();
        System.out.println("introduceti m_1 =");
        m_1 = tast.nextInt();
        System.out.println("introduceti m_2 =");
        m_2 = tast.nextInt();
        System.out.println("introduceti p =");
        p = tast.nextInt();
        System.out.println("introduceti g =");
        g = tast.nextInt();
        System.out.println("introduceti t =");
        t = tast.nextInt();
        System.out.println("introduceti y =");
        y = tast.nextInt();
        System.out.println("introduceti s_0 =");
        s_0 = tast.nextInt();
        double s = s_0 + s_0 * t + 1/2 * g * Math.pow(t, 2);
        System.out.println("rezultatul lui s este = " + s);
        double G = 4 * Math.pow(Math.PI, 2) * ( Math.pow(a, 3) / Math.pow(p, 2) * (m_1 + m_2));
        System.out.println("rezultatul lui G este = " + G );
        double c = Math.sqrt (Math.pow(a, 2) + Math.pow(b, 2) - 2*a*b*Math.cos(y));
        System.out.println("rezultatul lui c este = " + c);

    }
}
