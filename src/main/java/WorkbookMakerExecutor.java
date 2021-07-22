import util.workbook.WorkBookMaker;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

/**
 * WorkbookMaker
 *
 * @author kuh
 * @since 2021.06.24
 */
public class WorkbookMakerExecutor {

    private final static int id = 7568;

    public static void main(String[] arg) {
        run("https://www.acmicpc.net/problem/" + id);
    }

    public static void run(String url) {
        WorkBookMaker workBookMaker = new WorkBookMaker();
        String makeData = workBookMaker.make(url);

        print(makeData);
        clipBoard(makeData);
    }

    public static void clipBoard(String str){
        StringSelection stringSelection = new StringSelection(str);
        Clipboard cl = Toolkit.getDefaultToolkit().getSystemClipboard();
        cl.setContents(stringSelection, null);

        System.out.println("클립보드에 복사 되었습니다. !");
    }

    public static void print(String str){
        StringBuilder console = new StringBuilder();
        console.append("--------------console-------------");
        console.append(System.lineSeparator());
        console.append(System.lineSeparator());
        console.append(str);
        console.append(System.lineSeparator());
        console.append(System.lineSeparator());
        console.append("---------------------------------");
        console.append(System.lineSeparator());

        System.out.println(console);
    }
}
