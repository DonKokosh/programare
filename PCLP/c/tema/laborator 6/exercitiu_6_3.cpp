#include <iostream>
using namespace std;
int n, ogl;
int main()
{
    cout<<"Introduceti numarul n: ";
    cin >> n;

    while (n != 0)
	    {
		    ogl = ogl * 10 + n % 10; 
		    n = n / 10; 
	    }
    cout << "Oglinditul numarului 'n' este: "<< ogl;
    return 0;
}