package com.teacher.dao;

import com.teacher.entity.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Teacher)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-27 15:00:07
 */
public interface TeacherDao {

    /**
     * 通过ID查询单条数据
     *
     * @param staffNumber 主键
     * @return 实例对象
     */
    Teacher queryById(Integer staffNumber);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Teacher> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param teacher 实例对象
     * @return 对象列表
     */
    List<Teacher> queryAll(Teacher teacher);

    /**
     * 新增数据
     *
     * @param teacher 实例对象
     * @return 影响行数
     */
    int insert(Teacher teacher);

    /**
     * 修改数据
     *
     * @param teacher 实例对象
     * @return 影响行数
     */
    int update(Teacher teacher);

    /**
     * 通过主键删除数据
     *
     * @param staffNumber 主键
     * @return 影响行数
     */
    int deleteById(Integer staffNumber);

    /**
     * 查询所有兼职人员数据
     *
     * @param post 岗位
     * @return 对象列表
     */
    List<Teacher> queryParttime(@Param("post") int post);

    /**
     * 查询所有临时聘用人员数据
     *
     * @param post 岗位
     * @return 对象列表
     */
    List<Teacher> queryFloater(@Param("post") int post);

    /**
     * 查询所有学者数据
     *
     * @param post 岗位
     * @return 对象列表
     */
    List<Teacher> queryBookMan(@Param("post") int post);

    /**
     * 查询所有返聘人员数据
     *
     * @param post 岗位
     * @return 对象列表
     */
    List<Teacher> queryReEmploy(@Param("post") int post);

    /**
     * 查询所有挂职人员数据
     *
     * @param post 岗位
     * @return 对象列表
     */
    List<Teacher> queryTemp(@Param("post") int post);

}