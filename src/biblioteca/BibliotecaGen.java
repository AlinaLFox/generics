package biblioteca;
import java.util.*;

// T - tipul de date (cum scriam String, int ...)
public class BibliotecaGen<M> {

   List<M> media = new ArrayList<>();

   public void stocare (M element) {
       media.add(element);
   }

   public void preluare() {
       for(int i = 0; i < media.size(); i++) {
           M element = media.get(i);
           System.out.println(element);
       }
   }
}
