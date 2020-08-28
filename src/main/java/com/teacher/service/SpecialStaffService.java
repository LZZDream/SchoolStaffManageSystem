package com.teacher.service;

import com.teacher.entity.SpecialStaff;

import java.util.List;

/**
 * (SpecialStaff)表服务接口
 *
 * @author makejava
 * @since 2020-08-27 15:00:06
 */
public interface SpecialStaffService {

    /**
     * 通过ID查询单条数据
     *
     * @param staffNumber 主键
     * @return 实例对象
     */
    SpecialStaff queryById(Integer staffNumber);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SpecialStaff> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param specialStaff 实例对象
     * @return 实例对象
     */
    SpecialStaff insert(SpecialStaff specialStaff);

    /**
     * 修改数据
     *
     * @param specialStaff 实例对象
     * @return 实例对象
     */
    SpecialStaff update(SpecialStaff specialStaff);

    /**
     * 通过主键删除数据
     *
     * @param staffNumber 主键
     * @return 是否成功
     */
    boolean deleteById(Integer staffNumber);

}