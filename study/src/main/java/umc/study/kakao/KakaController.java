package umc.study.kakao;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/app/users")
@RequiredArgsConstructor
@RestController
public class KakaController {

    private final KakaoService kakaoService;

    @ResponseBody
    @GetMapping("/kakao")
    public void kakaoCallback(@RequestParam String code) {
        String access_Token = kakaoService.getKaKaoAccessToken(code);
        kakaoService.createKakaoUser(access_Token);
    }
}
