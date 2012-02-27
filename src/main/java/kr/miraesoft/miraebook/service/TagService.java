package kr.miraesoft.miraebook.service;

import java.util.List;

import kr.miraesoft.miraebook.domain.Tag;

public interface TagService {

	List getTagList();

	void addTag(Tag tag);

	Tag getTag(Integer id);

	void updateTag(Tag tag);

	void deleteTag(Tag tag);

}
