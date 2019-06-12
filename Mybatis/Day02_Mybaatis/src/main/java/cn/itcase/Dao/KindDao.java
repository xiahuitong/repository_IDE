package cn.itcase.Dao;


import cn.itcase.domain.Kind;

import java.util.List;

public interface KindDao {
//    多对一多表查询    写在主表xml中
        List<Kind> findcase2();
}
