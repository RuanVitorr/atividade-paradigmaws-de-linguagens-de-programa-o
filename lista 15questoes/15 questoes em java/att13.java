class Matematica {
    static int fatorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fatorial(n - 1);
    }
}

System.out.println(Matematica.fatorial(5));
