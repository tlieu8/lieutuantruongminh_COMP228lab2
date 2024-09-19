import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
         
        Singers singer1 = new Singers();
        
        
        System.out.println("Singer 1 default values:");
        System.out.println("Singer's id: " + singer1.getSingerId());
        System.out.println("Singer's name: " + singer1.getSingerName());
        System.out.println("Singer's address: " + singer1.getSingerAddress());
        System.out.println("Date of birth: " + singer1.getDateOfBirth());
        System.out.println("Albums: " + singer1.getNumberOfAlbumsPublished());
       
        LocalDate dob = LocalDate.of(1989, 12, 13);
        singer1.setSingerDetails(1, "Taylor Swift", "123 Main St", dob, 9);
        
        
        System.out.println("Singer 1 updated values:");
        System.out.println("Singer's id: " + singer1.getSingerId());
        System.out.println("Singer's name: " + singer1.getSingerName());
        System.out.println("Singer's address: " + singer1.getSingerAddress());
        System.out.println("Date of birth: " + singer1.getDateOfBirth());
        System.out.println("Albums: " + singer1.getNumberOfAlbumsPublished());
        
        
        
        dob = LocalDate.of(1994, 3, 1);
        singer1.setSingerId(2);
        singer1.setSingerName("Justin Bieber");
        singer1.setSingerAddress("9301 Wilshire Blvd");
        singer1.setDateOfBirth(dob);
        singer1.setNumberOfAlbumsPublished(10);
        
   
        System.out.println("Singer 1 final values:");
        System.out.println("Singer's id: " + singer1.getSingerId());
        System.out.println("Singer's name: " + singer1.getSingerName());
        System.out.println("Singer's address: " + singer1.getSingerAddress());
        System.out.println("Date of birth: " + singer1.getDateOfBirth());
        System.out.println("Albums: " + singer1.getNumberOfAlbumsPublished());
    }
}
