package Java.Youtube.String;

public class Detail {
    // --> String   name  =  "Nikunj Makwana"
    //     |____|   |___|    |______________|
    //        |    |  |          |  |
    //        V    |  V          |  V
    //  datatype   |ref variable |  Object
    // String a = "nikunj"
    // String b = "nikunj"
    //                                                                                   ^
    //      |      |                ^           |    |          |      |                / \
    //      |  a   | ----|         / \          |    |          |   a  |  ------|      /   \
    //      |      |     |        /   \         |    |          |      |        |     /     \
    //      |      |     |       /     \        | or |          |      |        |--->/ nikunj\
    //      |  b   |-----|      /       \       |    |          |   b  |------|     /         \
    //      |______|     |---->/ nikunj  \      |    |          |------|      |--->/  nikunj   \
    //
    // concepts =>
    //              -> 1. String pool
    //              -> 2. immutability
    //
    // why we can't modify String object..?
    // --> strings are immutable
    //
    // comparison of string
    //      -> 1. == method
    //              --> how to create diff. object of same value
    //                          -> String a = new String("Nikunj") ;
    //                          -> String b = new String("Nikunj");
    //                                        - creating these value outside the pool but in heap
    //                                        - a == b -> false
    //      -> 2. when you only need check value ,
    //                     - use .equals()  method
    //
}
