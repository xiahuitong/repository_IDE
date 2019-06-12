package cn.itcase.domain;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Account {
    private String[] mystr;
    private List<String> mylist;
    private Map<String,String>  Mymap;
    private Set<String>  myset;
    private Properties mypro;


    public String[] getMystr() {
        return mystr;
    }

    public void setMystr(String[] mystr) {
        this.mystr = mystr;
    }

    public List<String> getMylist() {
        return mylist;
    }

    public void setMylist(List<String> mylist) {
        this.mylist = mylist;
    }

    public Map<String, String> getMymap() {
        return Mymap;
    }

    public void setMymap(Map<String, String> mymap) {
        Mymap = mymap;
    }

    public Set<String> getMyset() {
        return myset;
    }

    public void setMyset(Set<String> myset) {
        this.myset = myset;
    }

    public Properties getMypro() {
        return mypro;
    }

    public void setMypro(Properties mypro) {
        this.mypro = mypro;
    }


}
