package com.teacher.service;

import com.teacher.entity.CheckTable;

import java.util.List;

/**
 * (CheckTable)表服务接口
 *
 * @author makejava
 * @since 2020-08-27 14:59:57
 */
public interface CheckTableService {

    /**
     * 通过ID查询单条数据
     *
     * @param staffNumber 主键
     * @return 实例对象
     */
    CheckTable queryById(Integer staffNumber);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<CheckTable> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param checkTable 实例对象
     * @return 实例对象
     */
    CheckTable insert(CheckTable checkTable);

    /**
     * 修改数据
     *
     * @param checkTable 实例对象
     * @return 实例对象
     */
    CheckTable update(CheckTable checkTable);

    /**
     * 通过主键删除数据
     *
     * @param staffNumber 主键
     * @return 是否成功
     */
    boolean deleteById(Integer staffNumber);

}