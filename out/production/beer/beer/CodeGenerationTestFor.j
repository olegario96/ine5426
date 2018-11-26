

.class public MainTest 
.super java/lang/Object 
.method public static main([Ljava/lang/String;)V 
.limit stack 100 
.limit locals 100 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc 0
istore 0
ldc 0
istore 1
for: 
ldc 100
iload 1
if_icmple else 
ldc 1
iload 1
iadd 
istore 1
ldc 1
iload 0
iadd 
istore 0
goto for 
else: 
iload 0
invokevirtual java/io/PrintStream/println(I)V 
return 
.end method 