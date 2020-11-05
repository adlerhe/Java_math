package java_math;

public class Java_math {

		
		private int a,b,c,d,e,f,g,h;
		
		
		
		public void square(int x) {
			a = x*x;
			System.out.println(a);
		}
		public void averageFive(int num1, int num2, int num3, int num4, int num5) {
			b = (num1 + num2 + num3 + num4+ num5)/5;
			System.out.println(b);
		}
		public void raiseToTheFourth(int x) {
			c = x*x*x*x;
			System.out.println(c);
		}
		public void setKey(int x) {
			d = x;
		}
		public void multiplyByKey(int x) {
			e = x*d;
			System.out.println(e);
		}
		public void keyCubed(int x) {
			f = d*d*d;
			System.out.println(f);
		}
		public void makeInteger(double x) {
			g = (int) (x);
			System.out.println(g);
		}
		public void roundToNearestWhole(double x) {
			h = (int)(x);
			if(x - h > 0.5) {
				int m = h +1;
				System.out.println(m);
			}
			else {
				System.out.println(h);
			}
			
		}
		public static void main(String args[]) {
			
			Java_math tester = new Java_math();
			
		
			
			// you are in charge of making the rest of these work
			
			// output: 49
			tester.square(7);
			
			// output: 7
			tester.averageFive(7,10,5,7,6);
			
			// output: 81
			tester.raiseToTheFourth(3);
			
			// output: nothing, just save the number 4 as an instance variable
			tester.setKey(4);
			
			// output: 28
			tester.multiplyByKey(7);
			
			// output: 64
			tester.keyCubed(8);
			
			// output: 3
			tester.makeInteger(3.756);
			
			// output: 8
			tester.roundToNearestWhole(7.8);
		}
		
			
		}

	


