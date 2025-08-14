public class Library {
    private Book[] books;
    private int bookCount;  // Why do we need this?
    
    public Library(int capacity) {
        // Initialize array and counter
    }
    public Book searchByTitle(String title) {
    // Loop through books (only up to bookCount!)
    // Return book if found, null if not
}
public boolean addBook(Book book) {
    // Check if there's space
    // Check book is not null
    // Add at position bookCount
    // Increment bookCount
    // Return true/false

}
public boolean removeBook(String isbn) {
    // Find the book
    // Shift all books after it to the left (no gaps!)
    // Decrement bookCount
    // Return true/false
}
for (int i = position; i < bookCount - 1; i++) {
    books[i] = books[i + 1];
}
public void displayAllBooks() {
    // Show count: "Library has X of Y books"
    // Print each book (only up to bookCount)
    // Handle empty library case
}

}