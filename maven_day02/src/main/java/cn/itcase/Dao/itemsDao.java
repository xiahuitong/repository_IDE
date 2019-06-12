package cn.itcase.Dao;
import cn.itcase.domin.Items;
public interface itemsDao {
    //通过id查询全部信息
    public Items findByid(Integer id);
}
