1.Package
I/O Streams section in java.io package.
  File I/O section in java.nio.file package.

2.I/O Streams
Streams support many different kinds of data, including simple bytes, primitive data types, localized characters, and objects

A stream is a sequence of data. A program uses an input stream to read data from a source, one item at a time

4.Byte Streams
Programs use byte streams to perform input and output of 8-bit bytes. All byte stream classes are descended from **InputStream** and **OutputStream**.
example:FileInputStream,FileOutputStream

5.Character stream
All character stream classes are descended from **Reader** and **Writer**
As with byte streams, there are character stream classes that specialize in file I/O: **FileReader** and **FileWriter**

same like Byte stream, but better for Internationalization.

6.Bufferd Stream
Why Bufferd stream?
Problem:
Most of the examples we've seen so far use unbuffered I/O. This means each read or write request is handled directly by the underlying OS. This can make a program much less efficient, since each such request often triggers disk access, network activity, or some other operation that is relatively expensive.
Solution:
To reduce this kind of overhead, the Java platform implements buffered I/O streams. Buffered input streams read data from a memory area known as a buffer; the native input API is called only when the buffer is empty. Similarly, buffered output streams write data to a buffer, and the native output API is called only when the buffer is full.

Classes to use to wrap unbufferd stream:
for bufferd bytes stream: BufferdInputStream, BufferdOutputStream
for bufferd character stream: BufferedReader, BufferedWriter
example:
inputStream = new BufferedReader(new FileReader("xanadu.txt"));
outputStream = new BufferedWriter(new FileWriter("characteroutput.txt"));

7.Data streams
Data streams support binary I/O of primitive data type values (boolean, char, byte, short, int, long, float, and double) as well as String values.

 All data streams implement either the **DataInput** interface or the **DataOutput** interface.

This section focuses on the most widely-used implementations of these interfaces, **DataInputStream** and **DataOutputStream**


8.Object streams
Just as data streams support I/O of primitive data types, object streams support I/O of objects. Most, but not all, standard classes support serialization of their objects. Those that do implement the marker interface Serializable.

9.Path
Windows:multiple root volume, C,D,E, delimiter:\ , example C:\ home\ linfeng\ report

OS:single root, delimiter:/, example /home/linfeng/report

relative path and absolute path

