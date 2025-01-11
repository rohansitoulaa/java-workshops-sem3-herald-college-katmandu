package week03;


interface RemoteControl {
    void powerOn();
    void powerOff();
}

class TV implements RemoteControl {
    @Override
    public void powerOn() {
        System.out.println("TV is ON");
    }

    @Override
    public void powerOff() {
        System.out.println("TV is OFF");
    }
}

class AC implements RemoteControl {
    @Override
    public void powerOn() {
        System.out.println("AC is ON");
    }

    @Override
    public void powerOff() {
        System.out.println("AC is OFF");
    }
}
public class qn06 {
	public static void main(String[] args) {
        RemoteControl tv = new TV();
        tv.powerOn();
        tv.powerOff();

        RemoteControl ac = new AC();
        ac.powerOn();
        ac.powerOff();
    }
}
