"""
This file demonstrates a trivial function "fpadd" returning the sum of
two floating-point numbers.
"""

from llvmlite import ir

# Create some useful types
int16 = ir.IntType(16)
int32 = ir.IntType(32)

# Create an empty module...
module = ir.Module(name="main")

builder = ir.IRBuilder()
a = ir.Constant(int16, 1)
b = ir.Constant(int32, 0)
result = builder.add(a, b, name="res")
builder.ret(result)

# Print the module com.joao.IR
print(module)