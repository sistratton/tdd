
# Mini-App built using TDD (Maven Project)

The allowed values for 'skills' are = `"a"`, `"b"`, `"c"`, `"d"` or `"e"`.

A string value such as `"aabccdeccabbbe"` will be parsed and the number of possible groups of 5 students is returned (which is `2` in this case).

The app was build using `TDD` (Test Driven Development) and red/green refactoring (see Unit Tests). The Mockito library was used to create Mock objects for dependency injection.

A 'Domain' test (sometimes called a 'Component' test) has also been created. If an API had been created an Integration test would also be appropriate.

Please run the tests or the `GrouperApp` to see everything working.