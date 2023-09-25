package src.operator;

public class operatormat {
    
    public static void main(String[] args) {
        
        int x = 12, y = 5, hasilOperator;

        //penjumlahan
        hasilOperator = x + y;
        System.out.printf("%d + %d = %d \n", x, y, hasilOperator);

        //pengurangan
        hasilOperator = x - y;
        System.out.printf("%d - %d = %d \n", x, y, hasilOperator);

        //perkalian
        hasilOperator = x*y;
        System.out.println(x + " * " + y + " = " + hasilOperator);

        //pembagian
        hasilOperator = x / y;
        System.out.printf("%d / %d = %d \n", x, y, hasilOperator);

        //modulus (sisa pembagian)
        hasilOperator = x % y;
        System.out.printf("%d %% %d = %d \n", x, y, hasilOperator);

        //unary + dan -
        int a = 10;
        System.out.println("Contoh + =" + +a);
        System.out.println("Contoh - =" + -a);

        //unary increment(++) dan decrement(--)
        int b = 5;
        System.out.println("increment postfix = " + b++);
        System.out.println("nilai b setelah increment postfix = " + b); //nilai ditambahkan setelah di increment

        int c = 20;
        System.out.println("increment prefix = " + ++c); //nilai ditambah sebelum di increment

        //untuk logika decrement sama dengan increment

        //Operator assignment

        int d = 100;

        //penjumlahan

        d += 10;
        System.out.println("nilai d setelah ditambah menggunakan operator assignment = " + d); 

        //logika berlaku juga untuk pengurangan, perkalian, pembagian, dan modulus
    }
}
