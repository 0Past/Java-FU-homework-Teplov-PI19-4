#1
        package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
    }
}

#2
        package com.company;

public class Main {

    public static void main(String[] args) {
        int a;
        a = 1;
        System.out.println(a);
    }
}

#3
        package com.company;

public class Main {

    public static void main(String[] args) {
        int a;
        int number1;
        a = 1;
        b = 0;
        b = a + 1;
        b = +b;
        b = b + 1 ;

        System.out.println(b);
    }
}

#4
        package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 8 ;
        int b = 10;
        System.out.println("Изначально : a = " + a + " b = "+b);
        a = a^b^(b = a);
        System.out.println("Смена1 : a = "+ a + " b = "  + b);
        a = a + b;
        b = b - a;
        b = -b;
        a = a - b;
        System.out.println("Смена2 : a = "+ a + " b = "  + b);
    }

}

#5
        package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 3 ;
        int b = 4;
        int c;
        c = a*a + b*b;
        System.out.println(Math.sqrt(c));
    }

}

#6
        package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 301 ;
        int b;
        b = a%10;
        System.out.println(b);
    }

}

#7
        package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 312081 ;
        int b;
        b = (a / 10 ) % 10;
        System.out.println(b);
    }

}

#8
        package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 31 ;
        int b;
        b = a / 10;
        System.out.println(b);
    }

}

#9
        package com.company;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in) ;
        int a = enter.nextInt();
        int b = enter.nextInt();
        System.out.println(a-21);
        System.out.println(b-21);
    }

}

#10
        package com.company;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in) ;
        int a = enter.nextInt();
        int b = enter.nextInt();
        System.out.println((a+b)/2);

    }

}

#11
        package com.company;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in) ;
        int a = enter.nextInt();
        int b = enter.nextInt();
        System.out.println(Math.sqrt(a*b));

    }

}

#12
        package com.company;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in) ;
        float a = enter.nextFloat();
        float b = enter.nextFloat();
        float c = enter.nextFloat();
        float d = enter.nextFloat();

        System.out.println(Math.sqrt((a*a-2*a*b+b*b)+(c*c-2*c*d+d*d)));

    }

}
