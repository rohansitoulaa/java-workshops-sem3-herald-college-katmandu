package week06;

interface AlarmRings{
	void ringAlarm(String message);
}

class PhoneAlarm implements AlarmRings {
	@Override
	public void ringAlarm(String message) {
		System.out.println("Phone alarm is ringing: "+message);
	}
	
}

class alarmClock implements AlarmRings{
	@Override
	public void ringAlarm(String message) {
		System.out.println("Alarm clock's alarm is ringing: "+message);
	}
}
class Alarm{
	AlarmRings alarm;
	public Alarm(AlarmRings alarm) {
		this.alarm = alarm;
	}
	
	public void notify(String message) {
		alarm.ringAlarm(message);
	}
}

public class qn01 {
	public static void main(String[] args) {
		AlarmRings myPhone = new PhoneAlarm();
		Alarm alarmClockPhone = new Alarm(myPhone);
		alarmClockPhone.notify("This is from Phone alarm");
		AlarmRings myAlarm = new alarmClock();
		Alarm alarmClockSet = new Alarm(myAlarm);
		alarmClockSet.notify("This is from alarm clock ");
	}
}
