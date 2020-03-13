package BasicMath;

public class BasicMath {

    public static Integer BasicMath(String op, int v1, int v2)
    {
        if(op.equals('+')) {
            return v1 + v2;
        }
        if (op.equals('-')) {
            return v1 - v2;
        }
        if (op.equals('/')) {
            return v1 / v2;
        }
        if (op.equals('*')) {
            return v1 * v2;
        }
        return 0;
    }

  }
