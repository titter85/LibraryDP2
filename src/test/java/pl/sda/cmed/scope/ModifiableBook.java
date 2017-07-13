package pl.sda.cmed.scope;

public class ModifiableBook {
    public String title;
    public String author;

    public ModifiableBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "ModifiableBook{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
