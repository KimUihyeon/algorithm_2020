package util;

/**
 * WorkBokkMakerEnum
 *
 * @author Kimuihyeon
 * @since 2021.06.24
 */
public class WorkBookMakerEnum {

    // Element ID
    public final String TITLE_ID = "#problem_title"; // 문제아이디
    public final String PROBLEM_DESCRIPTION_ID = "#problem_description p"; // 문제 설명
    public final String PROBLEM_INPUT_ID = "#problem_input p";  // 입력
    public final String SAMPLE_INPUT_ID = "#sample-input-1";  // 입력

    public final String PROBLEM_OUTPUT_ID = "#problem_input p"; // 출력
    public final String SAMPLE_OUTPUT_ID = "#sample-output-1";  // 출력



    // 치환문자열
    public final String PROBLEM_ID_SPOT = "[@problem_id]";
    public final String URL_SPOT = "[@url]";
    public final String AUTHOR_SPOT = "[@author]";
    public final String SINCE_SPOT = "[@since]";
    public final String PROBLEM_SPOT = "[@q]";
    public final String INPUT_SPOT = "[@input]";
    public final String OUTPUT_SPOT = "[@output]";

    public String getCommentFormat() {
        return "/**\n" +
                " * 백준 알고리즘 " + PROBLEM_ID_SPOT + "\n" +
                " * url -> " + URL_SPOT + "\n" +
                " *\n" +
                " * @author " + AUTHOR_SPOT + "\n" +
                " * @since " + SINCE_SPOT + "\n" +
                " *\n" +
                " * @Q\n" +
                PROBLEM_SPOT + "\n" +
                " *\n" +
                " * @input\n" +
                INPUT_SPOT + "\n" +
                " *\n" +
                " * @output\n" +
                OUTPUT_SPOT + "\n" +
                " *\n" +
                " */";
    }
}
