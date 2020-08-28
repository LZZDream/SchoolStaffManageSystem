package com.teacher.service.impl;

import com.teacher.entity.CaderTable;
import com.teacher.dao.CaderTableDao;
import com.teacher.service.CaderTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CaderTable)表服务实现类
 *
 * @author makejava
 * @since 2020-08-27 14:59:56
 */
@Service("caderTableService")
public class CaderTableServiceImpl implements CaderTableService {
    @Resource
    private CaderTableDao caderTableDao;
    @Autowired
    public void setCaderTableDao(CaderTableDao caderTableDao) {
        this.caderTableDao = caderTableDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param staffNumber 主键
     * @return 实例对象
     */
    @Override
    public CaderTable queryById(Integer staffNumber) {
        return this.caderTableDao.queryById(staffNumber);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<CaderTable> queryAllByLimit(int offset, int limit) {
        return this.caderTableDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param caderTable 实例对象
     * @return 实例对象
     */
    @Override
    public CaderTable insert(CaderTable caderTable) {
        this.caderTableDao.insert(caderTable);
        return caderTable;
    }

    /**
     * 修改数据
     *
     * @param caderTable 实例对象
     * @return 实例对象
     */
    @Override
    public CaderTable update(CaderTable caderTable) {
        this.caderTableDao.update(caderTable);
        return this.queryById(caderTable.getStaffNumber());
    }

    /**
     * 通过主键删除数据
     *
     * @param staffNumber 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer staffNumber) {
        return this.caderTableDao.deleteById(staffNumber) > 0;
    }
}