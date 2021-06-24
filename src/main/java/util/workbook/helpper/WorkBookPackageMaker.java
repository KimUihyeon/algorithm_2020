package util.workbook.helpper;

/**
 * WorkBookPackageMaker
 *
 * @author kuh
 * @since 2021.06.24
 */
public class WorkBookPackageMaker {

    private final String IMPORT_IO = "import java.io.*;";

    public String getPackage(int problemID){
        StringBuilder packageBundle = new StringBuilder(baekjoonPackage(problemID));
        packageBundle.append(System.lineSeparator());
        packageBundle.append(System.lineSeparator());
        packageBundle.append(IMPORT_IO);
        packageBundle.append(System.lineSeparator());
        return packageBundle.toString();
    }

    private String baekjoonPackage(int problemID){
        String packageName = (problemID/1000) + "000";
        return "package baekjoon.q" +packageName+ ";";
    };

}
