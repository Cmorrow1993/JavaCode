import java.util.List;
import java.util.ArrayList;
import java.lang.Comparable;

public class MergeSort{


  public static <T extends Comparable<T> > void mergeSort(List<T> theList) 
    {
      recursiveMergeSortHelper(theList,0,theList.size() - 1);
    }

  private static <T extends Comparable<T> > void recursiveMergeSortHelper(List<T> theList, int first, int last) 
  {

    if(theList.size() == 1)
    {
      System.out.println("The base case " + theList + "\n");
      return;
    }

    if(theList.isEmpty())
    {
      return;
    }

    int mid = (last + first) / 2;

    int mid2 = mid + 1;

    List<T> leftHalf = new ArrayList<T>();

    leftHalf = theList.subList(first, mid + 1);

    List<T> rightHalf = new ArrayList<T>();

    rightHalf = theList.subList(mid + 1, theList.size());

    recursiveMergeSortHelper(leftHalf, first, mid);

    recursiveMergeSortHelper(rightHalf, first, mid);

    int li = 0;
    int ri = 0;
    int ci = 0;
    int ti = 0;

    ArrayList<T> temp = new ArrayList<T>();

    while(li < leftHalf.size())
    {
      if(leftHalf.get(li).compareTo(rightHalf.get(ri)) > 0)
      {
        temp.add(leftHalf.get(li));
        theList.set(ci, rightHalf.get(ri));
        theList.set(ci + 1, temp.get(0));
      }
        li++;
        ci++;
    }

    if(rightHalf.size() != 1)
    {
      ri++;
      while(ri < rightHalf.size())
      {
        if(rightHalf.get(ri-1).compareTo(rightHalf.get(ri)) > 0)
        {
          temp.set(0, rightHalf.get(ri - 1));
          theList.set(ci, rightHalf.get(ri));
          theList.set(ci + 1, temp.get(0));
        }
          ri++;
          ci++;
      }
    }

  }// End Method

}