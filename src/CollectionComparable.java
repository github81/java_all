import java.util.*;

class Author implements Comparable<Author> {

    String firstName;
    String lastName;
    String bookName;
    Author(String first, String last, String book){
        this.firstName = first;
        this.lastName = last;
        this.bookName = book;
    }

    @Override
    public int compareTo(Author au) {

        int last = this.lastName.compareTo(au.lastName);
        return last == 0 ? this.firstName.compareTo(au.firstName) : last;
    }
}

public class CollectionComparable {


    public static void main(String args[]) {

        ArrayList<Author> al = new ArrayList<Author>();

        al.add(new Author("Henry","Miller", "Tropic of Cancer"));
        al.add(new Author("Nalo","Hopkinson", "Brown Girl in the Ring"));
        al.add(new Author("Frank","Miller", "300"));
        al.add(new Author("Deborah","Hopkinson", "Sky Boys"));
        al.add(new Author("George R. R.","Martin", "Song of Ice and Fire"));

        Collections.sort(al);
        for(Author au: al) {
            System.out.println(au.firstName + " " + au.lastName + ", " + au.bookName);
        }

    }
}
