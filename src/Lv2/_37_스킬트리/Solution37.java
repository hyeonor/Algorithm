package Lv2._37_스킬트리;

public class Solution37 {

    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String skill_tree : skill_trees) {
            String skillTemp = skill_tree.replaceAll("[^" + skill + "]", "");

            if(skill.startsWith(skillTemp))
                answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution37 s = new Solution37();

        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

        System.out.println(s.solution("CBD", skill_trees));
    }
}
