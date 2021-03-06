package pers.adlered.voter.service;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Service;
import pers.adlered.voter.domain.VoteDetail;
import pers.adlered.voter.domain.VoteDetailExample;

import java.util.List;
@Service
public interface VoteDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Voter_Vote_Detail
     *
     * @mbg.generated
     */
    @SelectProvider(type=VoteDetailSqlProvider.class, method="countByExample")
    long countByExample(VoteDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Voter_Vote_Detail
     *
     * @mbg.generated
     */
    @DeleteProvider(type=VoteDetailSqlProvider.class, method="deleteByExample")
    int deleteByExample(VoteDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Voter_Vote_Detail
     *
     * @mbg.generated
     */
    @Delete({
        "delete from Voter_Vote_Detail",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Voter_Vote_Detail
     *
     * @mbg.generated
     */
    @Insert({
        "insert into Voter_Vote_Detail (VID, Detail, ",
        "Sno)",
        "values (#{vid,jdbcType=INTEGER}, #{detail,jdbcType=VARCHAR}, ",
        "#{sno,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(VoteDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Voter_Vote_Detail
     *
     * @mbg.generated
     */
    @InsertProvider(type=VoteDetailSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(VoteDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Voter_Vote_Detail
     *
     * @mbg.generated
     */
    @SelectProvider(type=VoteDetailSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="ID", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="VID", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="Detail", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="Sno", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<VoteDetail> selectByExample(VoteDetailExample example);

    /**
     *
     * @han
     */
    @Select({
            "select" ,
            "ID,VID, Detail, Sno",
            "from Voter_Vote_Detail",
            "where VID = #{vid,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
            @Arg(column="ID", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
            @Arg(column="VID", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
            @Arg(column="Detail", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="Sno", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<VoteDetail> selectByVid(Integer Vid);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Voter_Vote_Detail
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "ID, VID, Detail, Sno",
        "from Voter_Vote_Detail",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="ID", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="VID", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="Detail", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="Sno", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    VoteDetail selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Voter_Vote_Detail
     *
     * @han
     */
    @Select({
            "select",
            "ID, VID, Detail, Sno",
            "from Voter_Vote_Detail",
            "where ID = #{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
            @Arg(column="ID", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
            @Arg(column="VID", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
            @Arg(column="Detail", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="Sno", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    @Results({
     @Result(property="vote",column="VID",   one=@One(select="pers.adlered.voter.service.Vote1Mapper.selectByPrimaryKey"))
    })
    VoteDetail selectVoteByPrimaryKey(Integer id);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Voter_Vote_Detail
     *
     * @mbg.generated
     */
    @UpdateProvider(type=VoteDetailSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") VoteDetail record, @Param("example") VoteDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Voter_Vote_Detail
     *
     * @mbg.generated
     */
    @UpdateProvider(type=VoteDetailSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") VoteDetail record, @Param("example") VoteDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Voter_Vote_Detail
     *
     * @mbg.generated
     */
    @UpdateProvider(type=VoteDetailSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(VoteDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Voter_Vote_Detail
     *
     * @mbg.generated
     */
    @Update({
        "update Voter_Vote_Detail",
        "set VID = #{vid,jdbcType=INTEGER},",
          "Detail = #{detail,jdbcType=VARCHAR},",
          "Sno = #{sno,jdbcType=INTEGER}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(VoteDetail record);
}