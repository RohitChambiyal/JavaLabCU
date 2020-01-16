
/* Experiment 10. Design an algorithm to print a pyramid based on level entered by the user. 
Sample output is shown below. 
Enter the level of pyramid: 10 
The pyramid is - 
1 
232 
45654 
7890987 
123454321 
67890109876 
2345678765432 
901234565432109 
78901234543210987 
6789012345432109876

Code:
*/

public class PatternPyramid{
public static void main(String[] args){
int x=1;
int n =10;
for(int i=0;i<n;i++){
int temp = x;
for(int j=0;j<i+1;j++){
System.out.print(x);
if(x==9)
x=0;
else
x++;
}
if(i==0){
System.out.println();
continue;
}
int temp2 = x;
if(temp2==0)
temp2=9;
else
temp2--;
if(temp2==0)
temp2=9;
else
temp2--;    
while(temp2!=temp)
{
System.out.print(temp2);
if(temp2==0){
temp2 = 9;
}
else
temp2--;
}
System.out.print(temp);

System.out.println();
}
}
}
