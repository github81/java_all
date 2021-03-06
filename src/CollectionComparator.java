import java.util.*;

class Author2 implements Comparable<Author2> {

    String firstName;
    String bookName;
    int auAge;
    Author2(String first, String book, int age){
        this.firstName = first;
        this.bookName = book;
        this.auAge = age;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public int getAuAge() {
        return auAge;
    }
    public void setAuAge(int auAge) {
        this.auAge = auAge;
    }

    @Override
    public int compareTo(Author2 au) {
        return this.firstName.compareTo(au.firstName);
    }
}

class AuthorAgeComparator implements Comparator<Author2> {
    public int compare(Author2 a1, Author2 a2) {
        if (a1.auAge == a2.auAge) {
            return 0;
        } else if(a1.auAge > a2.auAge) {
            return -1;
        } else {
            return 1;
        }
    }
}

class BookNameComparator implements Comparator<Author2> {

    public int compare(Author2 a1, Author2 a2) {
        return a1.bookName.compareTo(a2.bookName);
    }
}

public class CollectionComparator {

    public static void main(String args[]) {

        ArrayList<Author2> al=new ArrayList<Author2>();
        al.add(new Author2("Henry", "Tropic of Cancer",  45));
        al.add(new Author2("Nalo", "Brown Girl in the Ring", 56));
        al.add(new Author2("Frank", "300", 65));
        al.add(new Author2("Deborah", "Sky Boys", 51));
        al.add(new Author2("George R. R.", "A Song of Ice and Fire", 62));

        System.out.println("Sorting by Author First Name:");
        Collections.sort(al);
        for(Author2 au: al){
            System.out.println(au.getFirstName()+", "+au.getBookName()+", "+
                    au.getAuAge());
        }

         /*Sorting using AuthorAgeComparator*/
        System.out.println("Sorting by Author Age:");
        Collections.sort(al, new AuthorAgeComparator());
        for(Author2 au: al){
            System.out.println(au.getFirstName()+", "+au.getBookName()+", "+
                    au.getAuAge());

        }

        /*Sorting using BookNameComparator*/
        System.out.println("Sorting by Book Name:");
        Collections.sort(al, new BookNameComparator());
        for(Author2 au: al){
            System.out.println(au.getFirstName()+", "+au.getBookName()+", "+
                    au.getAuAge());
        }
    }
}
