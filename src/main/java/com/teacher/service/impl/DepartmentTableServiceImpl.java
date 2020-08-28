package com.teacher.service.impl;

import com.teacher.entity.DepartmentTable;
import com.teacher.dao.DepartmentTableDao;
import com.teacher.service.DepartmentTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DepartmentTable)表服务实现类
 *
 * @author makejava
 * @since 2020-08-27 15:00:00
 */
@Service("departmentTableService")
public class DepartmentTableServiceImpl implements DepartmentTableService {
    @Resource
    private DepartmentTableDao departmentTableDao;
    @Autowired
    public void setDepartmentTableDao(DepartmentTableDao departmentTableDao) {
        this.departmentTableDao = departmentTableDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DepartmentTable queryById(Integer id) {
        return this.departmentTableDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<DepartmentTable> queryAllByLimit(int offset, int limit) {
        return this.departmentTableDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param departmentTable 实例对象
     * @return 实例对象
     */
    @Override
    public DepartmentTable insert(DepartmentTable departmentTable) {
        this.departmentTableDao.insert(departmentTable);
        return departmentTable;
    }

    /**
     * 修改数据
     *
     * @param departmentTable 实例对象
     * @return 实例对象
     */
    @Override
    public DepartmentTable update(DepartmentTable departmentTable) {
        this.departmentTableDao.update(departmentTable);
        return this.queryById(departmentTable.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.departmentTableDao.deleteById(id) > 0;
    }
}