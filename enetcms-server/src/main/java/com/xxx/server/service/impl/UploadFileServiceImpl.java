package com.xxx.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxx.server.mapper.UploadFileMapper;
import com.xxx.server.pojo.RespBean;
import com.xxx.server.pojo.UploadFile;
import com.xxx.server.service.IUploadFileService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created with IntelliJ IDEA
 * User: WalWarS
 * Date: 2021/6/8 0008
 * Time: 11:30
 * Description: 上传文件服务实现类
 */
@Service
public class UploadFileServiceImpl extends ServiceImpl<UploadFileMapper, UploadFile> implements IUploadFileService {

    @Value("${pro.uploadPath}")
    private String uploadPath;

    //public final static String UPLOAD_PATH_PREFIX = "src/main/resources/static";  // 保存的路径
    public final static String UPLOAD_PATH_PREFIX = "enetcms-server/target/classes/static";

    /**
     * 获取文件路径
     * @param request 请求体
     * @param fileName 文件名称
     * @return 文件路径
     */
    public String getUploadPath(HttpServletRequest request, String fileName) {
        return request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + uploadPath + "/" + fileName;
    }


    /**
     *
     * @param multipartFile
     * @param request
     * @return
     */
    @Override
    public RespBean upload(MultipartFile multipartFile, HttpServletRequest request) {
        Map<String, Object> map = new HashMap();
        if (multipartFile.isEmpty()) {
            return RespBean.error("文件不能为空");
        }

        // 获取文件名
        String fileName = multipartFile.getOriginalFilename();
        if ("".equals(fileName)) {
            return RespBean.error("文件名不能为空");
        }
        System.out.println("上传文件原始的名字: " + fileName);

        // 允许的上传后缀
        String[] suffix_rule = {".xlsx",".xls",".doc",".ppt",".pptx", ".docx",".jpg",".png",".jpeg",".dmp",".rzr","zip",".7z",".mp4",".mp3",".avi",".flv"};
        String suffix = fileName.substring(fileName.lastIndexOf("."), fileName.length());
        if (!Arrays.asList(suffix_rule).contains(suffix)){
            return RespBean.error("格式不后缀允许");
        }
        // 使用uuid生成新文件名
        String newFileName = UUID.randomUUID().toString().replaceAll("-", "") + suffix;
        System.out.println("保存的文件的新名字: " + newFileName);

        // 获取年月日的日期格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        String format = simpleDateFormat.format(new Date());

        // 生成以日期分割的文件路径
        File readPath = new File(UPLOAD_PATH_PREFIX + uploadPath + File.separator + format);
        System.out.println("存放的文件夹: " + readPath);
        System.out.println("存放文件的绝对路径: " + readPath.getAbsolutePath());
        // 判断文件夹是否存在
        if (!readPath.exists()) {
            // 创建文件夹
            readPath.mkdirs();
        }

        // 文件真实的保存路径
        File file = new File(readPath.getAbsolutePath() + File.separator + newFileName);
        try {
            multipartFile.transferTo(file);
            // 获取存储路径
            String filePath = getUploadPath(request, format + "/" + newFileName);
            map.put("url", filePath);
            map.put("name", fileName);
        } catch (MaxUploadSizeExceededException e) {
            return RespBean.error("上传失败", e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            return RespBean.error("上传失败", e.getMessage());
        }
        return RespBean.success("上传成功", map);
    }

    @Override
    public RespBean uploads(HttpServletRequest request) {
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
        //Map<String, String> file_url = new HashMap<String, String>();
        for (MultipartFile file : files) {
            if (file.isEmpty()) {
                return RespBean.error(file.getOriginalFilename() + "上传失败");
            }

            File readPath = new File(UPLOAD_PATH_PREFIX + uploadPath + File.separator + "temps");
            System.out.println("多文件上传的位置: " + readPath);
            System.out.println("多文件上传的绝对路径: " + readPath.getAbsolutePath());
            if (!readPath.isDirectory()) {
                readPath.mkdirs();
            }

            File dest = new File(readPath.getAbsolutePath() + File.separator + file.getOriginalFilename());
            try {
                file.transferTo(dest);
            } catch (IOException e) {
                e.printStackTrace();
                return RespBean.error(file.getOriginalFilename() + "上传失败");
            }
        }

        return RespBean.success("上传成功");
    }

    /*
    @Override
    public RespBean upload(MultipartFile file) throws FileNotFoundException {
        if (file.isEmpty()) {
            return RespBean.error("上传文件不得为空");
        }
        String OriginalFilename = file.getOriginalFilename();
        String fileName = System.currentTimeMillis()+"."+OriginalFilename.substring(OriginalFilename.lastIndexOf(".")+1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd/");
        String format = sdf.format(new Date());
        String filePath = ResourceUtils.getURL("classpath:").getPath()+"static/upload/"+format;
        File dest = new File(filePath+fileName);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdir();
        }
        try{
            file.transferTo(dest);
        } catch (Exception e) {
            e.printStackTrace();
            RespBean.error(OriginalFilename+"上传失败");
        }
        Map<String, String> callback = new HashMap<String, String>();
        callback.put("file_url", filePath+fileName);
        return RespBean.success("上传成功", callback);
    }*/
}
