package com.fable.shiro.domain;

import javax.persistence.*;

/**
 * Created by Administrator on 2016/12/5 0005.
 */
@Entity
@Table(name = "t_permission")
public class Permission {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	/** 权限名称 */
	private String permissionname;

	/** 描述 */
	private String description;

	/** 多方拥有一方引用 */
//	@ManyToOne
//	@JoinTable(name = "t_role_permission", joinColumns = {@JoinColumn(name = "role_id")}, inverseJoinColumns = {@JoinColumn(name = "permission_id")})
//	private Role role;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPermissionname() {
		return permissionname;
	}

	public void setPermissionname(String permissionname) {
		this.permissionname = permissionname;
	}

//	public Role getRole() {
//		return role;
//	}
//
//	public void setRole(Role role) {
//		this.role = role;
//	}
}
