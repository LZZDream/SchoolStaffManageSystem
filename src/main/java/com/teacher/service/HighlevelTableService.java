package com.teacher.service;

import com.teacher.entity.HighlevelTable;

import java.util.List;

/**
 * (HighlevelTable)表服务接口
 *
 * @author makejava
 * @since 2020-08-27 15:00:00
 */
public interface HighlevelTableService {

    /**
     * 通过ID查询单条数据
     *
     * @param staffNumber 主键
     * @return 实例对象
     */
    HighlevelTable queryById(Integer staffNumber);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<HighlevelTable> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param highlevelTable 实例对象
     * @return 实例对象
     */
    HighlevelTable insert(HighlevelTable highlevelTable);

    /**
     * 修改数据
     *
     * @param highlevelTable 实例对象
     * @return 实例对象
     */
    HighlevelTable update(HighlevelTable highlevelTable);

    /**
     * 通过主键删除数据
     *
     * @param staffNumber 主键
     * @return 是否成功
     */
    boolean deleteById(Integer staffNumber);

}