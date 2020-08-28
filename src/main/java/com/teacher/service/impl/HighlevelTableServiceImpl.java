package com.teacher.service.impl;

import com.teacher.entity.HighlevelTable;
import com.teacher.dao.HighlevelTableDao;
import com.teacher.service.HighlevelTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (HighlevelTable)表服务实现类
 *
 * @author makejava
 * @since 2020-08-27 15:00:00
 */
@Service("highlevelTableService")
public class HighlevelTableServiceImpl implements HighlevelTableService {
    @Resource
    private HighlevelTableDao highlevelTableDao;
    @Autowired
    public void setHighlevelTableDao(HighlevelTableDao highlevelTableDao) {
        this.highlevelTableDao = highlevelTableDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param staffNumber 主键
     * @return 实例对象
     */
    @Override
    public HighlevelTable queryById(Integer staffNumber) {
        return this.highlevelTableDao.queryById(staffNumber);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<HighlevelTable> queryAllByLimit(int offset, int limit) {
        return this.highlevelTableDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param highlevelTable 实例对象
     * @return 实例对象
     */
    @Override
    public HighlevelTable insert(HighlevelTable highlevelTable) {
        this.highlevelTableDao.insert(highlevelTable);
        return highlevelTable;
    }

    /**
     * 修改数据
     *
     * @param highlevelTable 实例对象
     * @return 实例对象
     */
    @Override
    public HighlevelTable update(HighlevelTable highlevelTable) {
        this.highlevelTableDao.update(highlevelTable);
        return this.queryById(highlevelTable.getStaffNumber());
    }

    /**
     * 通过主键删除数据
     *
     * @param staffNumber 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer staffNumber) {
        return this.highlevelTableDao.deleteById(staffNumber) > 0;
    }
}