import util.WorkBookMaker;

/**
 * WorkbookMaker
 *
 * @author Kimuihyeon
 * @since 2021.06.24
 */
public class WorkbookMakerExecutor {
    public static void main(String[] arg){
        String url = "https://www.acmicpc.net/problem/2869";

        run(url);
    }

    public static void run(String url){
        WorkBookMaker workBookMaker = new WorkBookMaker();
        workBookMaker.make(url);
    }
}
