    public abstract class Book {
    protected String title;
    protected String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract void displayInfo();
}

class SoftwareEngineeringBook extends Book {
    public SoftwareEngineeringBook(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayInfo() {
        System.out.println("Software Engineering Book: " + title + " by " + author);
    }
}

class ManagementBook extends Book {
    public ManagementBook(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayInfo() {
        System.out.println("Management Book: " + title + " by " + author);
    }
}

class BookFactory {
    public static Book createBook(String category, String title, String author) {
        switch (category) {
            case "SoftwareEngineering":
                return new SoftwareEngineeringBook(title, author);
            case "Management":
                return new ManagementBook(title, author);
            default:
                throw new IllegalArgumentException("Unknown category: " + category);
        }
    }
}
