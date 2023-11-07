# Effective-Java ☕️

### Item01 - CONSIDER STATIC FACTORY METHODS INSTEAD OF CONSTRUCTORS

- The most important feature is unlike constructors, they are not required to create a new object each time they’re
  invoked.
- Another advantage of static factory methods is that, unlike constructors, they can return an object of any subtype of
  their return type