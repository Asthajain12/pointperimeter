
/**
 * Write a description of max_length here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.File;
public class max_length {
public double getLongestSide (Shape s){

double biggestDist = 0.0;

Point prevPt = s.getLastPoint();

for (Point currPt: s.getPoints()) {

double currDist = prevPt.distance(currPt);

if (currDist > biggestDist) {

biggestDist = currDist;

}

prevPt = currPt;

}

return biggestDist;

}

public void testlen () {

FileResource fr = new FileResource();

Shape s = new Shape(fr);

double maxlen = getLongestSide(s);

System.out.println("maximum length = " + maxlen);

}

public static void main (String[] args) {

max_length pr = new max_length ();

pr.testlen();

}

}




