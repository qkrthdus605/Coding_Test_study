package week02;

class SkillTree {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(int i = 0; i < skill_trees.length; i++){
            // skill에 해당하지 않는 문자 제거
            skill_trees[i] = skill_trees[i].replaceAll(skill, "");
            // skill과 skill_tree[i]의 순서 비교
            int n = skill.compareTo(skill_trees[i]);
        }
        return answer;
    }
}

