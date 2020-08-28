package com.teacher.service;

import com.teacher.entity.Checking;

import java.util.List;

/**
 * (Checking)表服务接口
 *
 * @author makejava
 * @since 2020-08-27 14:59:58
 */
public interface CheckingService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Checking queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Checking> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param checking 实例对象
     * @return 实例对象
     */
    Checking insert(Checking checking);

    /**
     * 修改数据
     *
     * @param checking 实例对象
     * @return 实例对象
     */
    Checking update(Checking checking);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}