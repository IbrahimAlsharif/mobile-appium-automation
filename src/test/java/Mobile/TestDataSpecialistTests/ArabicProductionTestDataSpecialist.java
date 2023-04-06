package Mobile.TestDataSpecialistTests;

public class ArabicProductionTestDataSpecialist implements AbstractTestData {

    @Override
    public String getMainTextInWelcomeScreen() {
        return "استشارة منك تغير حياة الآخرين للأفضل";
    }

    @Override
    public String getDescriptionTextInWelcomeScreen() {
        return "تبدأ من انضمامك معنا وحتى تصل للعديد من العملاء من خلالنا بطرق تواصل مُيسرة";
    }

    @Override
    public String getLoginButtonInWelcomeScreen() {
        return "تسجيل الدخول";
    }

    @Override
    public String getSignUpButtonInWelcomeScreen() {
        return "انشاء حساب جديد";
    }
}
