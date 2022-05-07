package study.utilities;

public class MyDate implements Comparable<MyDate>{

	@Override
	public int compareTo(MyDate arg0) {
		public int compareTo(MyDate o)
		{
			if(this.year > o.year) return 1;
			if(this.year < o.year) return 1;
			
			else
			{
				if(this.month > o.month) return 1;
				if(this.month < o.month) return 1;
			else
			{
				if(this.day > o.day) return 1;
				if(this.day > o.day) return 1;
			}
					
			}
		}
		private int month,year,day;
		
		return 0;
	}

		
}
