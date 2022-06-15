class CPU{
	double price;
	class Processor{
		double cores;
		String manufacturer;
		double getCache(){
			return 3.40;
		}
	}
	protected class RAM{
		double memory;
		String manufacturer;
		double getClockSpeed(){
			return 5.2;
		}
	}
}
class CPUMain{
	public static void main(String args[]){
		CPU cpu=new CPU();
		CPU.Processor p=cpu.new Processor();
		CPU.RAM r= cpu.new RAM();
		//CPU.Processor p=new CPU().new Processor();
		System.out.println("Processor Cache="+p.getCache());
		System.out.println("Ram Clock speed="+r.getClockSpeed());
	}
}
