# ArrayList
### Declare
```
ArrayList<Integer> arrayList
```
### Initialize
```
 arrayList = new ArrayList<>();

 // initial size n
 arrayList = new ArrayList<>(n);

//Initialization using asList()
 arrayList = new ArrayList<String>(
            Arrays.asList("Geeks",
                          "for",
                          "Geeks"));
```

- Always use generic types (ArrayList<String>, HashMap<Integer, String>, etc.).
- Avoid raw types in collections or generic classes.
- Use wildcards (<?>, <? extends T>) where applicable.
- Limit unchecked casts and verify types where possible.
- Use @SuppressWarnings sparingly and only with justification