

.class public MainTest 
.super java/lang/Object 
.method public static main([Ljava/lang/String;)V 
.limit stack 100 
.limit locals 100 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc 0
istore 0
while: 
ldc 10
iload 0
if_icmple else 
ldc 1
iload 0
iadd 
istore 0
goto while 
else: 
iload 0
invokevirtual java/io/PrintStream/println(I)V 
return 
.end method