class Solution {
    public String solution(String new_id) {
        new_id = toLowerCase(new_id);
        new_id = toClean(new_id);
        new_id = slicingDot(new_id);
        new_id = replaceA(new_id);
        new_id = slicingToFifteen(new_id);
        new_id = repeatLastChar(new_id);
        
        return new_id;
    }

    public String toLowerCase(String str) {
        return str.toLowerCase();
    }

    public String toClean(String str) {
        String newStr = str.replaceAll("[^a-z0-9-_.]", "")
                .replaceAll("[.]{2,}", ".");

        return newStr;
    }

    public String replaceA(String str) {
        if (str.equals("")) {
            str = "a";
        }

        return str;
    }

    public String slicingDot(String str) {
        return str.replaceAll("^[.]|[.]$", "");
    }

    public String slicingToFifteen(String str) {
        if (str.length() > 15) {
            str = str.substring(0, 15);
            str = slicingDot(str);
        }

        return str;
    }

    public String repeatLastChar(String str) {
        if (str.length() < 3) {
            StringBuilder sb = new StringBuilder(str);
            String substring = str.substring(str.length() - 1);
            while (sb.length() < 3) {
                sb.append(substring);
            }
            str = sb.toString();
        }

        return str;
    }
}