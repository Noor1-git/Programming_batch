package sowmyamaam.day2;

import java.util.Scanner;

public class MobileSpecifications {

	public static void main(String[] args) {

		boolean loop = true;
		Scanner key = new Scanner(System.in);

		while (loop) {
			System.out.println(
					"Please choose a phone from below list\n" + "1.Samsung galaxy S23 Ultra\n" + "2.Iphone 14 pro max\n"
							+ "3.Oppo reno 8 Pro\n" + "4.Vivo v90 pro\n" + "5.Realme X2 Pro\n" + "6.Exit\n");
			int choice = key.nextInt();
			

			switch (choice) {
			case 1: {
				System.out.println("Samsung Galaxy S23 Ultra \n" + "· Display 6.80-inch \n"
						+ "· Processor Snapdragon 8 Gen 2 \n" + "· Front Camera 12MP \n"
						+ "· Rear Camera 200MP + 12MP + 10MP \n" + "· RAM 8GB, 12GB \n" + "· Storage 256GB\n");
				break;
			}
			case 2: {
				System.out.println("Apple iPhone 14 Pro Max \n "
						+ "Performance. Hexa Core (3.46 GHz, Dual Core + 2.02 GHz, Quad core)\r\n"
						+ "Apple A16 Bionic 6 GB RAM ; Display. 6.7 inches (17.02 cm) 460 PPI\r\n" + "RAM: 6 GB\r\n"
						+ "Front Camera: 12 MP\r\n" + "Rear Camera: 48 MP + 12 MP + 12 MP\r\n" + "Battery: 4323 mAh\n");
				break;
			}
			case 3: {
				System.out.println(
						"Oppo Reno 8 Pro \n"
						+ "· Display 6.70-inch (2412x1080)\n"
						+ "· Processor MediaTek Dimensity 8100 5G \n"
						+ "· Front Camera 32MP \n"
						+ "· Rear Camera 50MP + 8MP + 2MP \n"
						+ "· RAM 12GB \n"
						+ "· Storage 256GB.\n");
				break;
			}
			case 4: {
				System.out.println("Vivo X90 Pro Plus 5G Specs \n"
						+ "· 6.78 inch, AMOLED ScreenLarge \n"
						+ "· 1440 x 3200 pixelsGood \n"
						+ "· 517 ppiGood \n"
						+ "· HDR10+ \n"
						+ "· 120 Hz Refresh Rate \n"
						+ "· Punch Hole Display.\r\n"
						+ ".Sim Type: Dual Sim, GSM+GSM\r\n"
						+ ".Sim Size: Nano SIM\r\n"
						+ ".Device Type: Smartphone\r\n"
						+ ".Release Date: November 22, 2022\n");
				break;
			}
			case 5: {
				System.out.println("Realme X2 Pro Full Specifications \n"
						+ "· Front Camera 16 MP \n"
						+ "· Display 6.5 inches (16.51 cm) \n"
						+ "· Battery 4000 mAh \n"
						+ "· Rear Camera 64 MP + 13 MP + 8 MP + 2 MP.\r\n"
						+ ".Weight: 199 grams\r\n"
						+ ".Network: 5G: Not Supported in India, 4G: Avail...\r\n"
						+ ".Internal Memory: 128 GB\r\n"
						+ ".Resolution: 16 MP f/2.0, Wide Angle\n");
				break;
			}
			case 6: {
				loop = false;
				System.out.println("Thank you...");
				break;
			}

			default:
				System.out.println("Invalid choice...Please choose a phone from below list\n");
				break;
			}
		}
		key.close();
	}

}
