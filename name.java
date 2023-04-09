<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name="Arabic language Testing Suite">
    <test name="Test Setup">
        <parameter name="url" value="https://famcare.app/"></parameter>
        <parameter name="language" value="Arabic"/>
        <parameter name="browser" value="chrome"/>
        <parameter name="branch" value="Production"></parameter>
        <classes>
            <class name="Base.WebSetup.WebSetupTest"/>
            <class name="Web.Tests.HomePage.HomePageTest"></class>
            <class name="Base.TearDownTest"></class>
        </classes>
    </test>

    <listeners>
        <listener class-name="org.uncommons.reportng.HTMLReporter"/>
        <listener class-name="org.uncommons.reportng.JUnitXMLReporter"/>
        <listener class-name="Listeners.Listener"></listener>

    </listeners>
</suite>
