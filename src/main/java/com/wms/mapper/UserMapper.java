package com.wms.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import  com.wms.entity.User;
import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User>{
    public List<User> selectAll();

}
