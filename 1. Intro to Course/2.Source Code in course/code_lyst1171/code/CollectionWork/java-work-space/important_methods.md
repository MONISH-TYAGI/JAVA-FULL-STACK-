### Commonly used constructor and methods (Collection Framework)

- java.util.Collection<E>(I)
    
  - Interface
  - **boolean add(E object)** - add the element to collection
  - **int size()** - return number of elements in current collection.
  - **boolean addAll(Collection c)**- add all the elements of specified collection to current collection
  - **void clear()** - remove all elements from current collection
  - **boolean contains(Object o)**
  - **boolean containsAll(Collection c)**
  - **boolean isEmpty()** - true if collection has not elements
  - **Iterator<E> iterator()** - returns the iterator
  - **boolean remove(Object o)** - remove the object from collection
  - **boolean removeAll(Collection c)**- remove all the elements of specified collection
  - **boolean removeIf(Predicate p)** remove all elements that satisfy this Predicate
  - **boolean retainAll(Collection c)** retain all the elements of specified collection.
  - **Object[] toArray()** returns the array of objects
---
  
- java.util.List<E> (I)
  - **void add(int index, E element)** Inserts the specified element at the specified position in this list
  - **void addFirst(E element)**
  - **void addLast(E element)**
  - **E get(int index)** - get the element of specified position
  - **E getFirst()**
  - **E getLast()**
  - **int indexOf(E element)** - First occurrence of element
  - **int lastIndexOf(E element)**- Last occurrence of element
  - **ListIterator<E> listIterator()**- return the list iterator
  - **static List<E> of(E...)** return unmodifiable list
  - **E remove(index)**
  - **List<E> reversed()** - return reversed view of list
  - **E set(index,element)** - replace element at specified position with given element
---
- java.util.Map(I)

  - **V put(K,V)** : put the key value pair
  - **V get(K)** : return value of specified key
  - **boolean isEmpty()** 
  - **V remove(K)**: remove the mapping of given key
  - **int size()** : return the elements of map
  - **boolean containsKey(K)**: check for key in map
  - **boolean containsValue(V)** : Check for value
  - **Set<K> keySet()**: return set of keys
  - **Set<Entry<K,V>> entrySet()** : return set of entry




