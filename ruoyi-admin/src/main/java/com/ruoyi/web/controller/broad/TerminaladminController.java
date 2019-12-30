package com.ruoyi.web.controller.broad;

import java.util.List;

import jdk.nashorn.internal.ir.Terminal;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.broad.domain.Terminals;
import com.ruoyi.broad.service.ITerminalsService;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.utils.ExcelUtil;

/**
 * 终端管理员信息
 *
 * @author 薛莎莎
 * @date 2019-12-29
 */
@Controller
@RequestMapping("/broad/terminaladmin")
public class TerminaladminController extends BaseController{
    private String prefix = "broad/terminaladmin";

    @Autowired
    private ITerminalsService terminalsService;

//   @RequiresPermissions("broad:terminaladmin:view")
    @GetMapping()
    public String terminaladmin()
    {
        return prefix + "/terminaladmin";
    }

    /**
     * 查询广播用户列表
     */
//    @RequiresPermissions("broad:terminaladmin:view")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Terminals terminals)
    {
        startPage();
        List<Terminals> list = terminalsService.selectTerminalsList(terminals);
        return getDataTable(list);
    }



    /**
     * 导出广播用户列表
     */
    @RequiresPermissions("broad:terminaladmin:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Terminals terminals)
    {
        List<Terminals> list = terminalsService.selectTerminalsList(terminals);
        ExcelUtil<Terminals> util = new ExcelUtil<Terminals>(Terminals.class);
        return util.exportExcel(list, "terminaladmin");
    }

    /**
     * 修改广播用户
     */
    @GetMapping("/edit/{tid}")
    public String edit(@PathVariable("tid") String tid, ModelMap mmap)
    {
        Terminals terminals = terminalsService.selectTerminalsById(tid);
        mmap.put("terminaladmin", terminals);
        return prefix + "/edit";
    }

    /**
     * 修改保存广播用户
     */
    @RequiresPermissions("broad:terminaladmin:edit")
    @Log(title = "终端管理员", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Terminals terminals)
    {
        return toAjax(terminalsService.updateTerminals(terminals));
    }

    /**
     * 删除广播用户
     */
    @RequiresPermissions("broad:terminaladmin:remove")
    @Log(title = "终端管理员", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String tids)
    {
        return toAjax(terminalsService.deleteTerminalsByIds(tids));
    }

//	/**
//	 * 新增广播用户
//	 */
//	@Log(title = "广播用户", businessType = BusinessType.INSERT)
//	@PostMapping("/add")
//	@ResponseBody
//	public void add()
//	{
//		broaduserService.insertBroaduser();
//	}
}
