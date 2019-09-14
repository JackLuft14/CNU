doZipWith f one two
   | null one  = []
   | null two  = []
   | otherwise = f (head one) (head two) : doZipWith f (tail one) (tail two)

foo :: Integral a => a -> [a] -> [a]
foo x list = map (\y -> (x-y)^2) list

-- foo x list = [(x-y)^2 | y<- list]
