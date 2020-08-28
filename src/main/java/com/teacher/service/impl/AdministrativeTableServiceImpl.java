package com.teacher.service.impl;

import com.teacher.entity.AdministrativeTable;
import com.teacher.dao.AdministrativeTableDao;
import com.teacher.service.AdministrativeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AdministrativeTable)表服务实现类
 *
 * @author makejava
 * @since 2020-08-27 14:59:56
 */
@Service("administrativeTableService")
public class AdministrativeTableServiceImpl implements AdministrativeTableService {
    @Resource
    private AdministrativeTableDao administrativeTableDao;
    @Autowired
    public void setAdministrativeTableDao(AdministrativeTableDao administrativeTableDao) {
        this.administrativeTableDao = administrativeTableDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AdministrativeTable queryById(Integer id) {
        return this.administrativeTableDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<AdministrativeTable> queryAllByLimit(int offset, int limit) {
        return this.administrativeTableDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param administrativeTable 实例对象
     * @return 实例对象
     */
    @Override
    public AdministrativeTable insert(AdministrativeTable administrativeTable) {
        this.administrativeTableDao.insert(administrativeTable);
        return administrativeTable;
    }

    /**
     * 修改数据
     *
     * @param administrativeTable 实例对象
     * @return 实例对象
     */
    @Override
    public AdministrativeTable update(AdministrativeTable administrativeTable) {
        this.administrativeTableDao.update(administrativeTable);
        return this.queryById(administrativeTable.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.administrativeTableDao.deleteById(id) > 0;
    }
}