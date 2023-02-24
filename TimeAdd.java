public class TimeAdd {
	public static void main(String[] args) {
		Time t1 = new Time(10,2);
		Time t2 = new Time(58,4);
		Time res = new Time();
		t2.hour = 2;
		t2.minute = 2;
		res = addTime(t1,t2);
		res.getTime();
	}
	static Time addTime(Time t1, Time t2){
		Time temp = new Time();
		temp.minute = t1.minute + t2.minute;
		temp.hour = t1.hour + t2.hour;
		if(temp.minute > 59){
			temp.minute -= 59;temp.hour++;
		}
		return temp;
	}
}
class Time{
	int hour;
	int minute;
	Time(int m,int h){
		this.h = h;
		this.m = m;
	}
	void getTime(){
		System.out.printf("%02d:%02d",hour,minute);
	}
}