package com.shijian.library.dao;
import com.shijian.library.entity.Log;

import java.util.List;

public interface LogDao {
    public Log findById(String numberId);
    public List<Log> findAllLog();
}
