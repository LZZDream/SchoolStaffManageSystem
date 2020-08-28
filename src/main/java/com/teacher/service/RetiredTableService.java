package com.teacher.service;

import com.teacher.entity.RetiredTable;

import java.util.List;

/**
 * (RetiredTable)表服务接口
 *
 * @author makejava
 * @since 2020-08-27 15:00:05
 */
public interface RetiredTableService {

    /**
     * 通过ID查询单条数据
     *
     * @param staffNumber 主键
     * @return 实例对象
     */
    RetiredTable queryById(Integer staffNumber);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<RetiredTable> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param retiredTable 实例对象
     * @return 实例对象
     */
    RetiredTable insert(RetiredTable retiredTable);

    /**
     * 修改数据
     *
     * @param retiredTable 实例对象
     * @return 实例对象
     */
    RetiredTable update(RetiredTable retiredTable);

    /**
     * 通过主键删除数据
     *
     * @param staffNumber 主键
     * @return 是否成功
     */
    boolean deleteById(Integer staffNumber);

}