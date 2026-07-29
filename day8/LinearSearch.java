package day8;
public class LinearSearch {
	public static int search(String[] list,String desired, int index){
		if(index==list.length) return -1;
		if(list[index].compareTo(desired)==0) return index;
		return search(list,desired,index+1);
	}
	public static void main(String[] args) {
		String[] rating = {"deloite","zoho","tieto","torry","accenture","Capegemini"};
		System.out.println(search(rating,"google",0));
		System.out.println(search(rating,"capegmini",0));
		System.out.println(search(rating,"wipro",0));
		System.out.println(search(rating,"accenture",0));
		System.out.println(search(rating,"spaceX",0));
		}
}
