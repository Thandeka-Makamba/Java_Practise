package encapsulation;

/*

Create a class called LibraryBook with the following private attributes:

title (String) — set only once through the constructor.

author (String) — set only once through the constructor.

isBorrowed (boolean) — defaults to false.

✅ Your task:
Provide getters for all attributes.

Provide no setters for title and author.

Create two public methods:

borrowBook() – sets isBorrowed to true. If the book is already borrowed, throw an IllegalStateException with the message "Book is already borrowed".

returnBook() – sets isBorrowed to false. If the book is not borrowed, throw an IllegalStateException with the message "Book was not borrowed".

 */

public class LibraryBook {

    private final String TITLE;
    private final String AUTHOR;
    private boolean isBorrowed;

    LibraryBook(String title, String author) {
        TITLE = title;
        AUTHOR = author;
        isBorrowed = false;
    }

    public String getTitle() {
        return TITLE;
    }

    public String getAuthor() {
        return AUTHOR;
    }

    public boolean isBookBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        if (isBorrowed) {
            throw new IllegalStateException("Book is already borrowed");
        } else {
            isBorrowed = true;
        }
    }

    public void returnBook() {
        if (! isBorrowed) {
            throw new IllegalStateException("Book was not borrowed");
        } else {
            isBorrowed = false;
        }
    }
}
