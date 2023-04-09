package API;

public class UserLogin {
    private String mobile;
    private String password;
    private Boolean referral_link;
    private String device_id;
    private String device_token;
    private String device_type;
    private String player_id;


    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
// For post request

    /**
     *  @param mobile
     * @param password
     * @param referral_link
     * @param device_id
     * @param device_token
     * @param device_type
     * @param player_id
     */
    public UserLogin(String mobile, String password, Boolean referral_link, String device_id, String device_token, String device_type, String player_id) {
        setMobile(mobile);
        setPassword(password);
        setPlayer_id(player_id);
        setDevice_id(device_id);
        setDevice_token(device_token);
        setDevice_type(device_type);
        setReferral_link(referral_link);

    }


    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public String getPassword() {
        return password;
    }

    public String getDevice_id() {
        return device_id;
    }

    public String getDevice_token() {
        return device_token;
    }

    public String getDevice_type() {
        return device_type;
    }

    public String getPlayer_id() {
        return player_id;
    }

    public Boolean getReferral_link() {
        return referral_link;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public void setDevice_token(String device_token) {
        this.device_token = device_token;
    }

    public void setDevice_type(String device_type) {
        this.device_type = device_type;
    }

    public void setReferral_link(Boolean referral_link) {
        this.referral_link = referral_link;
    }

    public void setPlayer_id(String player_id) {
        this.player_id = player_id;
    }
}
