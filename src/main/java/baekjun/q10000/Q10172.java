package baekjun.q10000;

/**
 * 백준 알고리즘 10172
 *
 * @author Kimuihyeon
 * @since 2020.06.17
 *
 * @Q
 * 아래 예제와 같이 개를 출력하시오.
 * |\_/|
 * |q p|   /}
 * ( 0 )"""\
 * |"^"`    |
 * ||_/=\\__|
 *
 * @input
 * 없음
 *
 * @output
 * 개를 출력한다.
 *
 */
public class Q10172 {
    public static void main(String[] arg) {
        StringBuilder dog = new StringBuilder();
        dog.append("|\\_/|");
        dog.append(System.lineSeparator());
        dog.append("|q p|   /}");
        dog.append(System.lineSeparator());
        dog.append("( 0 )\"\"\"\\");
        dog.append(System.lineSeparator());
        dog.append("|\"^\"`    |");
        dog.append(System.lineSeparator());
        dog.append("||_/=\\\\__|");

        System.out.println(dog.toString());
    }
}
