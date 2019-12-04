package com.yi.easyfind.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.util.*;

@Data
@TableName("user")
public class SysUser implements UserDetails {
    @TableId(value = "id", type = IdType.UUID)
    private String id;
    private String phone;
    private String password;
    private String identity;

    public SysUser() {
        super();
    }

    public SysUser(String id, String phone, String password, String identity, Collection<? extends GrantedAuthority> authorities) {
        if (phone != null && !"".equals(phone) && password != null) {
            this.id = id;
            this.phone = phone;
            this.password = password;
            this.identity = identity;
            this.authorities = Collections.unmodifiableSet(sortAuthorities(authorities));
        }else{
            throw new IllegalArgumentException("Cannot pass null or empty values to constructor");
        }
    }

    /**
     * 角色
     */
    @JsonIgnore
    @TableField(exist = false)
    private Set<GrantedAuthority> authorities;

    /**
     * 账号是否未过期，默认是false，记得要改一下
     */
    @JsonIgnore
    @TableField(exist = false)
    private final boolean accountNonExpired = true;
    /**
     *账号是否未锁定，默认是false，记得也要改一下
     */
    @JsonIgnore
    @TableField(exist = false)
    private final boolean accountNonLocked = true;
    /**
     *账号凭证是否未过期，默认是false，记得还要改一下
     */
    @JsonIgnore
    @TableField(exist = false)
    private final boolean credentialsNonExpired = true;
    /**
     *是否启用
     */
    @JsonIgnore
    @TableField(exist = false)
    private final boolean enabled = true;


    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = Collections.unmodifiableSet(sortAuthorities(authorities));
    }

    private static SortedSet<GrantedAuthority> sortAuthorities(Collection<? extends GrantedAuthority> authorities) {
        Assert.notNull(authorities, "Cannot pass a null GrantedAuthority collection");
        SortedSet<GrantedAuthority> sortedAuthorities = new TreeSet(new SysUser.AuthorityComparator());
        Iterator var2 = authorities.iterator();

        while(var2.hasNext()) {
            GrantedAuthority grantedAuthority = (GrantedAuthority)var2.next();
            Assert.notNull(grantedAuthority, "GrantedAuthority list cannot contain any null elements");
            sortedAuthorities.add(grantedAuthority);
        }

        return sortedAuthorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getUsername() {
        return phone;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    private static class AuthorityComparator implements Comparator<GrantedAuthority>, Serializable {
        private static final long serialVersionUID = 510L;

        private AuthorityComparator() {
        }
        @Override
        public int compare(GrantedAuthority g1, GrantedAuthority g2) {
            if (g2.getAuthority() == null) {
                return -1;
            } else {
                return g1.getAuthority() == null ? 1 : g1.getAuthority().compareTo(g2.getAuthority());
            }
        }
    }
}
