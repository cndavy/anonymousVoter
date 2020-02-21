package pers.adlered.voter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.adlered.voter.domain.Vote1;
import pers.adlered.voter.domain.Vote1Example;
import pers.adlered.voter.domain.VoteDetail;
import pers.adlered.voter.service.Vote1Mapper;
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
    @Autowired
    Vote1Mapper vote1Mapper;


@Transactional
@RequestMapping("/showVote")
@ResponseBody
List<Vote1> showVote(HttpServletRequest request){
//    VoteDetailExample voteDetailExample=new VoteDetailExample();
//    voteDetailExample.clear();
//    voteDetailExample.createCriteria().andIdEqualTo(1);
//    List<VoteDetail> voteDetails= voteDetailMapper.selectByVid(3);
    Vote1Example v1e=new Vote1Example();
    v1e.createCriteria().andVidEqualTo(3);
    List <Vote1> list=vote1Mapper.selectDetailByExample(v1e);
    VoteDetail voteDetail= voteDetailMapper.selectVoteByPrimaryKey(1);

//     voteDetails= voteDetailMapper.selectByExample(voteDetailExample);
        return list ;
    }

}
