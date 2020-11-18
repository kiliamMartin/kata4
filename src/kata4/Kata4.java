package kata4;

import java.util.List;


public class Kata4 {
    public static void main(String[] args) {
        String fileName = new String("email.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        
        HistogramDisplay histo = new HistogramDisplay("HISTOGRAM",histogram);
        histo.execute();
    }
    
}
