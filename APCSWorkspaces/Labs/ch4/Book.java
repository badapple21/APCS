public class Book{
    private int numPages;
    private int currentPage;

    public Book(int p){
        numPages = p;
        currentPage = 1;
    }

    public int get_numPages(){
        return numPages;
    }
    public int get_currentPage(){
        return currentPage;
    }

    public void next_page(){
        if(currentPage<numPages){
            currentPage+=1;
        }
    }
}
