//lane pollock
//count from R[0], R[1] times and store in R[2]
//26 sep 2025

@R0
D=M
@R2
M=D

//loop 
(LOOP)
@R1
D=M
@END
D;JEQ //if counter at R1 is 0, exit loop

//count
@1
D=A
@R2
M=D+M

//decrement
@R1
M=M-D

//loop
@LOOP
0;JMP

(END)
@17
0;JMP


