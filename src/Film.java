public class Film {
    private String title;
    private String directorName;
    private boolean isPorno;

    public Film(String title, String directorName, boolean isPorno) {
        this.title = title;
        this.directorName = directorName;
        this.isPorno = isPorno;
    }

    public String getTitle() {
        return title;
    }

    public String getDirectorName() {
        return directorName;
    }

    public boolean isPorno() {
        return isPorno;
    }
}
