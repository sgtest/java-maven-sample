package mypkg;

class StaticInit {

    private static int q;

    static {
        // local variables in static initializer block should be resolvable
        int i = 0;
        while (i < 10) {
            q = i++;
        }
    }
}
