package ajaxTable.ajaxTable.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class GetController {

    @GetMapping("/get/member")
    public String getMembers(Model model) throws Exception { // /get/member로 호출 시 가상의 memberList를 작성하여 html에 전달

        Map<Integer, String> memberList = new HashMap<>(); // <회원번호, 회원이름>으로 구성된 가상의 멤버 리스트
        memberList.put(1, "킴오리");
        memberList.put(10, "킴엔탈");
        memberList.put(20, "리오리");
        memberList.put(200, "리엔탈");

        model.addAttribute("memberList", memberList);
        return "index :: memberTable"; // template 파일 이름 + '::' + 데이터가 변경 될 fragment id

    }
}
