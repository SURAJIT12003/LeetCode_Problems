class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public void rec(int index, int row, List<Integer> s) {
        if (index == row) {
            return;
        }
        List<Integer> arr = new ArrayList<>();
        arr.add(s.get(0));
        for (int i = 1; i < s.size(); i++) {
            int t = s.get(i) + s.get(i - 1);
            arr.add(t);
        }
        arr.add(s.get(s.size() - 1));
        ans.add(arr);
        rec(index + 1, row, arr);
    }

    public List<List<Integer>> generate(int numRows) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        ans.add(arr);
        if (numRows == 1) {
          
            return ans;
        }
        rec(1,numRows,arr);
        return ans;
    }
}