package util.workbook.helpper;

import org.jsoup.nodes.Document;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.stream.Collectors;

/**
 * WorkBookCommentMaker
 *
 * @author kuh
 * @since 2021.06.24
 */
public class WorkBookCommentMaker {

    private WorkBookMakerEnum wb;

    public WorkBookCommentMaker() {
        this.wb = new WorkBookMakerEnum();
    }

    public String getComment(Document doc) {
        String url = doc.location();
        int problemID = getProblemId(url);
        String nowDate = nowDate();

        String problemDescription = pTagCommentString(doc, wb.PROBLEM_DESCRIPTION_ID);// 설명

        String inputDescription = pTagCommentString(doc, wb.PROBLEM_INPUT_ID);
        String inputSample = preTagCommentString(doc, wb.SAMPLE_INPUT_ID);
        String inputBundle = commentBundling(inputDescription, inputSample);

        String outputDescription = pTagCommentString(doc, wb.PROBLEM_OUTPUT_ID); // 아웃풋
        String outputSample = preTagCommentString(doc, wb.SAMPLE_OUTPUT_ID);

        String outputBundle = commentBundling(outputDescription, outputSample);

        String commentFormat = wb.getCommentFormat();

        String comment = commentFormat.replace(wb.AUTHOR_SPOT, "kuh")
                .replace(wb.SINCE_SPOT, nowDate)
                .replace(wb.URL_SPOT, url)
                .replace(wb.PROBLEM_ID_SPOT, String.valueOf(problemID))
                .replace(wb.PROBLEM_SPOT, problemDescription)
                .replace(wb.INPUT_SPOT, inputBundle)
                .replace(wb.OUTPUT_SPOT, outputBundle);

        return comment;
    }

    private String preTagCommentString(Document doc, String elementId) {
        return doc.select(elementId).stream().map(t ->
                " * " + t.text().replace("\n", "\n * ")
        ).collect(Collectors.joining());
    }

    private String pTagCommentString(Document doc, String elementId) {
        String commentString = doc.select(elementId)
                .stream().map(t -> " * " + t.text() + "\n").collect(Collectors.joining());
        return commentString.substring(0, commentString.lastIndexOf("\n"));
    }

    private String commentBundling(String comment1, String comment2) {
        return comment1 + "\n" + comment2;
    }

    private int getProblemId(String url) {
        String[] urlPaths = url.split("/");
        return Integer.parseInt(urlPaths[urlPaths.length - 1]);
    }

    private String nowDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        Date date = new Date();
        return sdf.format(date);
    }
}
