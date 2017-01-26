package net.lliira.leetcode.r201;

/**
 * Created by Jerric on 1/26/2017.
 */
public class P204CountPrime {
    public int countPrimes(int n) {
        final boolean[] nonPrimes = new boolean[n];
        for (int i = 2; i * i < n; i++) {
            if (nonPrimes[i]) continue;
            for (int j = i * i; j < n; j+= i) nonPrimes[j] = true;
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!nonPrimes[i]) count++;
        }
        return count;
    }
}
