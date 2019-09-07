public class Learn {
    private String bookName;

    public Learn(String aBook){
        this.bookName = aBook;
    }

    public String getName(){
        return this.bookName;
    }

    public void setName(String newBook){
        if(newBook.equals("apple")){
            throw new RuntimeException("Apple can't be used");
        }else {
            this.bookName = newBook;
        }
    }
}
