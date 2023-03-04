import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void testStationMinusOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        int expected = 0;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        int expected = 1;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationEight() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        int expected = 8;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int expected = 9;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationTen() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMinusOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int expected = 0;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        int expected = 1;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeNine() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        int expected = 9;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeTen() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        int expected = 10;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeEleven() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        int expected = 0;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStationZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.next();
        int expected = 1;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStationOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.next();
        int expected = 2;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStationEight() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();
        int expected = 9;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStationNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prev();
        int expected = 0;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationEight() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.prev();
        int expected = 7;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prev();
        int expected = 8;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMaxZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.volumeMax();
        int expected = 1;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMaxOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.volumeMax();
        int expected = 2;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMaxNine() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.volumeMax();
        int expected = 10;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMaxTen() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.volumeMax();
        int expected = 10;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMinZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.volumeMin();
        int expected = 0;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMinOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.volumeMin();
        int expected = 0;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMinNine() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.volumeMin();
        int expected = 8;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMinTen() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.volumeMin();
        int expected = 9;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
