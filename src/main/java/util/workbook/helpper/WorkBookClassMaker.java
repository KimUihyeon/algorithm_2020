package util.workbook.helpper;

import org.jsoup.nodes.Document;

/**
 * WorkBookClassMaker
 *
 * @author kuh
 * @since 2021.06.24
 */
public class WorkBookClassMaker {

    private WorkBookMakerEnum wb;

    public WorkBookClassMaker(){
        this.wb = new WorkBookMakerEnum();
    }

    public String getClass(int problemId){
        String className = "Q" + problemId;
        return wb.getClassFormat().replace(wb.CLASS_NAME_SPOT , className);
    }
}
