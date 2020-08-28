package com.teacher.service.impl;

import com.teacher.entity.DeadStaff;
import com.teacher.dao.DeadStaffDao;
import com.teacher.service.DeadStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DeadStaff)表服务实现类
 *
 * @author makejava
 * @since 2020-08-27 14:59:59
 */
@Service("deadStaffService")
public class DeadStaffServiceImpl implements DeadStaffService {
    @Resource
    private DeadStaffDao deadStaffDao;
    @Autowired
    public void setDeadStaffDao(DeadStaffDao deadStaffDao) {
        this.deadStaffDao = deadStaffDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param staffNumber 主键
     * @return 实例对象
     */
    @Override
    public DeadStaff queryById(Integer staffNumber) {
        return this.deadStaffDao.queryById(staffNumber);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<DeadStaff> queryAllByLimit(int offset, int limit) {
        return this.deadStaffDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param deadStaff 实例对象
     * @return 实例对象
     */
    @Override
    public DeadStaff insert(DeadStaff deadStaff) {
        this.deadStaffDao.insert(deadStaff);
        return deadStaff;
    }

    /**
     * 修改数据
     *
     * @param deadStaff 实例对象
     * @return 实例对象
     */
    @Override
    public DeadStaff update(DeadStaff deadStaff) {
        this.deadStaffDao.update(deadStaff);
        return this.queryById(deadStaff.getStaffNumber());
    }

    /**
     * 通过主键删除数据
     *
     * @param staffNumber 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer staffNumber) {
        return this.deadStaffDao.deleteById(staffNumber) > 0;
    }
}