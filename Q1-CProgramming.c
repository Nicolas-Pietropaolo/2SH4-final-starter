/* Question 1
 [C Programming]
 [30 Marks]
In this question, you are required to implement a linked list in C
The question has four parts, answer all of them in this same file*/


	
	
	
	
 
/*(a) [5 Marks] write structure Node that holds an integer value as well as a pointer to the next node*/
//Answer:

typedef struct {//define structure
	int val; //define value
	struct Node* nextNode; 
} Node;
	//holds pointer to the next node







/*(b) [5 Marks] Write structure SLL that represents the singly linked list and holds a pointer to the first node in the list.*/
//Answer:


typedef struct {//define structure
	struct Node* firstNodehead; //pointer of first node in list
}SLL;





/*(c) [10 Marks] write function searchList, that takes as input two parameters: the head of a linked list "head" and the integer value to search for "target" and 
returns:
1 if the target was found in the list
0, otherwise*/
//Answer:


int searchList (Node* firstNodehead, int targetVal){ //define function searchList
	
	while(firstNodehead!= NULL){
		if(firstNodehead->val == targetVal){
			return 1; //returns 1 if target is found in list
		}
		
		firstNodehead = firstNodehead->nextNode;
	}//while loop implemented to see if target value is found in the list and to go through all nodes in list
	
	return 0;
	
}
	



  
/*(d) [10 Marks] test your function in main by creating a list of 10 nodes and then call the searchList function to search for a certain value, make sure you check 
the correctness of the returned value from the function by comparing it against what you expect. */
//Answer:


int main(){
	
	
	Node**nodeList;
	
	nodeList = calloc(10, sizeof(Node *)); //allocate memory of list of 10 nodes
	
	int a;
	
	for(int a =0; a<10;a++){
		nodeList[a] = malloc(sizeof(Node));
		nodeList[a]->val = a;
		nodeList[a]->nextNode = NULL;
	}//use malloc as amount of values is unknown
	
	
	for(int b=0; b<9;b++){
		nodeList[b] -> nextNode = nodeList[b+1];
		
	}
	
	SLL *SList = nodeList[0];
	
    //create test cases to test function
    	int caseOne = searchList (SList, 22);
    	int caseTwo = searchList (SList, 27);
    
    	printf("caseOne equals 0; testOne = %d. \n testTwo equals 0; testTwo = %d",caseOne,caseTwo); //print test cases
    	
    	for (int c=0; c<10;c++){
        	free(nodeList[a]); //for loop implemented to ensure all memory is deallocated
    }
    free(nodeList);//deallocate memory
    
    return 0;
}
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	
	
	
	
	
	
	
	
	
	
	
