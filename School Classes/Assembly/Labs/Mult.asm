//Lane Pollock
//1 Oct 2025
//mult.asm
//multiply R0 * R1 and store in R2

//find which is lower and execute the loop

//get which value is bigger between R1 & R0 so we can do less operations
@R0
D=M
@R1
D=D-M //r0-r1
//jump accordingly
@INIT0 
D;JGT
@INIT1
D;JLT


(INIT0)
//assign r0 to r2
@R0
D=M
@R2
M=D
@LOOP0
0;JMP   

(INIT1)
//assign r1 to r2
@R1
D=M
@R2
M=D
@LOOP1
0;JMP

(LOOP0)
//--r1
@1
D=A
@R1
M=M-D
D=M
//check condition - R1 = 0
@END
D;JEQ

//add r0 to r2
@R0
D=M
@R2
M=D+M

@LOOP0
0;JMP

(LOOP1)
//--r0
@1
D=A
@R0
M=M-D
D=M
//check condition - R0 = 0
@END
D;JEQ

//add r1 to r2
@R1
D=M
@R2
M=D+M
@LOOP1
0;JMP

(END)
@END
0;JMP