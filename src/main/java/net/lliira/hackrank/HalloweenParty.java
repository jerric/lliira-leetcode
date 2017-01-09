package net.lliira.hackrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Jerric on 1/8/2017.
 */
public class HalloweenParty {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        if (line == null || line.length() == 0) return;
        final int count = Integer.valueOf(line);
        for (int i = 0; i < count; i++) {
            line = reader.readLine();
            final int cuts = Integer.valueOf(line);
            final int side = cuts / 2;
            final int max = side * (cuts - side);
            System.out.println(max);
        }
    }
}
