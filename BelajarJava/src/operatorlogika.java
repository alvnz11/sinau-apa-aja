package src;

public class operatorlogika {
    
    public static void main(String[] args) {
        
        //Operator Komparasi

        int a=10; 
        int b=10;
        boolean hasilKomparasi;
    
        hasilKomparasi = (a == b);
        System.out.printf( "%d = %d --> %s \n",a, b, hasilKomparasi);

        a=12; 
        b=10;
        hasilKomparasi = (a == b);
        System.out.println(a + " = " + b + " --> " + hasilKomparasi);

        a=10; 
        b=10;
        hasilKomparasi = (a != b);
        System.out.println(a + " ! " + b + " --> " + hasilKomparasi);
                                                                        //!= --> pertidaksamanaan
        a=12; 
        b=10;
        hasilKomparasi = (a != b);
        System.out.println(a + " ! " + b + " --> " + hasilKomparasi);


        a=12; 
        b=10;
        hasilKomparasi = (a <= b);
        System.out.println(a + " < " + b + " --> " + hasilKomparasi);

        a=12; 
        b=10;
        hasilKomparasi = (a >= b);
        System.out.println(a + " > " + b + " --> " + hasilKomparasi);
        System.out.println("====================");

        //Operator Logika

        //Operator "OR" (||) ---> logikanya ditambah (+)

        System.out.println("Operator OR \n");
        boolean d, e, f;

        d = true;
        e = true;
        f = (d || e);
        System.out.println("true || true --> " + f);

        d = true;
        e = false;
        f = (d || e);
        System.out.println("true || false --> " + f);

        d = false;
        e = true;
        f = (d || e);
        System.out.println("false || true --> " + f);

        d = false;
        e = false;
        f = (d || e);
        System.out.println("false || false --> " + f);

        System.out.println("====================");

        //Operator "AND" (&&) ---> logikanya dikali (*)

        System.out.println("Operator AND \n");

        d = true;
        e = true;
        f = (d && e);
        System.out.println("true && true --> " + f);

        d = true;
        e = false;
        f = (d && e);
        System.out.println("true && false --> " + f);

        d = false;
        e = true;
        f = (d && e);
        System.out.println("false && true --> " + f);

        d = false;
        e = false;
        f = (d && e);
        System.out.println("false && false --> " + f);
        System.out.println("====================");

        //Operator "XOR" (^) ---> logikanya bila sama false bila beda true

        System.out.println("Operator XOR \n");

        d = true;
        e = true;
        f = (d ^ e);
        System.out.println("true ^ true --> " + f);

        d = true;
        e = false;
        f = (d ^ e);
        System.out.println("true ^ false --> " + f);

        d = false;
        e = true;
        f = (d ^ e);
        System.out.println("false ^ true --> " + f);

        d = false;
        e = false;
        f = (d ^ e);
        System.out.println("false ^ false --> " + f);
        System.out.println("====================");

        //Negasi (!)

        System.out.println("Negasi \n");
        d = false;
        f = !d;

        System.out.println("false --> (!) = " + f);

        d = true;
        f = !d;
        System.out.println("true --> (!) = " + f);

    }
}
