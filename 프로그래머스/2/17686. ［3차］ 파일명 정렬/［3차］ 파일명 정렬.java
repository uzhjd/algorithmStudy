import java.util.*;

class Solution {
    
    static class File {
        String file_name;
        String head;
        int number;
        
        public File(String file_name, String head, int number) {
            this.file_name = file_name;
            this.head = head;
            this.number = number;
        }
    }
    
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        File[] splitFile = new File[files.length];
        
        // 파일 분리 성공
        for(int i = 0; i < files.length; i++) { 
            splitFile[i] = seperate(files[i]); // filename, head, number
        }
        
        // 정렬 (head 비교 -> number 비교)
        Arrays.sort(splitFile, new Comparator<File>(){
            @Override
            public int compare(File o1, File o2) {
                if((o1.head).equals(o2.head))
                    return o1.number - o2.number;
                else
                    return (o1.head).compareTo(o2.head);
            }
        });
        
        for(int i = 0; i < files.length; i++) {
            System.out.print(splitFile[i].head + splitFile[i].number + "\n");
        }
        
        // 값 넣기
        for(int i = 0; i < files.length; i++) { 
            answer[i] = splitFile[i].file_name;
        }
        
        return answer;
    }
    
    public File seperate(String file) {
        String head = "";
        String number = "";
        boolean check = true;
        
        for(int i = 0; i < file.length(); i++) {
            char c = file.charAt(i);
            
            if(!Character.isDigit(c)) {
                if(check) {
                    head += file.charAt(i);
                } else {
                    break;
                }
            } else if(Character.isDigit(c)) {
                number += file.charAt(i);
                check = false;
            }
        }
        
        File sep = new File(file, head.toLowerCase(), Integer.parseInt(number));
        
        return sep;
    }
}