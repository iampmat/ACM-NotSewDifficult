# ACM-NotSewDifficult
My solution to this ACM problem:

Problem E: Not Sew Difficult
A quilt will be made by laying a number of rectangular pieces of fabric
onto a square cloth backing. The rectangular pieces will all be laid with one
edge parallel to an edge of the cloth backing.
We plan to sew the overlapping pieces together, and need to know the
maximum thickness of fabric (not counting the backing) that we will need to
push a needle through at any point.
The rectangles will be positioned at non-negative integer coordinates on
a 100, 000 by 100, 000 grid with axes defined by the cloth backing and one corner of the backing
treated as the origin. All rectangular pieces will lie entirely within the bounds of the backing cloth.
Pieces overlap only if they do so along a non-zero area. Pieces that are simply adjacent along
an edge or at a corner point are not considered overlapping.

Input:
The input will consist of one or more test cases.
Each test case begins with a line containing an integer N, 1 ≤ N ≤ 1000, denoting the number
of rectangles. (End of input is signalled by a non-positive value for N.)
This is followed by N lines, each containing four non-negative integers x1 y1 x2 y2, defining
the coordinates of two opposite corners of a rectangle.

Output:
For each dataset, print a single line containing an integer D, denoting the maximum depth of
overlapping pieces of fabric.
