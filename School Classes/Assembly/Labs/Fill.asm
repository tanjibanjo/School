//Lane Pollock
//1 Oct 2025
//Fill.asm
//press a key to fill the screen black, and white if not

//key pressed is RAM[24576]
//SCREEN has 8192 addresses

(START)
    //set up
    @SCREEN
    D=A
    @addr
    M=D //set screen base address to addr

    @8192
    D=A
    @n
    M=D //n=length of screen

    @i
    M=0 //i=0

    //variable for if screen needs is empty -T/F
    @empty
    M=1

(IDLE)
    //infinite loop to check if key pressed, and jump out if so
    @24576
    D=M

    @FILL
    D;JGT //jump to fill if pressed

    //check if empty is false-jump to emptying screen
    @empty
    D=M
    @EMPTY
    D;JEQ

    //if screen empty and not pressing anything, loop
    @IDLE
    0;JMP //if D = 0, loop


(FILL)
    @i
    D=M
    @n
    D=D-M
    @ENDFILL
    D;JEQ
    D;JGT //if i>n, go to idlefill to wait till key release
    //turn black
    @addr
    A=M
    M=-1
    //update address and index
    @i
    M=M+1
    @1  
    D=A
    @addr
    M=D+M
    //update the empty variable
    @empty
    M=0
    //read the keyboard before filling again
    @24576
    D=M

    //jump to fill if pressing or idle if not
    @FILL
    D;JGT

    //set up
    @SCREEN
    D=A
    @addr
    M=D //set screen base address to addr
    @i
    M=0 //i=0
    //jump
    @IDLE
    0;JMP

(EMPTY)
    @i
    D=M
    @n
    D=D-M
    @START
    D;JGT //if i>n go to the start to reset everything
    //turn white
    @addr
    A=M
    M=0
    //update address and index
    @i
    M=M+1
    @1  
    D=A
    @addr
    M=D+M
    //read the keyboard before emptying again
    @24576
    D=M

    //jump to empty if not pressing, or else to fill
    @EMPTY
    D;JEQ
    //set up
    @SCREEN
    D=A
    @addr
    M=D //set screen base address to addr
    @i
    M=0 //i=0
    //jump
    @FILL
    0;JMP


(ENDFILL)
    @24576
    D=M

    @ENDFILL
    D;JGT

    //set up
    @SCREEN
    D=A
    @addr
    M=D //set screen base address to addr
    @i
    M=0 //i=0
    @IDLE
    0;JMP
