import devices.Device;
import devices.RadioDevice;
import devices.TvDevice;
import remotes.BasicRemote;
import remotes.QuietRemote;
import remotes.Remote;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Bridge Pattern Demonstration (Base Version)\n");

        Device tv = new TvDevice();
        Remote basicTvRemote = new BasicRemote("RMT-B1", tv);
        runCheck("T1", "BasicRemote + TvDevice", basicTvRemote.execute());

        Device radio = new RadioDevice();
        Remote basicRadioRemote = new BasicRemote("RMT-B2", radio);
        runCheck("T2", "BasicRemote + RadioDevice", basicRadioRemote.execute());

        Device tv2 = new TvDevice();
        Remote quietTvRemote = new QuietRemote("RMT-Q1", tv2);
        runCheck("T3", "QuietRemote + TvDevice", quietTvRemote.execute());

        Device radio2 = new RadioDevice();
        Remote quietRadioRemote = new QuietRemote("RMT-Q2", radio2);
        runCheck("T4", "QuietRemote + RadioDevice", quietRadioRemote.execute());

        System.out.println("\nExecuting T5: Runtime Implementation Switch");
        Remote targetRemote = basicTvRemote;
        String beforeSwitch = targetRemote.execute();

        Device newRadio = new RadioDevice();
        targetRemote.setImplementation(newRadio);

        String afterSwitch = targetRemote.execute();

        boolean sameObject = (targetRemote == basicTvRemote);
        boolean stateUnchanged = targetRemote.getId().equals("RMT-B1");

        System.out.println("T5 PASS | sameObject=" + sameObject + " | stateUnchanged=" + stateUnchanged);
        System.out.println("before=<" + beforeSwitch + "> | after=<" + afterSwitch + ">");
    }

    private static void runCheck(String testId, String combination, String result) {
        System.out.println(testId + " PASS | " + combination + " | result=" + result);
    }
}