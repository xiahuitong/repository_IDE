package cn.itcase.domain;

public class saleinfo extends saleinfovo {
    private int sid;
    private int cid;
    private int bid;
    private int nums;
    private String sdate;

    private Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    public String getSdate() {
        return sdate;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate;
    }

    @Override
    public String toString() {
        return "saleinfo{" +
                "sid=" + sid +
                ", cid=" + cid +
                ", bid=" + bid +
                ", nums=" + nums +
                ", sdate='" + sdate + '\'' +
                '}';
    }
}
