
foo :: [Integer] -> Integer -> [Integer]
foo l n = [x | x <- l, x > n]

bar :: Integer -> Integer
bar h = 2^(h+1) - 1