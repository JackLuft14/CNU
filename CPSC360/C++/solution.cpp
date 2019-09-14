//
//  solution.cpp
//

#include <iostream>
#include <vector>

using namespace std;

// function for any single digit number
void singles(int num, string& words){
	switch(num){
	case 1: words = "one"   + words; break;
	case 2: words = "two"   + words; break;
	case 3: words = "three" + words; break;
	case 4: words = "four"  + words; break;
	case 5: words = "five"  + words; break;
	case 6: words = "six"   + words; break;
	case 7: words = "seven" + words; break;
	case 8: words = "eight" + words; break;
	case 9: words = "nine"  + words; break;
	}
}

string convert(unsigned long num){

	if (num == 0)
		return "zero";

	string words = "";
	vector<int> nums;

	// break down number into digits
	while (num){
		nums.push_back(num%10);
		num = num/10;
	}

	// fill in with zeros
	while (nums.size()%3 != 0){
		nums.push_back(0);
	}

	bool ones = false;
	bool tens = false;
	bool hund = false;
	bool thou = false;
	bool mill = false;
	// check to see which places are filled
	if (nums.at(0))
		ones = true;
	if (nums.size() > 1 && nums.at(1))
		tens = true;
	if (nums.size() > 2 && nums.at(2))
		hund = true;
	if (nums.size() > 3 && (nums.at(3) || nums.at(4) || nums.at(5)))
		thou = true;
	if (nums.size() > 6 && (nums.at(6) || nums.at(7) || nums.at(8)))
		mill = true;

	bool needAnd = false;
	int curr = 0;

	if ((ones || tens) && (hund || thou || mill))
		needAnd = true;

	// Loop through every three digits, build string from right to left
	while (curr < nums.size()){

		// add comma if appropriate
		if (curr > 4 && (thou || hund))
			words = ", " + words;
		else if (curr > 2 && thou && hund)
			words = ", " + words;


		if (nums.at(curr) || nums.at(curr+1) || nums.at(curr+2)){
			switch(curr){
			case 3: words = " thousand" + words; break;
			case 6: words = " million"  + words; break;
			case 9: words = " billion"  + words; break;
			default: words = words + "";
			}
		}


		if (nums.at(curr+1) != 1){  //Not teens

			singles(nums.at(curr), words);
			if (nums.at(curr) && nums.at(curr+1)){
				words = "-" + words;
			}
			switch(nums.at(curr+1)){
			case 2: words = "twenty"  + words; break;
			case 3: words = "thirty"  + words; break;
			case 4: words = "forty"   + words; break;
			case 5: words = "fifty"   + words; break;
			case 6: words = "sixty"   + words; break;
			case 7: words = "seventy" + words; break;
			case 8: words = "eighty"  + words; break;
			case 9: words = "ninety"  + words; break;
			default: words = words+"";
			}
		}
		else{
			switch(nums.at(curr)){
			case 1: words = "eleven"    + words; break;
			case 2: words = "twelve"    + words; break;
			case 3: words = "thirteen"  + words; break;
			case 4: words = "fourteen"  + words; break;
			case 5: words = "fifteen"   + words; break;
			case 6: words = "sixteen"   + words; break;
			case 7: words = "seventeen" + words; break;
			case 8: words = "eighteen"  + words; break;
			case 9: words = "nineteen"  + words; break;
			case 0: words = "ten"       + words; break;
			}
		}

		// check to see if "and" is needed

		if (nums.at(curr+2) && (nums.at(curr+1) || nums.at(curr)))	// if respective hundred is used
			needAnd = true;

		if (needAnd)
			words = " and " + words;
		needAnd = false;

		// add hundred with appropriate digit
		if (nums.at(curr+2)){
			words = " hundred" + words;
			singles(nums.at(curr+2),words);
		}

		curr += 3;
	}
	return words;
}

vector<string>* process(vector<unsigned long>& input) {
    // your implementation begins here!
	vector<string> strs;
	string newstr = "";
	for(int i = 0; i < input.size(); i++){
		unsigned long val = input.at(i);
		newstr = convert(val);

		strs.push_back(newstr);
	}
	vector<string>* pntstrs = new vector<string>(strs);
    return pntstrs;
}

/*
int main(){
	unsigned long num = 32001234;
	string str = convert(num);
	cout << str << endl;
	cout << "-------" << endl;

	vector<unsigned long> inps;
	inps.push_back(201000);

	vector<string>* pntwords = process(inps);

	cout << pntwords->size() << endl;
	for(int i = 0; i < pntwords->size(); i++){
		cout << pntwords->at(i) << endl;
	}

	cout << "DONE!" << endl;
	return 0;
}*/
