package util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.stream.Collectors;

/**
 * WorkBookMaker
 *
 * @author Kimuihyeon
 * @since 2021.06.24
 */
public class WorkBookMaker {

    private WorkBookMakerEnum wb;
    private WorkBookCommentMaker commentMaker;
    private WorkBookPackageMaker packageMaker;

    public WorkBookMaker() {
        wb = new WorkBookMakerEnum();
        commentMaker = new WorkBookCommentMaker();
    }

    public String make(String url) {
        Document doc = getAllElement(url);

        String packageString = packageMaker.getPackage();
        String commentString = commentMaker.getComment(doc);
        String classString = packageMaker.getPackage();


        return null;
    }

    private Document getAllElement(String url) {
        try {
            Document doc = Jsoup.connect(url).get();
            return doc;
        } catch (Exception e) {
            return null;
        }
    }

}
