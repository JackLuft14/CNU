countDown :: Integer -> [String]
countDown i
   | i < 0     = ["blast off"]
   | otherwise = [show i] ++ countDown (i-1)
   
fib :: Integer -> Integer
fib n
   | n < 3     = 1
   | otherwise = fib (n-1) + fib(n-2)
   
hasIt :: Eq a => [a] -> a -> Bool
hasIt l v
   | l == []     = False
   | head l == v = True
   | otherwise   = hasIt (tail l) v
   
qSort :: Ord a => [a] -> [a]   
qSort l
   | null l    = l
   | otherwise = qSort[a|a<-(tail l), a<(head l)] ++ 
                 [head l] ++ 
                 qSort[a|a<-(tail l), a>(head l)]