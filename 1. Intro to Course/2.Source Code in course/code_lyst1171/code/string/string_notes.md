## String class

- String class represent string.

- Use to handle string

- java.lang.String

- String create immutable objects

  Immutable means once object is create value of its can not be changed

- If we try to change the value of object new object is created every time

commonly used constructor of string class

1. String()

   create object with blank string.

   ```java

   String str=new String();

   ```

2. String(byte [])

   create string from byte array

3. String(char [])

   create string from char array

   ```java

     String str4 = new String(chars);

   ```

4. String(String str)

   create string from another string

5. String(StringBuffer buffer)

   create string from passed buffer object

6. String(StringBuilder builder)

   create string from passed string builder

---

commonly used methods of string class

int charAt(int i);

String

String str=new String("this is string");
int result=str.charAt(1);

1. int length()
   return number of characters in string

2. char charAt(int index)

   return character at specified position(index)

3. int indexOf(char ch)

   return the index of first occurrance of given character.

4. int indexOf(char ch, int startFrom)

   return index of first occurance of given character , search start from given startvalue

5. boolean isEmpty()

   return true if string has length =0

6. String toUpperCase()

   return string after converting into uppercase

7. String toLowerCase()

   return tstring after converting into lowercase

8. boolean equals(String anotherString)

   return true if invoking string is equal to given string

9. boolean equalsIgnoreCase(String anotherString)
   return true if invoking string is equal to given string
   (insenstive manager)

10. boolean isBlank()

return true if string is empty() or string contain whitespace

11. int lastIndexOf(char ch)

    Returns the index within this string of the last occurrence of the specified character.

12. boolean startsWith(String str)

    check string is starting with given string or not

13. boolean endsWith(String str)

    check string is ending with given string or not

14. String trim()

    remove whitespaces from starting and ending

15. String strip()

remove all leading and trailing whitepsaces

16. String stripTrailing()
17. String stripLeading()

18. String substring(int start)

19. String substring(int start , int end)

20. char[] toCharArray()

21. String[] split()

22. static String valueOf(data)

23. int compareTo(String str)

24. String replace(string target, String replacement)

25. static String join(String delimeter,String str...)

---

## StringBuffer class

- java.lang package

- This class also represent string

- This class create objects that is mutable in nature

  Mutable means once object is crated value can be changed any time

  #### Commonly used constructor of StringBuffer Class

- StringBuffer()

  Creates string buffer with empty string

  object with capacity: 16

- StringBuffer(String str)

  Creates string buffer with specified string

  Object capacity: 16+length of the string passed

- StringBuffer(int capacity)

  creates new string buffer of specified capacity

  ***

  #### Commonly used StringBuffer methods

1. **StringBuffer append( String str)**

   append the specified string
   method is overloaded

2. **StringBuffer insert(int index , char ch)**

   insert char into stringbuffer at specified index.

   method is overloaded

3. **String substring(int)**
   **String substring(int ,int )**
   extract a part of string

4. **int indexOf(String str)**

   **int indexOf(String str, int start)**
   **int lastIndexOf(String str)**
   return the index of passed string

5. **StringBuffer reverse()**

   reverse the value of current string buffer object

6. **StringBuffer repeat(CharSequence seq, int number)**

   append the given seq number of times

7. **StringBuffer delete(int from, int to)**

   delete the characters from stringbuffer

8. **StringBuffer replace(int start, int end , String str)**

   replace the substring with str

9. **char charAt(int index)**
10. **StringBuffer deleteCharAt(int index)**
11. **int compareTo(StringBuffer anotherString)**
12. **int length()**

---

#### StringBuilder class

- This class similar to StringBuffer class
- The difference between StringBuffer and StringBuilder is , StringBuffer class is thread safe and StringBuilder class is not thread-safe.

- In single thread environment StringBuilder is best to use.

- In multithread environment StrignBuffer is best to use.

- StringBuildeer provides better performance. but it required manul thread safty concepts.
