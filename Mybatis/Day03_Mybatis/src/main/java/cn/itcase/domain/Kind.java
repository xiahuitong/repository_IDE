package cn.itcase.domain;


import java.util.List;

public class Kind {
    private  int kid;
    private String kname;

    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getKid() {
        return kid;
    }

    public void setKid(int kid) {
        this.kid = kid;
    }

    public String getKname() {
        return kname;
    }

    public void setKname(String kname) {
        this.kname = kname;
    }

    @Override
    public String toString() {
        return "Kind{" +
                "kid=" + kid +
                ", kname='" + kname + '\'' +
                '}';
    }
}
