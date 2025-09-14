package org.example;
public class Book {
    private String title;
    private BookStatus status = BookStatus.AVAILABLE ;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


    public BookStatus getStatus() {
        return status;
    }

    public void toggleStatus() {
        this.status = this.status == BookStatus.AVAILABLE
                ? BookStatus.BORROWED : BookStatus.AVAILABLE;
    }
}
