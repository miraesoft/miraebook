package kr.miraesoft.miraebook.repository;

import java.util.List;

import kr.miraesoft.miraebook.domain.Tag;

public interface TagRepository {

	Integer addTag(Tag tag);

	Tag getTag(Integer id);

	void updateTag(Tag tag);

	void deleteTag(Tag tag);

	List getTagList();

}
