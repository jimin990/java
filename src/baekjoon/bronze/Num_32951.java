package baekjoon.bronze;

import java.io.*;

public class Num_32951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(N-2024));
        bw.flush();
        bw.close();
    }
}
