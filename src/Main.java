import java.io.*;
import java.util.Random;
import java.lang.*;

import org.apache.commons.codec.digest.Crypt;

public class Main {

    public static void main(String[] args) throws IOException {
        Random rand = new Random();
        PrintWriter writer100 = new PrintWriter(new BufferedWriter(new FileWriter("db100.txt", true)));
        PrintWriter writer500 = new PrintWriter(new BufferedWriter(new FileWriter("db500.txt", true)));
        PrintWriter writer1000 = new PrintWriter(new BufferedWriter(new FileWriter("db1000.txt", true)));
        PrintWriter writer5000 = new PrintWriter(new BufferedWriter(new FileWriter("db5000.txt", true)));
        PrintWriter writer10000 = new PrintWriter(new BufferedWriter(new FileWriter("db10000.txt", true)));
        PrintWriter writer50000 = new PrintWriter(new BufferedWriter(new FileWriter("db50000.txt", true)));
        PrintWriter writer100000 = new PrintWriter(new BufferedWriter(new FileWriter("db100000.txt", true)));
        PrintWriter writer500000 = new PrintWriter(new BufferedWriter(new FileWriter("db500000.txt", true)));
        PrintWriter writer1000000 = new PrintWriter(new BufferedWriter(new FileWriter("db1000000.txt", true)));
        for (int i = 0; i < 1000000; i++) {
            int a1 = rand.nextInt(2) + 1;
            int a2 = 9;
            int a3 = rand.nextInt(9 - 4 + 1) + 4;
            int a4 = rand.nextInt(10);
            int m1 = rand.nextInt(2);
            int m2 = rand.nextInt(10);
            int g1 = rand.nextInt(4);
            int g2 = rand.nextInt(10);
            int A2 = a1 == 2 ? 0 : a2;
            int A3 = a1 == 2 ? rand.nextInt(2) : a3;
            int A4 = a1 == 2 ? 0 : a4;
            int M2_1 = m1 == 1 ? rand.nextInt(3) : m2;
            int M2 = M2_1 == 0 ? rand.nextInt(2) + 1 : M2_1;
            int G1 = m1 == 0 && M2 == 2 ? rand.nextInt(3) : g1;
            int G31 = g1 == 3 && ((m1 == 0 && (M2 == 1 || M2 == 3 || M2 == 5 || M2 == 7 || M2 == 8)) || (m1 == 1 && (M2 == 0 || M2 == 2))) ? rand.nextInt(2) : 0;
            int G21 = g1 == 3 ? G31 : g2;
            int G2 = g1 == 0 ? rand.nextInt(9) + 1 : G21;
            int Gf = m1 == 0 && M2 == 2 && G1 == 0 ? rand.nextInt(9) + 1 : G2;
            //System.out.println(a1 + "" + A2 + "" + A3 + "" + A4 + "" + m1 + "" + M2 + "" + G1 + "" + Gf + " " + crypter.crypt(a1 + "" + A2 + "" + A3 + "" + A4 + "" + m1 + "" + M2 + "" + G1 + "" + Gf, "parallel"));
            if (i < 100) {
                writer100.println(a1 + "" + A2 + "" + A3 + "" + A4 + "" + m1 + "" + M2 + "" + G1 + "" + Gf + " " + Crypt.crypt(a1 + "" + A2 + "" + A3 + "" + A4 + "" + m1 + "" + M2 + "" + G1 + "" + Gf, "parallel"));
            }
            if (i < 500) {
                writer500.println(a1 + "" + A2 + "" + A3 + "" + A4 + "" + m1 + "" + M2 + "" + G1 + "" + Gf + " " + Crypt.crypt(a1 + "" + A2 + "" + A3 + "" + A4 + "" + m1 + "" + M2 + "" + G1 + "" + Gf, "parallel"));
            }
            if (i < 1000) {
                writer1000.println(a1 + "" + A2 + "" + A3 + "" + A4 + "" + m1 + "" + M2 + "" + G1 + "" + Gf + " " + Crypt.crypt(a1 + "" + A2 + "" + A3 + "" + A4 + "" + m1 + "" + M2 + "" + G1 + "" + Gf, "parallel"));
            }
            if (i < 5000) {
                writer5000.println(a1 + "" + A2 + "" + A3 + "" + A4 + "" + m1 + "" + M2 + "" + G1 + "" + Gf + " " + Crypt.crypt(a1 + "" + A2 + "" + A3 + "" + A4 + "" + m1 + "" + M2 + "" + G1 + "" + Gf, "parallel"));
            }
            if (i < 10000) {
                writer10000.println(a1 + "" + A2 + "" + A3 + "" + A4 + "" + m1 + "" + M2 + "" + G1 + "" + Gf + " " + Crypt.crypt(a1 + "" + A2 + "" + A3 + "" + A4 + "" + m1 + "" + M2 + "" + G1 + "" + Gf, "parallel"));
            }
            if (i < 50000) {
                writer50000.println(a1 + "" + A2 + "" + A3 + "" + A4 + "" + m1 + "" + M2 + "" + G1 + "" + Gf + " " + Crypt.crypt(a1 + "" + A2 + "" + A3 + "" + A4 + "" + m1 + "" + M2 + "" + G1 + "" + Gf, "parallel"));
            }
            if (i < 100000) {
                writer100000.println(a1 + "" + A2 + "" + A3 + "" + A4 + "" + m1 + "" + M2 + "" + G1 + "" + Gf + " " + Crypt.crypt(a1 + "" + A2 + "" + A3 + "" + A4 + "" + m1 + "" + M2 + "" + G1 + "" + Gf, "parallel"));
            }
            if (i < 500000) {
                writer500000.println(a1 + "" + A2 + "" + A3 + "" + A4 + "" + m1 + "" + M2 + "" + G1 + "" + Gf + " " + Crypt.crypt(a1 + "" + A2 + "" + A3 + "" + A4 + "" + m1 + "" + M2 + "" + G1 + "" + Gf, "parallel"));
            }
            if (i < 1000000) {
                writer1000000.println(a1 + "" + A2 + "" + A3 + "" + A4 + "" + m1 + "" + M2 + "" + G1 + "" + Gf + " " + Crypt.crypt(a1 + "" + A2 + "" + A3 + "" + A4 + "" + m1 + "" + M2 + "" + G1 + "" + Gf, "parallel"));
            }
        }

        writer100.close();
        writer500.close();
        writer1000.close();
        writer5000.close();
        writer10000.close();
        writer50000.close();
        writer100000.close();
        writer500000.close();
        writer1000000.close();

        //test crypt
        String test = "19961024";
        String crypt1 = Crypt.crypt(test, "parallel");
        String test2 = "19961024";
        String crypt2 = Crypt.crypt(test2, "parallel");
        System.out.println(crypt1.equals(crypt2));
    }
}
