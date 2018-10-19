@v_1942406066 = global i32 0
@.str = private unnamed_addr constant [4 x i8] c"%u\0A\00"
define i32 @main() #0 {
%t_0 = add i5 0, 23
%t_1 = zext i5 %t_0 to i32
store i32 %t_1, i32* @v_1942406066
%t_2 = load i32, i32* @v_1942406066
%t_3 = add i32 0, 3
%t_4 = add i32 0, 1
%t_5= add i32 %t_3, %t_4
%t_6 = shl i32 1, %t_5
%t_7 = and i32 %t_2, %t_6
%t_8 = lshr i32 %t_7, %t_5
%t_9 = trunc i32 %t_8 to i1
%t_11 = zext i1 %t_9 to i32
%t_10 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i32 0, i32 0), i32 %t_11)
ret i32 0
}
declare i32 @printf(i8*, ...) #1