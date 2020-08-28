package com.teacher.service.impl;

import com.teacher.entity.SpecialStaff;
import com.teacher.dao.SpecialStaffDao;
import com.teacher.service.SpecialStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SpecialStaff)表服务实现类
 *
 * @author makejava
 * @since 2020-08-27 15:00:06
 */
@Service("specialStaffService")
public class SpecialStaffServiceImpl implements SpecialStaffService {
    @Resource
    private SpecialStaffDao specialStaffDao;
    @Autowired
    public void setSpecialStaffDao(SpecialStaffDao specialStaffDao) {
        this.specialStaffDao = specialStaffDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param staffNumber 主键
     * @return 实例对象
     */
    @Override
    public SpecialStaff queryById(Integer staffNumber) {
        return this.specialStaffDao.queryById(staffNumber);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<SpecialStaff> queryAllByLimit(int offset, int limit) {
        return this.specialStaffDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param specialStaff 实例对象
     * @return 实例对象
     */
    @Override
    public SpecialStaff insert(SpecialStaff specialStaff) {
        this.specialStaffDao.insert(specialStaff);
        return specialStaff;
    }

    /**
     * 修改数据
     *
     * @param specialStaff 实例对象
     * @return 实例对象
     */
    @Override
    public SpecialStaff update(SpecialStaff specialStaff) {
        this.specialStaffDao.update(specialStaff);
        return this.queryById(specialStaff.getStaffNumber());
    }

    /**
     * 通过主键删除数据
     *
     * @param staffNumber 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer staffNumber) {
        return this.specialStaffDao.deleteById(staffNumber) > 0;
    }
}