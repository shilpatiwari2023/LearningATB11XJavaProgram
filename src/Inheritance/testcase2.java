package Inheritance;

public class testcase2 extends common_to_all{
    void runningTC2(){
       startBrowser();
        System.out.println("Running TC2");
        readExcelFile();
        readDataBaseFile();
        closeBrowser();

    }
}
