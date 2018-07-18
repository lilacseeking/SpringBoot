package org.lilacseeking.common.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user",schema = "common")
public class UserPO extends BaseModel{
    @Column(name = "username",unique = true,nullable = false,length = 15)
    private String username;
    @Column(name = "password",nullable = false,length = 32)
    private String password;
    @Column(name = "salt",nullable = false,length = 32)
    private String salt;
    @Column(name = "name",length = 32)
    private String name;
    @Column(name = "age")
    private Integer age;
    @Column(name = "gender")
    private Boolean gender;
    @Column(name = "mobile",unique = true,nullable = false,length = 11)
    private String mobile;
    @Column(name = "nativePlace",length = 200)
    private String nativePlace;
    @Column(name = "identityId",unique = true,nullable = false,length = 18)
    private String identityId;
}
