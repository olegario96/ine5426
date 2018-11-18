.class public MainTest
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 100
.limit locals 100
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 1
ldc 2
if_icmpne else
ldc "Igual a um"
goto end
else:
ldc "Diferente de um"
end:
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method