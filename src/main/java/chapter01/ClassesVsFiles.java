package chapter01;

/**
 * There's no need for a class to be public. But at most one class in a file can be public
 */
class ClassesVsFilesNonPublic {
}

/**
 * Another non-public class
 */
class ClassesVsFilesAlso {
}

/**
 * If a class is declared public its name have to be the same as a file name.
 * Otherwise it will lead to compile-time error
 */
public class ClassesVsFiles {
}

// As mentioned before only one public class per file is legal
/*
public class Hello {
}
*/
