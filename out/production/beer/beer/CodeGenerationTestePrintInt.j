.class public MainTest 
.super java/lang/Object 
.method public static main([Ljava/lang/String;)V 
.limit stack 100 
.limit locals 100 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc 3
istore 0
ldc 2
iload 0
iadd 
istore 0
iload 0
invokevirtual java/io/PrintStream/println(I)V 
return 
.end method 