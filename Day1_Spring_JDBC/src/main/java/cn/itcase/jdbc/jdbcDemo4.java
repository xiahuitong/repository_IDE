package cn.itcase.jdbc;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class jdbcDemo4 {
    private List list;
    private Map map;
    private Set set;
    private Object[] obj;
    private Properties prop;

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Object[] getObj() {
        return obj;
    }

    public void setObj(Object[] obj) {
        this.obj = obj;
    }

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }
}
