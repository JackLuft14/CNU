-- Find most occuring letter in string

toSet l = doSet [] l

doSet a l
   | null l    = a
   | otherwise = if elem (head l) a then doSet            a (tail l)
                                    else doSet ((head l):a) (tail l)

doCount e l = sum [1 | x<-l, x == e]

-- need tuples [(a,(doCount 'a' "abracadabra")) | a<- (toSet "abracadabra")]
-- need max
