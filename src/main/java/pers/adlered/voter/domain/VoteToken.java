package pers.adlered.voter.domain;

import java.util.Date;

public class VoteToken {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Voter_Vote_Token.ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Voter_Vote_Token.VID
     *
     * @mbg.generated
     */
    private Integer vid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Voter_Vote_Token.Token
     *
     * @mbg.generated
     */
    private String token;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Voter_Vote_Token.Selection
     *
     * @mbg.generated
     */
    private String selection;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Voter_Vote_Token.md5_v
     *
     * @mbg.generated
     */
    private String md5V;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Voter_Vote_Token.md5_m
     *
     * @mbg.generated
     */
    private String md5M;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Voter_Vote_Token.crc
     *
     * @mbg.generated
     */
    private String crc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Voter_Vote_Token.VoteDate
     *
     * @mbg.generated
     */
    private Date votedate;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Voter_Vote_Token
     *
     * @mbg.generated
     */
    public VoteToken(Integer id, Integer vid, String token, String selection, String md5V, String md5M, String crc, Date votedate) {
        this.id = id;
        this.vid = vid;
        this.token = token;
        this.selection = selection;
        this.md5V = md5V;
        this.md5M = md5M;
        this.crc = crc;
        this.votedate = votedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Voter_Vote_Token
     *
     * @mbg.generated
     */
    public VoteToken() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Voter_Vote_Token.ID
     *
     * @return the value of Voter_Vote_Token.ID
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Voter_Vote_Token.ID
     *
     * @param id the value for Voter_Vote_Token.ID
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Voter_Vote_Token.VID
     *
     * @return the value of Voter_Vote_Token.VID
     *
     * @mbg.generated
     */
    public Integer getVid() {
        return vid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Voter_Vote_Token.VID
     *
     * @param vid the value for Voter_Vote_Token.VID
     *
     * @mbg.generated
     */
    public void setVid(Integer vid) {
        this.vid = vid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Voter_Vote_Token.Token
     *
     * @return the value of Voter_Vote_Token.Token
     *
     * @mbg.generated
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Voter_Vote_Token.Token
     *
     * @param token the value for Voter_Vote_Token.Token
     *
     * @mbg.generated
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Voter_Vote_Token.Selection
     *
     * @return the value of Voter_Vote_Token.Selection
     *
     * @mbg.generated
     */
    public String getSelection() {
        return selection;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Voter_Vote_Token.Selection
     *
     * @param selection the value for Voter_Vote_Token.Selection
     *
     * @mbg.generated
     */
    public void setSelection(String selection) {
        this.selection = selection == null ? null : selection.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Voter_Vote_Token.md5_v
     *
     * @return the value of Voter_Vote_Token.md5_v
     *
     * @mbg.generated
     */
    public String getMd5V() {
        return md5V;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Voter_Vote_Token.md5_v
     *
     * @param md5V the value for Voter_Vote_Token.md5_v
     *
     * @mbg.generated
     */
    public void setMd5V(String md5V) {
        this.md5V = md5V == null ? null : md5V.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Voter_Vote_Token.md5_m
     *
     * @return the value of Voter_Vote_Token.md5_m
     *
     * @mbg.generated
     */
    public String getMd5M() {
        return md5M;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Voter_Vote_Token.md5_m
     *
     * @param md5M the value for Voter_Vote_Token.md5_m
     *
     * @mbg.generated
     */
    public void setMd5M(String md5M) {
        this.md5M = md5M == null ? null : md5M.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Voter_Vote_Token.crc
     *
     * @return the value of Voter_Vote_Token.crc
     *
     * @mbg.generated
     */
    public String getCrc() {
        return crc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Voter_Vote_Token.crc
     *
     * @param crc the value for Voter_Vote_Token.crc
     *
     * @mbg.generated
     */
    public void setCrc(String crc) {
        this.crc = crc == null ? null : crc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Voter_Vote_Token.VoteDate
     *
     * @return the value of Voter_Vote_Token.VoteDate
     *
     * @mbg.generated
     */
    public Date getVotedate() {
        return votedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Voter_Vote_Token.VoteDate
     *
     * @param votedate the value for Voter_Vote_Token.VoteDate
     *
     * @mbg.generated
     */
    public void setVotedate(Date votedate) {
        this.votedate = votedate;
    }
}