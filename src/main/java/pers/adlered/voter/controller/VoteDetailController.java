package pers.adlered.voter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.adlered.voter.domain.VoteDetail;
import pers.adlered.voter.domain.VoteDetailExample;
import pers.adlered.voter.service.VoteDetailMapper;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by han on 2020/2/20.
 */
@Controller
public class VoteDetailController {
    @Autowired
    VoteDetailMapper voteDetailMapper;
@RequestMapping("/showVote")
@ResponseBody
List<VoteDetail> showVote(HttpServletRequest request){
    VoteDetailExample voteDetailExample=new VoteDetailExample();
     voteDetailExample.clear();
     voteDetailExample.createCriteria().andIdEqualTo(1);
    List<VoteDetail> voteDetails= voteDetailMapper.selectByExample(voteDetailExample);
        return voteDetails ;
    }
}
