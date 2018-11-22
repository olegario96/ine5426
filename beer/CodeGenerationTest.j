.class public MainTest 
.super java/lang/Object 
.method public static main([Ljava/lang/String;)V 
.limit stack 100 
.limit locals 100 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc 1
istore 0
ldc 1
iload 0
if_icmpne else 
ldc "Igual a um"
goto end 
else: 
ldc "Diferente a um"
end: 
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
return 
.end method