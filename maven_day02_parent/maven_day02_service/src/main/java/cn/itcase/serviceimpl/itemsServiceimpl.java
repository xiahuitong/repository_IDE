package cn.itcase.serviceimpl;
import cn.itcase.dao.itemsDao;
import cn.itcase.domain.Items;
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
