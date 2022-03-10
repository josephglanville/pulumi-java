// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceProfileResult {
    /**
     * The Amazon Resource Name (ARN) specifying the instance profile.
     * 
     */
    private final String arn;
    /**
     * The string representation of the date the instance profile
     * was created.
     * 
     */
    private final String createDate;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    /**
     * The path to the instance profile.
     * 
     */
    private final String path;
    /**
     * The role arn associated with this instance profile.
     * 
     */
    private final String roleArn;
    /**
     * The role id associated with this instance profile.
     * 
     */
    private final String roleId;
    /**
     * The role name associated with this instance profile.
     * 
     */
    private final String roleName;

    @OutputCustomType.Constructor
    private GetInstanceProfileResult(
        @OutputCustomType.Parameter("arn") String arn,
        @OutputCustomType.Parameter("createDate") String createDate,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("path") String path,
        @OutputCustomType.Parameter("roleArn") String roleArn,
        @OutputCustomType.Parameter("roleId") String roleId,
        @OutputCustomType.Parameter("roleName") String roleName) {
        this.arn = arn;
        this.createDate = createDate;
        this.id = id;
        this.name = name;
        this.path = path;
        this.roleArn = roleArn;
        this.roleId = roleId;
        this.roleName = roleName;
    }

    /**
     * The Amazon Resource Name (ARN) specifying the instance profile.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The string representation of the date the instance profile
     * was created.
     * 
    */
    public String getCreateDate() {
        return this.createDate;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    /**
     * The path to the instance profile.
     * 
    */
    public String getPath() {
        return this.path;
    }
    /**
     * The role arn associated with this instance profile.
     * 
    */
    public String getRoleArn() {
        return this.roleArn;
    }
    /**
     * The role id associated with this instance profile.
     * 
    */
    public String getRoleId() {
        return this.roleId;
    }
    /**
     * The role name associated with this instance profile.
     * 
    */
    public String getRoleName() {
        return this.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String createDate;
        private String id;
        private String name;
        private String path;
        private String roleArn;
        private String roleId;
        private String roleName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createDate = defaults.createDate;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.roleArn = defaults.roleArn;
    	      this.roleId = defaults.roleId;
    	      this.roleName = defaults.roleName;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setCreateDate(String createDate) {
            this.createDate = Objects.requireNonNull(createDate);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleId(String roleId) {
            this.roleId = Objects.requireNonNull(roleId);
            return this;
        }

        public Builder setRoleName(String roleName) {
            this.roleName = Objects.requireNonNull(roleName);
            return this;
        }
        public GetInstanceProfileResult build() {
            return new GetInstanceProfileResult(arn, createDate, id, name, path, roleArn, roleId, roleName);
        }
    }
}
