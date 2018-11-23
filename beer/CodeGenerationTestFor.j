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
if_icmple else_for
ldc 1
iload 1
iadd
istore 1
iload 0
iload 1
iadd
istore 0
goto for
else_for:
ldc 5050
iload 0
if_icmpne else
ldc "arrombase"
goto end
else:
ldc "fodeu"
end:
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method
