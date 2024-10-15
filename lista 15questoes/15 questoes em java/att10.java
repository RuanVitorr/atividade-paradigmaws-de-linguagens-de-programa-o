class Calculadora {
    int somar(int a, int b) {
        return a + b;
    }

    int somar(int a, int b, int c) {
        return a + b + c;
    }
}

Calculadora calc = new Calculadora();
System.out.println(calc.somar(2, 3));
System.out.println(calc.somar(2, 3, 4));
