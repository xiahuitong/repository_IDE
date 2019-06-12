package cn.itcase.domain;


public class Book extends BookVo {
    private Integer id;
    private String bookname;
    private String author;
    private String company;
    private Double price;
    private Integer kind_id;


    public Integer getId() {

        return id;
    }



    public void setId(Integer id) {

        this.id = id;
    }



    public String getBookname() {

        return bookname;
    }



    public void setBookname(String bookName) {

        this.bookname = bookName;
    }



    public Integer getKind_id() {

        return kind_id;
    }



    public void setKind_id(Integer kind_id) {

        this.kind_id = kind_id;
    }



    public String getAuthor() {

        return author;
    }



    public void setAuthor(String author) {

        this.author = author;
    }


    public String getCompany() {

        return company;
    }

    public void setCompany(String company) {

        this.company = company;
    }



    public Double getPrice() {

        return price;
    }



    public void setPrice(Double price) {

        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                ", kind_id=" + kind_id +
                '}';
    }
}
