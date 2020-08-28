package com.teacher.service.impl;

import com.teacher.entity.RecruitmentPlanTable;
import com.teacher.entity.RetiredTable;
import com.teacher.dao.RetiredTableDao;
import com.teacher.service.RetiredTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (RetiredTable)表服务实现类
 *
 * @author makejava
 * @since 2020-08-27 15:00:05
 */
@Service("retiredTableService")
public class RetiredTableServiceImpl implements RetiredTableService {
    @Resource
    private RetiredTableDao retiredTableDao;
    @Autowired
    public void setRetiredTableDao(RetiredTableDao retiredTableDao) {
        this.retiredTableDao = retiredTableDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param staffNumber 主键
     * @return 实例对象
     */
    @Override
    public RetiredTable queryById(Integer staffNumber) {
        return this.retiredTableDao.queryById(staffNumber);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<RetiredTable> queryAllByLimit(int offset, int limit) {
        return this.retiredTableDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param retiredTable 实例对象
     * @return 实例对象
     */
    @Override
    public RetiredTable insert(RetiredTable retiredTable) {
        this.retiredTableDao.insert(retiredTable);
        return retiredTable;
    }

    /**
     * 修改数据
     *
     * @param retiredTable 实例对象
     * @return 实例对象
     */
    @Override
    public RetiredTable update(RetiredTable retiredTable) {
        this.retiredTableDao.update(retiredTable);
        return this.queryById(retiredTable.getStaffNumber());
    }

    /**
     * 通过主键删除数据
     *
     * @param staffNumber 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer staffNumber) {
        return this.retiredTableDao.deleteById(staffNumber) > 0;
    }




}