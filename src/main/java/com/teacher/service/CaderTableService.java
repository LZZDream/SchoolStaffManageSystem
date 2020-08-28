package com.teacher.service;

import com.teacher.entity.CaderTable;

import java.util.List;

/**
 * (CaderTable)表服务接口
 *
 * @author makejava
 * @since 2020-08-27 14:59:56
 */
public interface CaderTableService {

    /**
     * 通过ID查询单条数据
     *
     * @param staffNumber 主键
     * @return 实例对象
     */
    CaderTable queryById(Integer staffNumber);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<CaderTable> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param caderTable 实例对象
     * @return 实例对象
     */
    CaderTable insert(CaderTable caderTable);

    /**
     * 修改数据
     *
     * @param caderTable 实例对象
     * @return 实例对象
     */
    CaderTable update(CaderTable caderTable);

    /**
     * 通过主键删除数据
     *
     * @param staffNumber 主键
     * @return 是否成功
     */
    boolean deleteById(Integer staffNumber);

}