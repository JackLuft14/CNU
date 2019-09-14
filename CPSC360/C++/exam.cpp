/*
 * exam.cpp
 *
 *  Created on: Feb 13, 2018
 *      Author: jack
 */
#include <iostream>


char* foo(char* s){
	int size = sizeof(s);
	std::cout << sizeof(char) << std::endl;
	char * rev = new char[size];
	for(int i = 0; i < size; i++){
		rev[i] = s[size-1-i];
		std::cout << rev[i] << std::endl;
	}
	return rev;
}

/*
int main(int args){

	char a = 'a';
	char b = 'b';
	char c = 'c';

	char * array = new char[3];
	array[0] = a;
	array[1] = b;
	array[2] = c;

	char * newarray;
	newarray = foo(array);

	std::cout << "sup" << std::endl;
	for(int i = 0; i < 3; i++){
		std::cout << newarray[i] << std::endl;
	}
	std::cout << "Hey" << std::endl;

	std::cout << args << std::endl;
	return 0;
}*/
