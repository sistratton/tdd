
# Mini-App built using TDD (Maven Project)

A mini-app built using the principles of TDD.

## How it Works

A string value such as `"aabccdeccabbbe"` will be parsed and the number of possible groups of 5 students is returned. Each student in each group must have a unique skill to the other students in the group. i.e. the previous string will return `2` for the number of possible groups.

The allowed values for 'skills' are = `"a"`, `"b"`, `"c"`, `"d"` or `"e"`.

## Built Using TDD

The app was build using `TDD` (Test Driven Development) and red/green refactoring (see Unit Tests). The Mockito library was used to create Mock objects for dependency injection.

## Tests

A 'Domain' test (sometimes called a 'Component' test) has also been created. If an API had been created an Integration test would also be appropriate.

Please run the tests or the `GrouperApp` to see everything working.