// what is time complexity
// tc != time taken 
//e.g, depending on system 
//old windows time taken = 2s
//new mac time taken = 1s

//defintion of tc--> rate of which the time taken increases with respect to the input size

//TC --> big(O)n , big o notation
//i.e, O()
// for(i=1; i<=5; i++) //increment check print (3)*(5)
// {
//     system.out.println("rajasthan")
    //always computte in terms of worsdt case scenarios 
    //avoid lower values
    //avoid constants   
    //O(15) --> O(n*3)   
    
    //cases
    //best case, avg case,worst case
//     marks 10;
//     if(marks<25) cout<< "grade D"
//     else if(marks<45) cout << "grade c"
//     else if(marks<65) cout << "grade B"
//     else{
//         cout << "grade A"
//     }

//1.USE WORST CASE SCENARIOUS
//O(4) --> best case 
//O(2) --> worst case
//O(2) --> avg of best and worse


//2.CONSTANTS SHOULD BE AVOIDED
//O(4npow3 + 3npow2 +8) -->n=10pow5
//O(4*10pow15 + 3*10pow10 +8) -->the constant is worthless in front of the big values...so it should be avoided

//3.AVOID LOWER VALUES--^

//(O)(upper bound complexity) >>theta(avg complexity) >>omega(lowest bond)

// question 1.-->
// for(int i=0;i<n;i++){
//    for(int j=0; j<n;j++){
//     block of code (constant time)
//    }
// }
//time complexity--> i=0 [j=0,1,2,3...n]
//                   i=1 [j=0,1,2,3,..n]

//                   i=n-1 [j=0,....n]
//n*n = O(npow(2))

//question 2. -->
//for(int i=0;i<n;i++){
//    for(int j=0; j<i;j++){
//     block of code (constant time)
//    }
// i=0 [j=0]
//i=1 [j=0,1]
//i=2 [j=0,1,2]
//i=n-1 [j=0,1,2,....n-1]

// 1+2+3+4+....n
// n*(n+1)/2 = npow(2)/2 +n/2




