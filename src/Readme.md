
# Threads

#### **there are two methods to implement threads**
 1. using Runnable interface
 2. using extending thread class



### File Operations

#### 1. FileStream (FileInputStream & FileOutputStream)

    Type: Byte Stream
    Purpose: Used for reading and writing raw bytes from/to files.
    Use Case: Suitable for handling binary files like images, videos, and audio files.
    Limitation: Reads and writes one byte at a time, which can be inefficient.

#### 2. BufferedStream (BufferedInputStream & BufferedOutputStream)

    Type: Byte Stream (Buffered)
    Purpose: Improves performance by reading and writing data in chunks using an internal buffer.
    Use Case: Recommended for large file operations where efficiency is important.
    Advantage: Reduces the number of I/O operations by using a buffer, making it faster than FileStream.

#### 3. DataStream (DataInputStream & DataOutputStream)

    Type: Byte Stream (Structured Data)
    Purpose: Reads and writes Java primitive data types (int, float, double, etc.) in a machine-independent way.
    Use Case: Used when dealing with structured binary data like saving objects or numbers in files.

#### 4. CharacterStream (FileReader & FileWriter)

    
    Type: Character Stream
    Purpose: Specifically designed for reading and writing character data (text files). Handles Unicode characters properly.
    Use Case: Suitable for processing text files instead of raw bytes.
    Advantage: Handles characters and Unicode properly, unlike byte streams that work only with raw bytes.