package printing;

/**
 * Created by Suliky on 26.3.2015.
 */
public class PaperTray {

    int pages = 0;

    public void addPaper(int count) {
        pages += count;
    }

    public void usePage() {
        pages--;
    }

    public boolean isEmpty() {
        return pages == 0;
    }

}
