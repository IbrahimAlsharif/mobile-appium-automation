package API;

public class Data {
    private int id;
    private String name;
    private String type;
    private String mobile;
    private String dob;
    private String gender;
    Country CountryObject;
    City CityObject;
    private String is_active = null;
    private boolean is_verified;
    private String avatar;
    private String created_at;
    private float number_of_conversations;
    private float medical_records_count;
    private String martial_status;
    private float suggested_sessions;
    private String referral_code;
    private boolean famcare_client;
    private String email;


    // Getter Methods

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getMobile() {
        return mobile;
    }

    public String getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public Country getCountry() {
        return CountryObject;
    }

    public City getCity() {
        return CityObject;
    }

    public String getIs_active() {
        return is_active;
    }

    public boolean getIs_verified() {
        return is_verified;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getCreated_at() {
        return created_at;
    }

    public float getNumber_of_conversations() {
        return number_of_conversations;
    }

    public float getMedical_records_count() {
        return medical_records_count;
    }

    public String getMartial_status() {
        return martial_status;
    }

    public float getSuggested_sessions() {
        return suggested_sessions;
    }

    public String getReferral_code() {
        return referral_code;
    }

    public boolean getFamcare_client() {
        return famcare_client;
    }

    public String getEmail() {
        return email;
    }

    // Setter Methods

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCountry(Country countryObject) {
        this.CountryObject = countryObject;
    }

    public void setCity(City cityObject) {
        this.CityObject = cityObject;
    }

    public void setIs_active(String is_active) {
        this.is_active = is_active;
    }

    public void setIs_verified(boolean is_verified) {
        this.is_verified = is_verified;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setNumber_of_conversations(float number_of_conversations) {
        this.number_of_conversations = number_of_conversations;
    }

    public void setMedical_records_count(float medical_records_count) {
        this.medical_records_count = medical_records_count;
    }

    public void setMartial_status(String martial_status) {
        this.martial_status = martial_status;
    }

    public void setSuggested_sessions(float suggested_sessions) {
        this.suggested_sessions = suggested_sessions;
    }

    public void setReferral_code(String referral_code) {
        this.referral_code = referral_code;
    }

    public void setFamcare_client(boolean famcare_client) {
        this.famcare_client = famcare_client;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
