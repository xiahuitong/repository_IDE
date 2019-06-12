package cn.itcase.dao;
import cn.itcase.domain.Items;

public interface itemsDao {
    //通过id查询全部信息
    public Items findByid(Integer id);
}
