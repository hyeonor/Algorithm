package BaekJoon.알고리즘_기초2.브루트_포스_재귀.암호_만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {// 1759번
    static int L, C;
    static char[] arr;
    static char[] ans;
    static boolean[] visit;
    static StringBuffer sb1 = new StringBuffer();
    static StringBuffer sb2 = new StringBuffer();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        arr = new char[C];
        ans = new char[L];
        visit = new boolean[C];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++) {
            arr[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(arr);

        min(0, 0);

        System.out.println(sb2);
    }

    private static void min(int idx, int depth) {
        if (depth == L) {
            int vowel = 0, consonant = 0, cnt = 0;
            for (int i = 0; i < ans.length - 1; i++) {
                if (ans[i] < ans[i + 1]) cnt++;
                if (vowelCheck(i)) vowel++;
                else consonant++;
                sb1.append(ans[i]);
            }

            int length = ans.length - 1;
            if (vowelCheck(length)) vowel++;
            else consonant++;

            if (vowel >= 1 && consonant >= 2 && cnt == L - 1) {
                sb2.append(sb1).append(ans[length]).append('\n');
            }
            sb1 = new StringBuffer();
            return;
        }

        for (int i = idx; i < C; i++) {
            if (!visit[i]) {
                visit[i] = true;
                ans[depth] = arr[i];
                min(i + 1, depth + 1);
                visit[i] = false;
            }
        }
    }

    private static boolean vowelCheck(int length) {
        return ans[length] == 'a' || ans[length] == 'e' || ans[length] == 'i' || ans[length] == 'o' || ans[length] == 'u';
    }
}
