package QLSV;

import java.util.Scanner;

public class DSSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int luachon;
		int n;
		SinhVien sv[]=null;
		System.out.println("1. Nhap thong tin sinh vien\n");
		System.out.println("2. Xem thong tin sinh vien\n");
		System.out.println("3. Tim sinh vien theo diem\n");
		System.out.println("4. Ket thuc");
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Moi ban chon:");
			luachon=sc.nextInt();
			switch(luachon) {
			case 1:{
				System.out.println("Nhap so luong sinh vien:");
				n=sc.nextInt();
				sv = new SinhVien[100];
				for(int i=0;i<n;i++) {
					System.out.println("Nhap sinh vien thu " +(i+1));
					sv[i] = new SinhVien();
					sv[i].Nhap();
			}
			
				
	
				break;
					
			}
			case 2:{
				System.out.println("DANH SACH SINH VIEN");
				System.out.println("________________________________________________________________________________________");
				System.out.println("|SBD    |HO TEN                   |DIA CHI        |MON HOC        |DIEM 1    |DIEM 2    |");
				System.out.println("|_______________________________________________________________________________________|");
				for(int i=0;i<sv.length;i++) {
					sv[i].HienThi();	
					System.out.println("|__________|_________________________|_______________|_______________|__________|__________|");
					
				}
				break;
			}
			case 3:{
				double a;
				int b=0;
				System.out.println("Nhap vao diem can tim:");
				a=sc.nextDouble();
				System.out.println("________________________________________________________________________________________");
				System.out.println("|SBD    |HO TEN                   |DIA CHI        |MON HOC        |DIEM 1    |DIEM 2    |");
				System.out.println("|_______________________________________________________________________________________|");
				for(int i=0;i<sv.length;i++) {
					if(sv[i].getD1()==a) {
						sv[i].HienThi();
						System.out.println("|__________|_________________________|_______________|_______________|__________|__________|");
						b++;
					}
					
				}
				if(b==0) {
					System.out.println("Khong co sinh vien can tim!!!");
				}
				
			}
			break;
			}
		}while(luachon!=4);
		
		
	}
	
}
