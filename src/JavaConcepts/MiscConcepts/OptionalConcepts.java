package JavaConcepts.MiscConcepts;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalConcepts {

    public static void main(String[] args) {

        Optional<String> opStr= Optional.ofNullable("harsh");
        String s1=opStr.get();
        String s2=opStr.orElse("test1");
        opStr.equals("harsh");
        opStr.orElseThrow();
        opStr.filter(x->x.equals("harsh"));
        opStr.or(()->Optional.ofNullable("test1"));
        opStr.ifPresent((resp)->{resp.substring(0,1);});
        opStr.isEmpty();
        opStr.flatMap((resp)->{ return Optional.ofNullable(resp.substring(0,1));});
      //  opStr.ifPresentOrElse((resp,x)-> resp.substring(0,1));
        //opStr.stream().filter();
        opStr.map((resp)->{ return resp.substring(0,1);});
       String s3= opStr.orElseGet(()->"test1");
        opStr.orElseThrow();
        opStr.hashCode();


    }
}
