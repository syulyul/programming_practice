#include<iostream>
#include<string>

int main() {
	std::string str;
	std::getline(std::cin, str,'\n');
	
	int cnt = 1;
	for (int i = 0; i < str.length(); i++) {
		if (str[i] == ' ')
			cnt++;
	}

	if (str[0] == ' ')
		cnt--;
	if (str[str.length() - 1] == ' ')
		cnt--;

	std::cout << cnt;
}