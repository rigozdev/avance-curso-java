public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();


        for(int i = 0; i < 2000; i++){
            c = c.concat(a).concat(b).concat("\n"); //500 => 2ms 1000 => 3ms    2000 => 7ms

            //c += a + b + "\n"; //500 =>  19ms   1000 => 13ms  2000 => 13ms

            //sb.append(a).append(b).append("\n");// 500 => 0ms 1000 => 0ms   2000 => 0ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
