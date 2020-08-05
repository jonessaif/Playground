#include<iostream>
using namespace std;
struct node{
  int data;
  struct node* next;
};
void insert(struct node** head,struct node** tail,int a) {
	struct node* temp = new node;
  	temp->data = a;
  	temp->next = NULL;
  	if(!*head) {
      *head = temp;
    } else {
      struct node* t = *tail;
  	   t->next = temp;
    }
    *tail = temp; 
}
int main()
{
  struct node* head = NULL;
  struct node* tail = NULL;
  while(1) {
    int t;
    cin>>t;
    if(t < 0) break;
    insert(&head,&tail,t);
  }
  
  struct node* temp = head;
  while(temp && temp->next && temp->next->next &&temp->next->next->next) {
    cout<<temp->data<<" ";
    temp = temp->next;
  }
  if(!head ||(temp == head &&  !temp->next))  {
    cout<<"Deletion of second last element is not possible";
    return 0;
  }else if(temp == head && !temp->next->next) {
    cout<<tail->data;
    return 0;
  }
  cout<<temp->data<<" ";
  free(temp->next);
  temp->next = tail;
  cout<<tail->data;
  return 0;
  //Type your code here
}