class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < bills.length; i++) {
            int curr = bills[i];
            if (hs.containsKey(curr)) {
                int t = hs.get(curr);
                t++;
                hs.put(curr, t);
            } else {
                hs.put(curr, 1);
            }

            if (curr == 10) {
                if (hs.containsKey(5)) {
                    int t = hs.get(5);
                    t--;
                    if (t == 0) {
                        hs.remove(5);
                    } else {
                        hs.put(5, t);
                    }
                } else {
                    return false;
                }
            } else if (curr == 20) {
                if (hs.containsKey(5) == false) {
                    return false;
                }

                int t = hs.get(5);
                if (hs.containsKey(10) == false) {
                    if (t < 3) {
                        return false;
                    } else {
                        t=t-3;

                        if (t < 0) {
                            hs.remove(5);
                        } else {
                            hs.put(5, t);
                        }

                    }
                } else {
                    int g = hs.get(10);

                    if (t >= 1 && g >= 1) {
                        t--;
                        g--;
                        if (t == 0) {
                            hs.remove(5);
                        } else {
                            hs.put(5, t);
                        }
                        if (g == 0) {
                            hs.remove(10);
                        } else {
                            hs.put(10, g);
                        }
                    }

                }

                //System.out.println(hs);

            }
        }

        return true;
    }
}