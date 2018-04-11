package cn.antswl.leetcode.algorithms.subdomainVisitCount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Subdomain Visit Count
 *
 * Problem Source: https://leetcode.com/problems/subdomain-visit-count/description/
 *
 * @author david-liu
 * @date April 10, 2018
 */
public class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[] strs = cpdomain.split(" ");
            int domainCount = Integer.valueOf(strs[0]);
            String domain = strs[1];
            int startIndex = 0, domainEndIndex = domain.length();
            do {
                String temp = domain.substring(startIndex, domainEndIndex);
                resultMap.put(temp, resultMap.getOrDefault(temp, 0) + domainCount);
                startIndex = domain.indexOf(".", startIndex) + 1;
            } while (startIndex != 0);
        }

        List<String> ret = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            ret.add(String.format("%d %s", entry.getValue(), entry.getKey()));
        }
        return ret;
    }
}
