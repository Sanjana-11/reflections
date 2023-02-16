package project02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Browser {
	String browserName;
	float browserVersion;
	ArrayList<String> urlList = new ArrayList<>();

	Browser(String browserName, float browserVersion, ArrayList<String> urlList) {
		this.browserName = browserName;
		this.browserVersion = browserVersion;
		this.urlList = urlList;
	}

	public String getName() {
		return browserName;
	}

	public float getVersion() {
		return browserVersion;
	}

	public List<String> getUrlList() {
		return urlList;
	}

}

public class Main {

	static ArrayList<Browser> browserList = new ArrayList<>();

	public static void main(String[] args) {
		String continueOption;

		do {
			System.out.println(
					"1.Show all browsers \n2.Add new browser \n3.Remove a browser \n4.Add urls \n5.Browser details");
			System.out.println("Enter your choice");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				for (int i = 0; i < browserList.size(); i++) {
					Browser b = browserList.get(i);
					System.out.println(b.getName());
				}
				break;

			case 2:
				ArrayList<String> urlList = new ArrayList<>();
				Scanner scan = new Scanner(System.in);

				System.out.println("Enter browser name");
				String browserName = scan.nextLine();

				System.out.println("Enter version");
				float browserVersion = scan.nextInt();

				System.out.println("Enter the count of urls");
				int urlCount = sc.nextInt();

				for (int i = 1; i <= urlCount; i++) {
					System.out.println("Enter url" + i);
					Scanner scan1 = new Scanner(System.in);
					String urlName = scan1.nextLine();
					urlList.add(urlName);
				}
				Browser browse = new Browser(browserName, browserVersion, urlList);
				browserList.add(browse);

				break;

			case 3:
				Scanner scan2 = new Scanner(System.in);

				System.out.println("Enter browser name to remove");
				String name = scan2.nextLine();
				for (int i = 0; i < browserList.size(); i++) {
					Browser b = browserList.get(i);
					if (name.equals(b.getName())) {
						browserList.remove(i);
					}
				}

				break;

			case 4:
				Scanner scan3 = new Scanner(System.in);
				System.out.println("Enter browser name to which url needs to be added");
				String browserName1 = scan3.nextLine();
				for (int i = 0; i < browserList.size(); i++) {
					Browser b = browserList.get(i);
					System.out.println("Enter url");
					String url = scan3.nextLine();
					b.getUrlList().add(url);
					break;
				}
				break;
			case 5:
				for (int i = 0; i < browserList.size(); i++) {
					Browser b = browserList.get(i);
					System.out.println(b.getName());
					System.out.println(b.getVersion());
					System.out.println(b.getUrlList());
				}
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}

			System.out.println("\nDo you wish to continue?(Yes or No)");
			Scanner sc2 = new Scanner(System.in);
			continueOption = sc2.nextLine();

		} while ("Yes".equals(continueOption));
	}
}