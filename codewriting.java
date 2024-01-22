   import java.util.*;
    import java.util.regex.*;
public class codewriting {

    
        public static String[] solution(String[] members, String[] messages) {
            Map<String, Integer> mentionCount = new HashMap<>();
    
            for (String message : messages) {
                Matcher matcher = Pattern.compile("@id(\\d+)").matcher(message);
                Set<String> mentionedUsers = new HashSet<>();
                
                while (matcher.find()) {
                    mentionedUsers.add(matcher.group(1));
                }
    
                for (String userId : mentionedUsers) {
                    mentionCount.put(userId, mentionCount.getOrDefault(userId, 0) + 1);
                }
            }
    
            UserMention[] userMentions = new UserMention[members.length];
            for (int i = 0; i < members.length; i++) {
                String userId = members[i].substring(2);
                int count = mentionCount.getOrDefault(userId, 0);
                userMentions[i] = new UserMention(userId, count);
            }
    
            Arrays.sort(userMentions, (a, b) -> {
                if (a.count == b.count) {
                    return a.userId.compareTo(b.userId);
                } else {
                    return b.count - a.count;
                }
            });
    
            String[] result = new String[members.length];
            for (int i = 0; i < members.length; i++) {
                result[i] = userMentions[i].toString();
            }
    
            return result;
        }
    
        static class UserMention {
            String userId;
            int count;
    
            UserMention(String userId, int count) {
                this.userId = userId;
                this.count = count;
            }
    
            @Override
            public String toString() {
                return "id" + userId + "-" + count;
            }
        }
    }
    
    

    

