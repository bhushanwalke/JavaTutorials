package com.bhushan.InterviewQuestions.AmazonInterview;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by bhushan on 1/7/17.
 * Reference for lambda:
 * http://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
 * http://www.developer.com/java/start-using-java-lambda-expressions.html
 */
public class ResultTest {
    public static void main(String[] args) {
        for (Map.Entry<Integer, BigDecimal> entry: calculateAvg().entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        increaseMarksList().forEach(result -> System.out.println(result.getId() + " " + result.getMarks()));
    }

    public static Map<Integer, BigDecimal> calculateAvg() {
        Map<Integer, BigDecimal> output = new HashMap<Integer, BigDecimal>();
        for (Map.Entry<Integer, List<Integer>> entry: generateMapOfResult().entrySet()) {
            double avg = 0;
            List<Integer> marks = entry.getValue();
            Collections.sort(marks);
            for (int i=0; i<5; i++) {
                avg += marks.get(i).doubleValue();
            }
            output.put(entry.getKey(), new BigDecimal(avg/5));
        }

        return output;
    }

    public static Map<Integer, List<Integer>> generateMapOfResult() {
        Map<Integer, List<Integer>> resultMap = new HashMap<Integer, List<Integer>>();
        List<Result> resultList = getResultList();

        for (Result res: resultList) {
            if (resultMap.containsKey(res.getId())) {
                resultMap.get(res.getId()).add(res.getMarks());
            } else {
                List<Integer> marks = new LinkedList<Integer>();
                marks.add(res.getMarks());
                resultMap.put(res.getId(), marks);
            }
        }
        return resultMap;
    }

    private static List<Result> getResultList() {
        List<Result> resultList = new LinkedList<Result>();

        resultList.add(new Result(-1, 30));
        resultList.add(new Result(-1, 10));
        resultList.add(new Result(-1, 20));
        resultList.add(new Result(-1, 50));
        resultList.add(new Result(-1, 20));
        resultList.add(new Result(-1, 60));

        resultList.add(new Result(2, 110));
        resultList.add(new Result(2, 20));
        resultList.add(new Result(2, 130));
        resultList.add(new Result(2, 150));
        resultList.add(new Result(2, 110));
        resultList.add(new Result(2, 120));
        resultList.add(new Result(2, 120));

        return resultList;
    }

    private static List<Result> increaseMarksList() {
        List<Result> oldResultList = getResultList();
        return oldResultList.stream().map(r -> increaseMarks(r)).collect(Collectors.toList());
    }

    private static Result increaseMarks(Result result) {
        return new Result(result.getId(), result.getMarks()+10);
    }
}
