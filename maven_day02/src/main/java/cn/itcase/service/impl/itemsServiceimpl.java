package cn.itcase.service.impl;
import cn.itcase.Dao.itemsDao;
import cn.itcase.domin.Items;
import cn.itcase.service.ItemsSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class itemsServiceimpl implements ItemsSerice {
    @Autowired
    private itemsDao itemsDao;
    public Items findByid(Integer id) {
        return itemsDao.findByid(id);
    }
}
