import java.util.ArrayList;

public class Streamtest {

	
		// TODO Auto-generated method stub
		public void regular()
		{
			ArrayList<String> ls=new ArrayList<String>();
			ls.add("sagatr");
			ls.add("don");
			ls.add("varsha");
			ls.add("hero");
			ls.add("mom");
			ls.add("amar");
			int count=0;
			
			for(int i=0;i<ls.size();i++)
			{
				String actuall=ls.get(i);
				if(actuall.startsWith("a"))
				{
					count++;
				}
			}
			
			System.out.println(count);
			
	}
		public static void main(String[] args) {
			
			Streamtest sg=new Streamtest();
					sg.regular();
		}
	}


