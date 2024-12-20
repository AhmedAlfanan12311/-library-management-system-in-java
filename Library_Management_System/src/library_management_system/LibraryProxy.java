public interface Library {
    void borrowBook(int bookId, int userId);
    void returnBook(int bookId, int userId);
}

class RealLibrary implements Library {
    @Override
    public void borrowBook(int bookId, int userId) {
        System.out.println("Book " + bookId + " borrowed by User " + userId);
    }

    @Override
    public void returnBook(int bookId, int userId) {
        System.out.println("Book " + bookId + " returned by User " + userId);
    }
}

class LibraryProxy implements Library {
    private RealLibrary library = new RealLibrary();
    private boolean isAdmin;

    public LibraryProxy(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public void borrowBook(int bookId, int userId) {
        library.borrowBook(bookId, userId);
    }

    @Override
    public void returnBook(int bookId, int userId) {
        if (isAdmin) {
            library.returnBook(bookId, userId);
        } else {
            System.out.println("Only admins can return books.");
        }
    }
}
