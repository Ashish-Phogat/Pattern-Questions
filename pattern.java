public class pattern {
    // Pattern Question Solid Rectange
public static void main(String args[]){
    // int n = 4; //n represents no of rows and m represent's number of colums.
    // int m = 5;
    // // Outer loop 
    // for(int i =1; i<=n; i++){
    //     // inner loop 
    //     for(int j=1; j<=m; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }



    // Hollow Rectangle

//     int n = 4;
//     int m = 5;
//     // Outer loop 
//     for(int i =1; i<=n; i++){
//         // inner loop 
//         for(int j=1; j<=m; j++){

//             if(i==1||j==1||i==n||j==m){

//             System.out.print("*");
//         }else {
//             System.out.println(" ");
//         }
//         System.out.println();
//     }

// }
// }
// }

// HAlf Pyramid
// int n =4;

// for(int i =1; i<=n; i++){
//     for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
// 
// Iverse of half pyramid
int n =4;

for(int i =n; i>=1; i--){
    for(int j=1; j<=i; j++){
        System.out.print("*");
    }
    System.out.println();
}
}
}
