package kata4.main;

import kata4.view.MailHistogramBuilder;
import kata4.view.HistogramDisplay;
import kata4.model.Mail;
import kata4.model.Histogram;
import java.util.List;
import kata4.view.MailListReader;

public class Kata4 {
    
    public static Histogram<String> histogram;
    public static List<Mail> mailList;

    public static void main(String[] args) {
        
        execute();
    
    }
    
    public static void input(){
        String fileName = new String("email.txt");
        mailList = MailListReader.read(fileName);
    }
    
    public static void process(){
        histogram = MailHistogramBuilder.build(mailList);
    }
    
    public static void output(){
        new HistogramDisplay(histogram).execute(); 
    }
    
    public static void execute(){
        input();
        process();
        output();
    }
}
