# Effective-Java ☕️

### _Item01_ - CONSIDER STATIC FACTORY METHODS INSTEAD OF CONSTRUCTORS

- The most important feature is unlike constructors, they are not required to create a new object each time they’re
  invoked.
- Another advantage of static factory methods is that, unlike constructors, they can return an object of any subtype of
  their return type

### _Item02_ - CONSIDER A BUILDER WHEN FACED WITH MANY CONSTRUCTOR PARAMETERS

- **The Telescoping Constructor Pattern**, in
  which you provide a constructor with only the required parameters, another with a
  single optional parameter, a third with two optional parameters, and so on, culminating in a constructor with all the optional parameters.
- **JavaBeans Pattern** - allows inconsistency, mandates mutability,
  you’re faced with many optional parameters in a
  constructor is the JavaBeans pattern, in which you call a parameterless constructor to create the object and then call setter methods to set each required parameter.
- **The Builder Pattern** is a good choice when designing classes
  whose constructors or static factories would have more than a handful of
  parameters, especially if many of the parameters are optional or of identical type.
