package structure;

import org.example.structure.Bridge.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BridgeTest {

    @Test
    public void test() {
        BridgeService service = new BridgeService();
        service.exec();
    }

    @Test
    public void advancedRemoteTest() {
        Tv tv = new Tv();
        Radio radio = new Radio();
        AdvancedRemote advancedRemoteTv = new AdvancedRemote(tv);
        advancedRemoteTv.mute();

        assertEquals(0, tv.getVolume());

        AdvancedRemote advancedRemoteRadio = new AdvancedRemote(radio);
        advancedRemoteRadio.mute();

        assertEquals(0, radio.getVolume());
    }

    @Test
    public void basicRemoteTest() {
        Tv tv = new Tv();
        BasicRemote remoteTv = new BasicRemote(tv);
        tv.setVolume(20);
        remoteTv.volumeUp();

        assertEquals(30, tv.getVolume());

        Radio radio = new Radio();
        BasicRemote remoteRadio = new BasicRemote(radio);
        radio.setVolume(5);
        remoteRadio.volumeDown();

        assertEquals(0, radio.getVolume());
    }
}
