package pers.adlered.voter.configuration;

/**
 * If you form this values, SpringBoot will be check the database:
 * DATABASE NAME: Voter
 * And auto create tables if not exist.
 * BUT FIRST: Fill in below values, and CREATE A DATABASE NAMED "Voter", then start the project.
 * Every tables will be auto generate.
 * @author admin
 */
public class MySQL {
    public static String IP = "localhost";
    public static Integer Port = 3306;
    public static String Username = "vote";
    public static String Password = "vote_6";
}
