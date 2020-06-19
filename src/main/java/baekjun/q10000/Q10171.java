package baekjun.q10000;

/**
 * 백준 알고리즘 10171
 *
 * @author kuh
 * @since 2020.06.17
 *
 * @Q
 * 아래 예제와 같이 고양이를 출력하시오.
 *
 * @input
 * 없음.
 *
 * @output
 * 고양이를 출력한다.
 */
public class Q10171 {
    public static void main(String []arg){
        StringBuilder cat = new StringBuilder();
        cat.append("\\    /\\");
        cat.append(System.lineSeparator());
        cat.append(" )  ( ')");
        cat.append(System.lineSeparator());
        cat.append("(  /  )");
        cat.append(System.lineSeparator());
        cat.append(" \\(__)|");

        System.out.println(cat.toString());
    }
}
