#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   //Your code goes here
  struct student s;
  cin.get(s.name, 50);
  std::cin>>s.roll;
  std::cin>>s.marks;
  cout<<"\n";
  std::cout<<"Student Details"<< std::endl;
  std::cout<<"Name: "<<s.name<<std::endl;
  std::cout<<"Roll: "<<s.roll<<std::endl;
  std::cout<<"Marks: "<<s.marks<<std::endl;
  return 0;
}