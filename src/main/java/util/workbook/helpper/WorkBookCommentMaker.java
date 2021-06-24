package util;

import org.jsoup.nodes.Document;

import java.util.stream.Collectors;

/**
 * WorkBookCommentMaker
 *
 * @author Kimuihyeon
 * @since 2021.06.24
 */
public class WorkBookCommentMaker {

    private WorkBookMakerEnum wb;

    public WorkBookCommentMaker(){
        this.wb = new WorkBookMakerEnum();
    }

    public String getComment(Document doc) {
        String problemDescription = pTagCommentString(doc, wb.PROBLEM_DESCRIPTION_ID);// 설명

        String inputDescription = pTagCommentString(doc, wb.PROBLEM_INPUT_ID);
        String inputSample = preTagCommentString(doc, wb.SAMPLE_INPUT_ID);
        String inputBundle = commentBundling(inputDescription, inputSample);

        String outputDescription = pTagCommentString(doc, wb.PROBLEM_OUTPUT_ID); // 아웃풋
        String outputSample = doc.select(wb.SAMPLE_OUTPUT_ID).text(); // 아웃풋

        String outputBundle = commentBundling(outputDescription, outputSample);

        String commentFormat = wb.getCommentFormat();

        String comment = commentFormat.replace(wb.AUTHOR_SPOT, "")
                .replace(wb.SINCE_SPOT, "")
                .replace(wb.URL_SPOT, "")
                .replace(wb.PROBLEM_SPOT, problemDescription)
                .replace(wb.INPUT_SPOT, inputBundle)
                .replace(wb.OUTPUT_SPOT, outputBundle);

        return comment;
    }

    private String preTagCommentString(Document doc, String elementId) {
        return doc.select(elementId).stream().map(t ->
                " * " + t.text().replace("\n", "\n * ") + "\n"
        ).collect(Collectors.joining());
    }

    private String pTagCommentString(Document doc, String elementId) {
        return doc.select(elementId)
                .stream().map(t -> " * " + t.text() + "\n").collect(Collectors.joining());
    }

    private String commentBundling(String comment1, String comment2) {
        return comment1 + "\n" + comment2;
    }
}
