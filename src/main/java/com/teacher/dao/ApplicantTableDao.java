package com.teacher.dao;

import com.teacher.entity.ApplicantTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (ApplicantTable)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-27 14:59:51
 */
public interface ApplicantTableDao {

    /**
     * 通过ID查询单条数据
     *
     * @param account 主键
     * @return 实例对象
     */
    ApplicantTable queryById(String account);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ApplicantTable> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param applicantTable 实例对象
     * @return 对象列表
     */
    List<ApplicantTable> queryAll(ApplicantTable applicantTable);

    /**
     * 新增数据
     *
     * @param applicantTable 实例对象
     * @return 影响行数
     */
    int insert(ApplicantTable applicantTable);

    /**
     * 修改数据
     *
     * @param applicantTable 实例对象
     * @return 影响行数
     */
    int update(ApplicantTable applicantTable);

    /**
     * 通过主键删除数据
     *
     * @param account 主键
     * @return 影响行数
     */
    int deleteById(String account);

}