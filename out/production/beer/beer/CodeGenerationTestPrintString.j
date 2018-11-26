.class public MainTest 
.super java/lang/Object 
.method public static main([Ljava/lang/String;)V 
.limit stack 100 
.limit locals 100 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Ola mundo!"
astore 0
aload 0
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
return 
.end method