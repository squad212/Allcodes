package com.humana.dhp.dhppocs.SortingUtils;

import java.util.*;

public class MySortingUtils {
    public List<String> sort (List<String> name){
        BubbleSort bubbleSort = new BubbleSort();
        return bubbleSort.sort(name);
    }
}
