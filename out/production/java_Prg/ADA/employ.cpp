#include <iostream>
#include <array>
using namespace std;

struct Employee
{
int emp_id;
string emp_name;
float emp_salary;
string number,email;
};

void push(Employee arr[],Employee emp,int *k)
{
  arr[*k]=emp;
  (*k)++;
}

void pop(int *k)
{
  (*k)--;
}


void search(Employee arr[],int value,int size)
{
  int found=0;
  for(int i=0;i<size;i++)
  {
    if(arr[i].emp_id==value)
    {
      found=1;
      cout<<"Employee found"<<endl;
      break;
    }
  }
  if(found==0)
  {
    cout<<"Employee not found"<<endl;
  }
}


void sort(Employee arr[],int size)
{
  for(int i=0;i<size;i++)
  {
    for(int j=i+1;j<size;j++)
    {
      if(arr[i].emp_id>arr[j].emp_id)
      {
        Employee temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
      }
    }
  }
  for(int i=0;i<size;i++)
  {
    cout<<"\nEmployee id:"<<arr[i].emp_id;
    cout<<"\n=>Employe Name:"<<arr[i].emp_name;
    cout<<"\n=>Employee Salary:"<<arr[i].emp_salary;
    cout<<"\n=>Employee number:"<<arr[i].number;
    cout<<"\n=>Employee Email:"<<arr[i].email<<endl;
  }
}

int main()
{
  int choice;
  int max=2;
  int index=0,size=0;
  Employee Stack[max];
  while (true)
  {
    cout<<"1. Push"<<endl;
    cout<<"2. Pop"<<endl;
    cout<<"3.Display"<<endl;
    cout<<"4.Search"<<endl;
    cout<<"5.Sort"<<endl;
    cout<<"6.Exit"<<endl;
    cout<<"Enter Choice:";
    cin>>choice;
    Employee z;

    if(choice==1)
    {
      int id;string name,email,num;float salary;

      if(index==max)
      {
        cout<<"Stack is full"<<endl;
      }
      else
      {
        cout<<"Enter id:";
        cin>>id;
        cout<<"Enter name:";
        cin>>name;
        cout<<"Enter Salary:";
        cin>>salary;
        z.emp_id= id;
        z.emp_name=name;
        cout<<"Enter email:";
        cin>>email;
        z.email=email;
        z.emp_salary=salary;
        cout<<"Enter number:";
        cin>>num;
        z.number=num;
        push(Stack,z,&index);
        cout<<index;
        size++;
      }

    }
    else if (choice==2)
    {
      if(index<0)
      {
        cout<<"Stack is empty"<<endl;
      }
      else
      {
        pop(&index);
        size--;
      }

    }
    else if(choice==3)
    {
      if(index==0)
      {
        cout<<"Stack is empty"<<endl;
      }
      else
      {
        cout<<endl;
        for(int i=0;i<index;i++)
        {
          cout<<"Employee id:"<<Stack[i].emp_id;
          cout<<"\n=>Employe Name:"<<Stack[i].emp_name;
          cout<<"\n=>Employee Salary:"<<Stack[i].emp_salary;
          cout<<"\n=>Employee number:"<<Stack[i].number;
          cout<<"\n=>Employee Email:"<<Stack[i].email<<endl;
        }
        cout<<endl;
      }
    }
    else if(choice==4)
    {
      int s;
      cout<<"Enter the id to be searched:";
      cin>>s;
      search(Stack,s,size);
    }
    else if(choice==5)
    {
      sort(Stack,size);
    }
    else
    {
      cout<<"Exit";
      break;
    }

  }
}