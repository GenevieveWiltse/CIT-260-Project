
public class HardCopy extends Books {
    private int pages;
    
    public HardCopy() {

    }

    public HardCopy(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    // select pages

    public bookPages(){

    }

    // select fiction/non fiction
    public hardCopyFiction(){

    }
    // output in display recommended books with pages and synopsis.
    @Override
    public String toString() {
        return super.toString();
    }
}