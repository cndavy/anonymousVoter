package pers.adlered.voter.service;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import pers.adlered.voter.domain.Vote1;
import pers.adlered.voter.domain.Vote1Example;

import java.util.List;

public interface Vote1Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Voter_Vote
     *
     * @mbg.generated
     */
    @SelectProvider(type=Vote1SqlProvider.class, method="countByExample")
    long countByExample(Vote1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Voter_Vote
     *
     * @mbg.generated
     */
    @DeleteProvider(type=Vote1SqlProvider.class, method="deleteByExample")
    int deleteByExample(Vote1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Voter_Vote
     *
     * @mbg.generated
     */
    @Insert({
        "insert into Voter_Vote (Title, Describe, ",
        "Selection, Type, ",
        "Limit, Pass)",
        "values (#{title,jdbcType=VARCHAR}, #{describe,jdbcType=VARCHAR}, ",
        "#{selection,jdbcType=VARCHAR}, #{type,jdbcType=INTEGER}, ",
        "#{limit,jdbcType=INTEGER}, #{pass,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="vid", before=false, resultType=Integer.class)
    int insert(Vote1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Voter_Vote
     *
     * @mbg.generated
     */
    @InsertProvider(type=Vote1SqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="vid", before=false, resultType=Integer.class)
    int insertSelective(Vote1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Voter_Vote
     *
     * @mbg.generated
     */
    @SelectProvider(type=Vote1SqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="VID", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="Title", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="Describe", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="Selection", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="Type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="Limit", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="Pass", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<Vote1> selectByExample(Vote1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Voter_Vote
     *
     * @mbg.generated
     */
    @UpdateProvider(type=Vote1SqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Vote1 record, @Param("example") Vote1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Voter_Vote
     *
     * @mbg.generated
     */
    @UpdateProvider(type=Vote1SqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Vote1 record, @Param("example") Vote1Example example);
}