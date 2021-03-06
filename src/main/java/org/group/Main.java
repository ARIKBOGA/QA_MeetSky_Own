package org.group;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "src/main/resources/data.txt";
        new NumberExtractReport()
                .prepareAndSendReport(path);

        new EmailExtractReport()
                .prepareAndSendReport(path);
    }
}
