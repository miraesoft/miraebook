package kr.miraesoft.miraebook.service;

import java.util.List;

import javax.inject.Inject;

import kr.miraesoft.miraebook.domain.Tag;
import kr.miraesoft.miraebook.repository.TagRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TagServiceImpl implements TagService {

	@Inject
	private TagRepository tagRepository;
	
	public List getTagList() {
		return tagRepository.getTagList();
	}

	public void addTag(Tag tag) {
		tagRepository.addTag(tag);
	}

	public Tag getTag(Integer id) {
		return tagRepository.getTag(id);
	}

	public void updateTag(Tag tag) {
		tagRepository.updateTag(tag);
	}

	public void deleteTag(Tag tag) {
		tagRepository.deleteTag(tag);
	}

	
}
