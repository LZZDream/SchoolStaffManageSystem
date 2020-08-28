package com.teacher.dao;

import com.teacher.entity.AdministrativeTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (AdministrativeTable)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-27 14:59:56
 */
public interface AdministrativeTableDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AdministrativeTable queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<AdministrativeTable> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param administrativeTable 实例对象
     * @return 对象列表
     */
    List<AdministrativeTable> queryAll(AdministrativeTable administrativeTable);

    /**
     * 新增数据
     *
     * @param administrativeTable 实例对象
     * @return 影响行数
     */
    int insert(AdministrativeTable administrativeTable);

    /**
     * 修改数据
     *
     * @param administrativeTable 实例对象
     * @return 影响行数
     */
    int update(AdministrativeTable administrativeTable);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}