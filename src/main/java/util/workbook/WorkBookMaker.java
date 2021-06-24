package util.workbook;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import util.workbook.helpper.WorkBookClassMaker;
import util.workbook.helpper.WorkBookCommentMaker;
import util.workbook.helpper.WorkBookMakerEnum;
import util.workbook.helpper.WorkBookPackageMaker;

/**
 * WorkBookMaker
 *
 * @author kuh
 * @since 2021.06.24
 */
public class WorkBookMaker {

    private WorkBookCommentMaker commentMaker;
    private WorkBookPackageMaker packageMaker;
    private WorkBookClassMaker classMaker;

    public WorkBookMaker() {
        this.commentMaker = new WorkBookCommentMaker();
        this.packageMaker = new WorkBookPackageMaker();
        this.classMaker = new WorkBookClassMaker();
    }

    private int getProblemId(String url){
        String[] urlPaths = url.split("/");
        return Integer.parseInt(urlPaths[urlPaths.length-1]);
    }

    public String make(String url) {
        int problemId = getProblemId(url);
        Document doc = getAllElement(url);

        String packageString = this.packageMaker.getPackage(problemId);
        String commentString = this.commentMaker.getComment(doc);
        String classString = this.classMaker.getClass(problemId);

        StringBuilder completeString = new StringBuilder();
        completeString.append(packageString);
        completeString.append(System.lineSeparator());
        completeString.append(commentString);
        completeString.append(System.lineSeparator());
        completeString.append(classString);



        return completeString.toString();
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
