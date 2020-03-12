package pers.adlered.voter.exception;

public class UserNoExistException extends RuntimeException {
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private String msg;
    public UserNoExistException( int code,String msg) {

        super( msg);
        this.code=code;
        this.msg=msg;
    }

}
