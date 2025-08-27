# Lane Pollock
# 28 Apr 2025
# lab 7.2
# test_arithmetic module to unittest functions

import unittest
import arithmetic

class TestArithmetic(unittest.TestCase):

    def test_add(self):
        self.assertEqual(arithmetic.add(4, 5.5), 9.5)
    
    def test_subtract(self):
        self.assertEqual(arithmetic.subtract(8, 4), 4)

    def test_multiply(self):
        self.assertEqual(arithmetic.multiply(4.5, 2), 9)
    
    def test_divide(self):
        self.assertEqual(arithmetic.divide(10, 2), 5)
        with self.assertRaises(ValueError):
            arithmetic.divide(10, 0)

if __name__ == "__main__":
    unittest.main()



