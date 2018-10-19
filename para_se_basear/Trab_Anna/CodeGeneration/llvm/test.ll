@.pstr = private unnamed_addr constant [4 x i8] c"%u\0A\00"
@.nstr = private unnamed_addr constant [5 x i8] c"-%u\0A\00"
@.cstr = private unnamed_addr constant [3 x i8] c"%c\00"

define i32 @main() {
  %t1 = call i32 @one()
  %t2 = sub i32 %t1, 2
  call void @printSignedInt(i32 %t2)
  call void @printChar(i8 c'a')
;  call void @printString(i8* 65)
  ;call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i32 0, i32 0), i32 %t2)
  ;%t3 = lshr i32 %t2, 31
  ;call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i32 0, i32 0), i32 %t3)
  ret i32 %t1
}


define i32 @one() {
  ret i32 1
}


;define void @printString(i8* %c) {
;  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @.cstr, i32 0, i32 0), i8 %s)
;  ret void
;}

define void @printChar(i8 %c) {
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @.cstr, i32 0, i32 0), i8 %c)
  ret void
}

define void @printSignedInt(i32 %i) {
  %t1 = lshr i32 %i, 31
  %isNegative = trunc i32 %t1 to i1
  br i1 %isNegative, label %PrintNegative, label %PrintPositive
  PrintNegative:
    %t2 = zext i32 %i to i33
    %t3 = sub i33 4294967296, %t2
    %rep = trunc i33 %t3 to i32
    call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @.nstr, i32 0, i32 0), i32 %rep)
    ret void
  PrintPositive:
    call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.pstr, i32 0, i32 0), i32 %i)
    ret void
}

declare i32 @printf(i8*, ...) #1
declare i32 @puts(i8*)
