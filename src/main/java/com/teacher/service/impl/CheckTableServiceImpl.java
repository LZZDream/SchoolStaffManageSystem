package com.teacher.service.impl;

import com.teacher.entity.CheckTable;
import com.teacher.dao.CheckTableDao;
import com.teacher.service.CheckTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CheckTable)表服务实现类
 *
 * @author makejava
 * @since 2020-08-27 14:59:57
 */
@Service("checkTableService")
public class CheckTableServiceImpl implements CheckTableService {
    @Resource
    private CheckTableDao checkTableDao;
    @Autowired
    public void setCheckTableDao(CheckTableDao checkTableDao) {
        this.checkTableDao = checkTableDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param staffNumber 主键
     * @return 实例对象
     */
    @Override
    public CheckTable queryById(Integer staffNumber) {
        return this.checkTableDao.queryById(staffNumber);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<CheckTable> queryAllByLimit(int offset, int limit) {
        return this.checkTableDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param checkTable 实例对象
     * @return 实例对象
     */
    @Override
    public CheckTable insert(CheckTable checkTable) {
        this.checkTableDao.insert(checkTable);
        return checkTable;
    }

    /**
     * 修改数据
     *
     * @param checkTable 实例对象
     * @return 实例对象
     */
    @Override
    public CheckTable update(CheckTable checkTable) {
        this.checkTableDao.update(checkTable);
        return this.queryById(checkTable.getStaffNumber());
    }

    /**
     * 通过主键删除数据
     *
     * @param staffNumber 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer staffNumber) {
        return this.checkTableDao.deleteById(staffNumber) > 0;
    }
}