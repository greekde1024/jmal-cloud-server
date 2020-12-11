package com.jmal.clouddisk.service;

import com.jmal.clouddisk.model.*;
import com.jmal.clouddisk.util.ResponseResult;

import java.util.List;

/**
 * @author jmal
 * @Description 文档
 * @Date 2020/12/11 4:36 下午
 */
public interface IMarkdownService {
    /***
     * 获取markdown内容
     * @param articleDTO
     * @return
     */
    ResponseResult<Object> getMarkDownContent(ArticleDTO articleDTO);

    /***
     * 获取文章列表
     * @param page page
     * @param pageSize pageSize
     * @return Page
     */
    Page<Object> getArticles(Integer page, Integer pageSize);

    /***
     * 获取文章列表
     * @param page page
     * @param pageSize pageSize
     * @param categoryId categoryId
     * @return Page
     */
    Page<Object> getArticlesByCategoryId(Integer page, Integer pageSize, String categoryId);

    /***
     * 获取文章列表
     * @param page page
     * @param pageSize pageSize
     * @param categoryId tagId
     * @return Page
     */
    Page<Object> getArticlesByTagId(int page, int pageSize, String tagId);

    /***
     * 归档
     * @param page page
     * @param pageSize pageSize
     * @return Page
     */
    Page<Object> getArchives(Integer page, Integer pageSize);

    /***
     * 根据缩略名获取markdown内容
     * @param slug
     * @return
     */
    FileDocument getMarkDownContentBySlug(String slug);

    /***
     * 修改文档排序
     * @param fileId
     * @return
     */
    ResponseResult<Object> sortMarkdown(List<String> fileId);

    /***
     * 编辑文档
     * @param upload
     * @return
     */
    ResponseResult<Object> editMarkdown(ArticleParamDTO upload);

    /***
     * 删除草稿
     * @param fileId fileId
     * @param username username
     * @return ResponseResult
     */
    ResponseResult<Object> deleteDraft(String fileId, String username);

    /***
     * 编辑文档(根据path)
     * @param upload
     * @return
     */
    ResponseResult<Object> editMarkdownByPath(UploadApiParamDTO upload);

    /***
     * 上传文档里的图片
     * @param upload
     * @return
     * @throws CommonException
     */
    ResponseResult<Object> uploadMarkdownImage(UploadImageDTO upload);
}