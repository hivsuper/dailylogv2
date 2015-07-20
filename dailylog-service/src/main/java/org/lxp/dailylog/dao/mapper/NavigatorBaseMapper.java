package org.lxp.dailylog.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lxp.dailylog.model.NavigatorBase;
import org.lxp.dailylog.model.NavigatorBaseExample;

public interface NavigatorBaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table navigator
     *
     * @mbggenerated Tue Jul 21 00:37:26 GMT+08:00 2015
     */
    int countByExample(NavigatorBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table navigator
     *
     * @mbggenerated Tue Jul 21 00:37:26 GMT+08:00 2015
     */
    int deleteByExample(NavigatorBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table navigator
     *
     * @mbggenerated Tue Jul 21 00:37:26 GMT+08:00 2015
     */
    int deleteByPrimaryKey(Long seqid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table navigator
     *
     * @mbggenerated Tue Jul 21 00:37:26 GMT+08:00 2015
     */
    int insert(NavigatorBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table navigator
     *
     * @mbggenerated Tue Jul 21 00:37:26 GMT+08:00 2015
     */
    int insertSelective(NavigatorBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table navigator
     *
     * @mbggenerated Tue Jul 21 00:37:26 GMT+08:00 2015
     */
    List<NavigatorBase> selectByExample(NavigatorBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table navigator
     *
     * @mbggenerated Tue Jul 21 00:37:26 GMT+08:00 2015
     */
    NavigatorBase selectByPrimaryKey(Long seqid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table navigator
     *
     * @mbggenerated Tue Jul 21 00:37:26 GMT+08:00 2015
     */
    int updateByExampleSelective(@Param("record") NavigatorBase record, @Param("example") NavigatorBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table navigator
     *
     * @mbggenerated Tue Jul 21 00:37:26 GMT+08:00 2015
     */
    int updateByExample(@Param("record") NavigatorBase record, @Param("example") NavigatorBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table navigator
     *
     * @mbggenerated Tue Jul 21 00:37:26 GMT+08:00 2015
     */
    int updateByPrimaryKeySelective(NavigatorBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table navigator
     *
     * @mbggenerated Tue Jul 21 00:37:26 GMT+08:00 2015
     */
    int updateByPrimaryKey(NavigatorBase record);
}